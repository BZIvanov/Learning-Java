# Reading and converting lists

Complete [List basics](../Basics/README.md) first. This section shows common
ways to construct a list from console text or an array and to convert a list
back to an array.

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

This example is a useful input recipe. The stream operations and method
reference in it are explained fully in the later
[Streams](../../Streams/README.md) section.

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

Next, learn how assignment and copying affect
[list references](../ReferencesAndCopying/README.md).
