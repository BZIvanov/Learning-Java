# List basics

An array stores a fixed number of elements. A list keeps the same useful ideas—
ordered elements, zero-based indexes, and iteration—but can grow and shrink as
the program runs.

Complete the [Arrays](../../Arrays/README.md) section first. This chapter builds
on array indexing, loops, reference types, and copying.

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
- `ArrayList` is a class that provides those operations using an internal
  array.
- Declaring the variable using the interface keeps the code flexible.

Another implementation, `LinkedList`, is covered after the general list
concepts because most programs should begin with `ArrayList`.

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

numbers.remove(1);                   // removes index 1: the value 20
numbers.remove(Integer.valueOf(30)); // removes the value 30
```

Use `Integer.valueOf(number)` when the intention is to remove a value rather
than the element at that index.

## Common mistakes

- Using `list.length` instead of `list.size()`.
- Writing `list[index]` instead of `list.get(index)` or `list.set(index, value)`.
- Assuming every list is mutable.
- Trying to use a primitive type such as `List<int>`.
- Confusing `remove(index)` with `remove(value)` on a `List<Integer>`.
- Using `i <= list.size()` instead of `i < list.size()`.

Next, learn the available ways of [iterating over lists](../Iteration/README.md).

For complete API details, see the official Java 21 documentation for
[`List`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html)
and
[`ArrayList`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html).
