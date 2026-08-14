# List, ArrayList, and LinkedList

An array stores a fixed number of elements. A list keeps the same useful ideas—
ordered elements, zero-based indexes, and iteration—but can grow and shrink as
the program runs.

Complete the [Arrays](../Arrays/README.md) section first. This chapter builds on
array indexing, loops, reference types, and copying.

## From an array to a list

Suppose a program stores names but does not know in advance how many names it
will receive. An array requires a fixed length:

```java
String[] names = new String[3];
names[0] = "Ana";
```

An `ArrayList` manages its capacity internally and changes size when elements
are added or removed:

```java
import java.util.ArrayList;
import java.util.List;

List<String> names = new ArrayList<>();
names.add("Ana");
names.add("Ben");
names.add("Cora");
names.add("Dani"); // no new list needs to be created
```

The variable is usually declared as `List<String>` and the object is created as
an `ArrayList<>`:

- `List` is an interface: it describes the operations available to an ordered
  collection.
- `ArrayList` and `LinkedList` are classes that provide those operations using
  different internal structures.
- Declaring the variable using the interface keeps the code flexible.

## Arrays and lists compared

| Operation | Array | `List` / `ArrayList` |
| --- | --- | --- |
| Create | `new String[3]` | `new ArrayList<>()` |
| Number of elements | `array.length` | `list.size()` |
| Read by index | `array[index]` | `list.get(index)` |
| Replace by index | `array[index] = value` | `list.set(index, value)` |
| Add an element | not supported | `list.add(value)` |
| Remove an element | not supported | `list.remove(index)` |
| Check for a value | loop manually | `list.contains(value)` |

Both arrays and lists preserve insertion order, allow duplicate values, and use
indexes starting at `0`. Accessing an invalid list index throws an
`IndexOutOfBoundsException`.

## Element types and generics

The type inside angle brackets is the element type:

```java
List<String> cities = new ArrayList<>();
List<Double> prices = new ArrayList<>();
```

Generics work with reference types, not primitive types. Use the corresponding
wrapper class for primitive values:

| Primitive | List element type |
| --- | --- |
| `int` | `Integer` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

```java
List<Integer> scores = new ArrayList<>();
scores.add(10); // int is automatically boxed as Integer
int first = scores.get(0); // Integer is automatically unboxed as int
```

## Creating mutable and unmodifiable lists

Use `new ArrayList<>()` when the contents need to change:

```java
List<String> fruits = new ArrayList<>();
fruits.add("apple");

List<String> colors = new ArrayList<>(List.of("red", "green", "blue"));
colors.add("yellow");
```

`List.of(...)` creates an unmodifiable list. It can be read, but operations such
as `add`, `set`, and `remove` throw `UnsupportedOperationException`:

```java
List<String> days = List.of("Monday", "Tuesday");
System.out.println(days.get(0));
// days.add("Wednesday"); // UnsupportedOperationException
```

Unmodifiable is not a property of every `List`; it depends on how the list was
created.

## Reading, replacing, adding, and removing

```java
List<String> tasks = new ArrayList<>();

tasks.add("study");             // [study]
tasks.add("practice");          // [study, practice]
tasks.add(1, "take notes");     // [study, take notes, practice]

String first = tasks.get(0);    // study
tasks.set(2, "build project");  // replaces practice

tasks.remove(1);                // removes take notes
boolean removed = tasks.remove("missing task"); // false
```

The index for `get`, `set`, and `remove(index)` must be from `0` through
`size() - 1`. Inserting with `add(index, value)` also permits `index == size()`,
which appends the value.

Other useful methods include:

```java
boolean hasStudy = tasks.contains("study");
int position = tasks.indexOf("study"); // -1 if it is absent
boolean empty = tasks.isEmpty();
tasks.clear();
```

Printing a list directly displays its elements:

```java
System.out.println(List.of(2, 4, 6)); // [2, 4, 6]
```

## The `remove` trap with integer lists

`List<Integer>` has two relevant `remove` methods: one removes by index and the
other removes a matching value.

```java
List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));

numbers.remove(1);                  // removes index 1: the value 20
numbers.remove(Integer.valueOf(30)); // removes the value 30
```

Use `Integer.valueOf(number)` when the intention is to remove a value rather
than the element at that index.

## Iterating over a list

Use an indexed loop when the index is needed or elements must be replaced:

```java
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

After [lambda expressions](../LambdaExpressions/README.md) have been covered,
`removeIf` provides a shorter way to express the same conditional removal:

```java
numbers.removeIf(number -> number < 0);
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

## Reading a list from the console

A common exercise format contains space-separated integers on one line:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

List<Integer> numbers = new ArrayList<>(
        Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .toList()
);
```

The stream's `toList()` result is unmodifiable, so the example copies it into
an `ArrayList`. The resulting `numbers` list can be changed by the exercise.

## Converting between arrays and lists

Reference-type arrays can be copied into a mutable list:

```java
String[] colorArray = { "red", "green", "blue" };
List<String> colors = new ArrayList<>(Arrays.asList(colorArray));
```

Convert a list back to an array with `toArray`:

```java
String[] copy = colors.toArray(String[]::new);
```

Primitive arrays need a conversion step because `List<int>` is not a valid
type:

```java
int[] values = { 3, 1, 4 };
List<Integer> valuesList = Arrays.stream(values).boxed().toList();
```

Here `valuesList` is unmodifiable. Wrap it in `new ArrayList<>(...)` if it needs
to change.

## Lists are reference types

As with arrays, assigning a list variable does not copy its elements:

```java
List<String> original = new ArrayList<>(List.of("A", "B"));
List<String> alias = original;

alias.set(0, "changed");
System.out.println(original); // [changed, B]
```

Create a separate list when independent structure is needed:

```java
List<String> copy = new ArrayList<>(original);
```

This is a shallow copy. If the elements are mutable objects, both lists still
refer to the same objects.

Lists compare their contents with `equals`, so two different list objects can
be equal when they contain equal elements in the same order:

```java
List<Integer> first = List.of(1, 2, 3);
List<Integer> second = new ArrayList<>(first);

System.out.println(first.equals(second)); // true
```

## LinkedList

`LinkedList` is another mutable implementation of the `List` interface. Code
that uses only `List` operations looks almost the same as it does with an
`ArrayList`; only the created object changes:

```java
import java.util.LinkedList;
import java.util.List;

List<String> route = new LinkedList<>();

route.add("Sofia");
route.add("Plovdiv");
route.add(1, "Pazardzhik");

System.out.println(route.get(1)); // Pazardzhik
route.remove("Plovdiv");
System.out.println(route);        // [Sofia, Pazardzhik]
```

The same `add`, `get`, `set`, `remove`, `size`, and iteration rules apply
because both classes implement `List`.

### How its structure differs

An `ArrayList` stores its elements next to one another in an internal array. A
`LinkedList` stores each element in a separate node. Each node contains an
element and links to the node before and after it; this is called a
**doubly-linked list**.

This difference changes the work required by common operations:

| Operation | `ArrayList` | `LinkedList` |
| --- | --- | --- |
| Read or replace by index | Direct access | Walks through nodes to the index |
| Add at the end | Usually fast | Fast |
| Add or remove at the beginning | Shifts later elements | Changes a few links |
| Add or remove by index | Finds the index directly, then shifts elements | Walks to the index, then changes links |
| Memory per element | Lower overhead | Extra links are stored for every node |

This is why `LinkedList` is not automatically faster whenever a program adds
or removes elements. For example, `route.add(500, value)` must first walk to
index `500`. The method call is convenient, but locating that index still takes
work.

### Operations at both ends

A `LinkedList` can efficiently work with its first and last elements:

```java
LinkedList<String> waiting = new LinkedList<>();

waiting.addFirst("Ana");
waiting.addLast("Ben");

String first = waiting.getFirst();
String last = waiting.getLast();

waiting.removeFirst();
waiting.removeLast();
```

`getFirst`, `getLast`, `removeFirst`, and `removeLast` throw a
`NoSuchElementException` when the list is empty. Check `isEmpty()` first when an
empty list is possible.

`LinkedList` can also be used as a queue or a double-ended queue. Those uses and
their preferred method names are covered later in the
[Stack and Queue](../StackAndQueue/README.md) section.

## Choosing between an array, ArrayList, and LinkedList

Choose an array when the size is fixed, primitive storage is useful, or an API
specifically requires an array. Choose an `ArrayList` for a general-purpose
ordered collection whose size may change.

`ArrayList` is usually the best first list implementation. It provides fast
indexed access, fast appending in normal use, and less per-element memory
overhead than a `LinkedList`.

Consider `LinkedList` when a program frequently adds or removes elements at
the beginning or end and also needs it specifically as a list. Avoid it for
code that repeatedly accesses elements by index. When unsure, begin with
`ArrayList` and change the implementation only when the program's operations
show that another structure is a better fit.

For the complete API contracts, see the official Java 21 documentation for
[`List`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html),
[`ArrayList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html),
[`LinkedList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html),
[`Iterator`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Iterator.html),
and [`ListIterator`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ListIterator.html).

## Common mistakes

- Using `list.length` instead of `list.size()`.
- Writing `list[index]` instead of `list.get(index)` or `list.set(index, value)`.
- Assuming every list is mutable.
- Trying to use a primitive type such as `List<int>`.
- Confusing `remove(index)` with `remove(value)` on a `List<Integer>`.
- Using `i <= list.size()` instead of `i < list.size()`.
- Adding or removing elements directly through a list while an iterator is
  traversing it.
- Calling `Iterator.remove()` before `next()` or calling it twice for one
  element.
- Expecting an exhausted iterator to restart automatically.
- Assuming every iterator supports modification.
- Expecting assignment or a shallow copy to duplicate mutable element objects.
- Assuming `LinkedList` makes every insertion or removal fast, even when it
  must first find an index.

## Practice

Work through the [list exercises](tasks/Tasks.md). They progress from adding,
removing, merging, and rearranging elements to command-driven list manipulation
and more involved simulations.
