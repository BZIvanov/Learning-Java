# LinkedList and choosing a list type

Complete [List basics](../Basics/README.md) first. `LinkedList` provides the
same `List` operations using a different internal structure, but that does not
make every operation faster.

## Using LinkedList as a list

Code that uses only `List` operations looks almost the same as it does with an
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

## How its structure differs

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

## Operations at both ends

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
[Stack and Queue](../../StackAndQueue/README.md) section.

## Choosing between an array, ArrayList, and LinkedList

Choose an array when the size is fixed, primitive storage is useful, or an API
specifically requires an array. Choose an `ArrayList` for a general-purpose
ordered collection whose size may change.

`ArrayList` is usually the best first list implementation. It provides fast
indexed access, fast appending in normal use, and less per-element memory
overhead than a `LinkedList`.

Consider `LinkedList` when a program frequently adds or removes elements at the
beginning or end and also needs it specifically as a list. Avoid it for code
that repeatedly accesses elements by index. When unsure, begin with `ArrayList`
and change the implementation only when the program's operations show that
another structure is a better fit.

## Common mistake

Do not assume `LinkedList` makes every insertion or removal fast. An operation
that uses an index must still locate that position first.

For complete API details, see the official Java 21 documentation for
[`ArrayList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html)
and
[`LinkedList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/LinkedList.html).
