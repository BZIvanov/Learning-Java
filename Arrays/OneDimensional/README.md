# One-dimensional arrays

An array stores a fixed number of values of the same type. Use an array when you
know how many elements you need and want fast access to each element by its
position (index).

## Declaring and creating arrays

The preferred Java syntax places the brackets after the element type:

```java
int[] numbers;
```

Declaring a variable does not create an array. Create one with `new`, or use an
array initializer when the values are already known:

```java
int[] scores = new int[3];       // { 0, 0, 0 }
int[] primes = { 2, 3, 5, 7 };  // size is inferred as 4
String[] names = new String[] { "Ana", "Ben" };
```

An array's size cannot change after creation. Use an `ArrayList` when you need a
collection that can grow or shrink.

## Indexes and length

Indexes start at `0`, so the last valid index is always `length - 1`:

```java
String[] colors = { "red", "green", "blue" };

System.out.println(colors[0]);               // red
System.out.println(colors[colors.length - 1]); // blue

colors[1] = "yellow";
System.out.println(colors.length);            // 3
```

Accessing a negative index or an index greater than or equal to `length` throws
an `ArrayIndexOutOfBoundsException`.

## Default values

When an array is created with `new`, Java initializes every element:

| Element type | Default value |
| --- | --- |
| integer types (`byte`, `short`, `int`, `long`) | `0` |
| floating-point types (`float`, `double`) | `0.0` |
| `char` | `'\u0000'` |
| `boolean` | `false` |
| reference types (`String`, custom classes, other arrays) | `null` |

```java
int[] quantities = new int[3];       // { 0, 0, 0 }
boolean[] completed = new boolean[2]; // { false, false }
Person[] people = new Person[3];      // { null, null, null }
```

Creating `new Person[3]` creates space for three references; it does not create
three `Person` objects. Each object must be created separately before use.

## Iterating over an array

Use a regular `for` loop when you need the index or want to update elements:

```java
int[] numbers = { 2, 4, 6 };

for (int i = 0; i < numbers.length; i++) {
    numbers[i] *= 2;
}
```

Use an enhanced `for` loop when you only need to read each value:

```java
int sum = 0;

for (int number : numbers) {
    sum += number;
}
```

Assigning to the enhanced-loop variable does not change the array:

```java
for (int number : numbers) {
    number = 0; // changes only the local variable
}
```

## Reading an array from the console

A common exercise format provides space-separated integers on one line:

```java
import java.util.Arrays;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

int[] numbers = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
        .mapToInt(Integer::parseInt)
        .toArray();
```

`\\s+` accepts one or more whitespace characters, making the input more robust
than splitting only on a single space.

## Useful operations from `java.util.Arrays`

```java
import java.util.Arrays;

int[] numbers = { 4, 1, 3 };

System.out.println(Arrays.toString(numbers)); // [4, 1, 3]

Arrays.sort(numbers);                         // { 1, 3, 4 }
int[] copy = Arrays.copyOf(numbers, numbers.length);

System.out.println(Arrays.equals(numbers, copy)); // true
Arrays.fill(copy, 0);                             // { 0, 0, 0 }
```

For primitive arrays, `Arrays.toString(array)` prints the elements. Printing the
array variable directly does not produce a useful element list.

## Arrays are reference types

Assigning one array variable to another does not copy its elements. Both
variables refer to the same array:

```java
int[] original = { 1, 2, 3 };
int[] alias = original;

alias[0] = 99;
System.out.println(original[0]); // 99
```

Use `Arrays.copyOf` when you need an independent one-dimensional copy.

## Common mistakes

- Use `i < array.length`, not `i <= array.length`, in loop conditions.
- Remember that the first index is `0`, not `1`.
- Check an index before accessing the array.
- Compare array contents with `Arrays.equals`, not `==`.
- Remember that an array has a fixed length.
- Use `array.length` for arrays; strings and collections use methods such as
  `length()` and `size()`.

## Practice

Work through the exercises in [tasks/Tasks.md](tasks/Tasks.md). They progress
from basic indexing and traversal to rotations, sequence analysis, and
command-driven array manipulation.
