# Lists and ArrayList

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
- `ArrayList` is a class: it provides those operations using a resizable array.
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

Do not structurally modify a list with `add` or `remove` inside an enhanced
`for` loop. To remove elements according to a condition, prefer `removeIf`:

```java
numbers.removeIf(number -> number < 0);
```

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

## When to use an array or an ArrayList

Choose an array when the size is fixed, primitive storage is useful, or an API
specifically requires an array. Choose an `ArrayList` for a general-purpose
ordered collection whose size may change.

`ArrayList` is usually the best first list implementation. It provides fast
indexed access and fast appending in normal use. Inserting or removing near the
beginning requires later elements to shift, so another data structure may be a
better fit when that is the program's main operation.

## Common mistakes

- Using `list.length` instead of `list.size()`.
- Writing `list[index]` instead of `list.get(index)` or `list.set(index, value)`.
- Assuming every list is mutable.
- Trying to use a primitive type such as `List<int>`.
- Confusing `remove(index)` with `remove(value)` on a `List<Integer>`.
- Using `i <= list.size()` instead of `i < list.size()`.
- Adding or removing elements during an enhanced `for` loop.
- Expecting assignment or a shallow copy to duplicate mutable element objects.

## Practice

Work through the [list exercises](tasks/Tasks.md). They progress from adding,
removing, merging, and rearranging elements to command-driven list manipulation
and more involved simulations.
