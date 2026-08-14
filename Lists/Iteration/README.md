# Iterating over lists

Complete [List basics](../Basics/README.md) first. This section compares the
iteration tools and then explains when direct access to an iterator is useful.

## Indexed and enhanced loops

Use an indexed loop when the index is needed or elements must be replaced:

```java
import java.util.ArrayList;
import java.util.List;

List<Integer> numbers = new ArrayList<>(List.of(2, 4, 6));

for (int i = 0; i < numbers.size(); i++) {
    numbers.set(i, numbers.get(i) * 2);
}
```

Use an enhanced `for` loop when only the values are needed:

```java
int sum = 0;

for (int number : numbers) {
    sum += number;
}
```

Do not add or remove elements through the list while an enhanced `for` loop is
using it. The iterator in the next section provides a safe way to remove
elements during traversal.

## Iterator

An **iterator** is an object that visits the elements of a collection one at a
time. It keeps track of the traversal position; it does not make a copy of the
elements.

Call `iterator()` on a list to obtain an `Iterator`:

```java
import java.util.Iterator;
import java.util.List;

List<String> names = List.of("Ana", "Ben", "Cora");
Iterator<String> iterator = names.iterator();

while (iterator.hasNext()) {
    String name = iterator.next();
    System.out.println(name);
}
```

The two main methods work together:

- `hasNext()` reports whether another element is available.
- `next()` returns that element and advances the iterator.

Call `hasNext()` before `next()`. Calling `next()` after the final element
throws a `NoSuchElementException`. An exhausted iterator does not restart;
call `names.iterator()` again when another traversal is needed.

For a list, an enhanced `for` loop uses an iterator internally. Use the
enhanced loop when only the values are needed. Work with an iterator directly
when its additional operation, such as safe removal, is required.

### Removing elements during iteration

Removing an element directly from a list while iterating over it breaks the
iterator's traversal. For example, do not write `tasks.remove(task)` inside an
enhanced `for` loop.

An iterator can instead remove the last element returned by `next()`:

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

List<String> tasks = new ArrayList<>(
        List.of("study", "", "practice", "")
);

Iterator<String> iterator = tasks.iterator();

while (iterator.hasNext()) {
    String task = iterator.next();

    if (task.isBlank()) {
        iterator.remove();
    }
}

System.out.println(tasks); // [study, practice]
```

Notice that the code calls `iterator.remove()`, not `tasks.remove(...)`. The
iterator then knows about the size change and can keep its position correctly.

An iterator's `remove()` method:

- removes the last element returned by `next()`;
- can be called only once for each successful call to `next()`; and
- is optional, so it throws `UnsupportedOperationException` when the
  underlying collection does not support removal.

For example, an iterator obtained from `List.of(...)` cannot remove elements
because that list is unmodifiable. Use a mutable list such as an `ArrayList`
when removal is required.

Adding or removing elements directly through a general-purpose list while one
of its iterators is active is usually detected and causes a
`ConcurrentModificationException`. Despite its name, this exception can occur
in a program with only one thread. This detection is a best-effort way to find
bugs, so a program must not depend on the exception being thrown. Prevent the
invalid modification instead.

After [lambda expressions](../../LambdaExpressions/README.md) have been
covered, `removeIf` provides a shorter way to express the same conditional
removal:

```java
tasks.removeIf(task -> task.isBlank());
```

The iterator form is useful first because it makes the traversal and removal
steps explicit.

## ListIterator

`ListIterator` extends `Iterator` with operations that make sense specifically
for an ordered, indexed list. It can move in both directions, report nearby
indexes, and replace or insert elements during traversal.

Obtain one by calling `listIterator()`:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

List<String> words = new ArrayList<>(List.of("cat", "teh", "dog"));
ListIterator<String> iterator = words.listIterator();

while (iterator.hasNext()) {
    String word = iterator.next();

    if (word.equals("cat")) {
        iterator.add("and");
    } else if (word.equals("teh")) {
        iterator.set("the");
    }
}

System.out.println(words); // [cat, and, the, dog]
```

Here `add("and")` inserts at the iterator's cursor position. The newly added
element is behind the cursor, so this forward traversal does not visit it.
`set("the")` replaces the last element returned by `next()`.

### The cursor position

A `ListIterator` does not point at a current element. Its **cursor** sits
between elements. A three-element list has four possible cursor positions:

```text
              A       B       C
cursor:   ^       ^       ^       ^
```

Starting at the first cursor position, `next()` crosses `A`, returns it, and
moves the cursor to the position after `A`. From there, `previous()` crosses
`A` in the other direction and returns it again. This explains why alternating
calls to `next()` and `previous()` can return the same element repeatedly.

The direction and position methods are:

| Method | Meaning |
| --- | --- |
| `hasNext()` | Whether an element is available to the right of the cursor |
| `next()` | Return that element and move the cursor forward |
| `hasPrevious()` | Whether an element is available to the left of the cursor |
| `previous()` | Return that element and move the cursor backward |
| `nextIndex()` | Index that `next()` would return, or `size()` at the end |
| `previousIndex()` | Index that `previous()` would return, or `-1` at the beginning |

To traverse backward, create the iterator with its cursor at the end of the
list:

```java
import java.util.List;
import java.util.ListIterator;

List<String> names = List.of("Ana", "Ben", "Cora");
ListIterator<String> iterator = names.listIterator(names.size());

while (iterator.hasPrevious()) {
    System.out.println(iterator.previous());
}
```

This prints `Cora`, `Ben`, and `Ana`. The position passed to `listIterator`
may range from `0` through `size()`. It is a cursor position, so `size()` is a
valid way to start just after the last element.

### Changing a list through ListIterator

`ListIterator` provides three optional modification operations:

- `remove()` removes the last element returned by `next()` or `previous()`.
- `set(value)` replaces the last element returned by `next()` or `previous()`.
- `add(value)` inserts at the cursor; it does not require a preceding call to
  `next()` or `previous()`.

Both `remove()` and `set()` need an element that was returned most recently.
Calling either one before `next()` or `previous()` throws an
`IllegalStateException`. Their sequencing rules also prevent some repeated
operations; for example, `remove()` cannot be called twice after one call to
`next()`. Calling `add()` resets which element counts as the most recently
returned one, so call `next()` or `previous()` again before using `remove()` or
`set()`.

As with a basic iterator, perform traversal-time changes through the
`ListIterator`, not directly through the list. Its modification methods throw
`UnsupportedOperationException` when the list does not support the requested
change.

## Choosing an iteration style

Choose the simplest tool that provides the control the program needs:

| Need | Suitable approach |
| --- | --- |
| Read each value | Enhanced `for` loop |
| Use an element's index | Indexed `for` loop |
| Remove selected elements during traversal | `Iterator` |
| Traverse a list backward | `ListIterator` |
| Insert or replace elements during traversal | `ListIterator` |

## Common mistakes

- Adding or removing elements directly through a list while an iterator is
  traversing it.
- Calling `Iterator.remove()` before `next()` or calling it twice for one
  element.
- Expecting an exhausted iterator to restart automatically.
- Assuming every iterator supports modification.

For complete API details, see the official Java 21 documentation for
[`Iterator`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Iterator.html)
and
[`ListIterator`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ListIterator.html).
