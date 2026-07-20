# Nested Loops in Java

A **nested loop** is a loop placed inside another loop.

The inner loop runs completely for **each iteration** of the outer loop.

Nested loops are useful when working with data that has multiple levels, such as:

- Rows and columns.
- Tables.
- Grids.
- Patterns.
- Comparing multiple values.

---

# Basic Structure

A nested loop has a structure like this:

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        System.out.println(i + ", " + j);

    }
}
```

Here:

- The **outer loop** controls the first level of repetition.
- The **inner loop** runs completely every time the outer loop runs.

---

# How Nested Loops Work

Consider this example:

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        System.out.println("i = " + i + ", j = " + j);

    }
}
```

The execution happens like this:

| Outer loop (`i`) | Inner loop (`j`) | Output         |
| ---------------- | ---------------- | -------------- |
| 1                | 1                | `i = 1, j = 1` |
| 1                | 2                | `i = 1, j = 2` |
| 1                | 3                | `i = 1, j = 3` |
| 2                | 1                | `i = 2, j = 1` |
| 2                | 2                | `i = 2, j = 2` |
| 2                | 3                | `i = 2, j = 3` |
| 3                | 1                | `i = 3, j = 1` |
| 3                | 2                | `i = 3, j = 2` |
| 3                | 3                | `i = 3, j = 3` |

The inner loop executes **three times for every single iteration** of the outer loop.

Since the outer loop runs 3 times and the inner loop runs 3 times each time:

```
3 × 3 = 9 total executions
```

---

# Printing Patterns

One of the most common beginner examples of nested loops is creating patterns.

Example:

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 5; column++) {

        System.out.print("* ");

    }

    System.out.println();
}
```

Output:

```text
* * * * *
* * * * *
* * * * *
```

The outer loop controls the number of rows.

The inner loop controls how many symbols appear in each row.

---

# Creating a Number Pattern

Nested loops can also create number patterns.

Example:

```java
for (int row = 1; row <= 5; row++) {

    for (int number = 1; number <= row; number++) {

        System.out.print(number + " ");

    }

    System.out.println();
}
```

Output:

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

The inner loop changes depending on the current value of the outer loop.

---

# Nested `while` Loops

Nested loops are not limited to `for` loops.

You can also nest `while` loops:

```java
int row = 1;

while (row <= 3) {

    int column = 1;

    while (column <= 3) {

        System.out.print("* ");

        column++;

    }

    System.out.println();

    row++;
}
```

Output:

```text
* * *
* * *
* * *
```

The same idea applies:

- Outer loop controls the bigger repetition.
- Inner loop handles the repeated action inside it.

---

# Using `break` in Nested Loops

When `break` is used inside a nested loop, it only exits the loop it belongs to.

Example:

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 3; column++) {

        if (column == 2) {
            break;
        }

        System.out.println(row + ", " + column);
    }
}
```

Output:

```text
1, 1
2, 1
3, 1
```

The `break` stops the inner loop, but the outer loop continues.

---

# Common Mistakes

## Making Loops Too Complex

Nested loops can become difficult to understand when there are too many levels.

For example:

```java
for (...) {
    for (...) {
        for (...) {
            for (...) {
                // difficult to follow
            }
        }
    }
}
```

Most programs only need one or two levels of nesting.

---

## Forgetting to Reset Variables

When using nested `while` loops, remember that the inner loop variable usually needs to be reset.

Example:

```java
int row = 1;
int column = 1;

while (row <= 3) {

    while (column <= 3) {
        column++;
    }

    row++;
}
```

The inner loop only runs once because `column` is never reset.

Correct approach:

```java
int row = 1;

while (row <= 3) {

    int column = 1;

    while (column <= 3) {
        column++;
    }

    row++;
}
```

---

# When Should You Use Nested Loops?

Nested loops are useful when you need to work with multiple dimensions of data.

Common examples:

- Printing tables.
- Working with two-dimensional arrays.
- Creating patterns.
- Comparing every item with every other item.
- Processing grids.
