# The `continue` Statement in Java

The `continue` statement is used to **skip the current iteration of a loop** and move to the next one.

Unlike `break`, which completely stops a loop, `continue` only skips the remaining code inside the current loop iteration.

The loop itself continues running.

---

# Basic Syntax

The `continue` statement is written as:

```java
continue;
```

It is usually used inside a conditional statement within a loop.

Example:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

When `i` becomes `3`, the `continue` statement runs.

The `System.out.println(i);` line is skipped for that iteration, and the loop continues with `i = 4`.

---

# How `continue` Works

Consider this example:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

The execution happens like this:

| Step | Value of `i` | Action                         |
| ---- | ------------ | ------------------------------ |
| 1    | `1`          | Print `1`                      |
| 2    | `2`          | Print `2`                      |
| 3    | `3`          | `continue` runs, skip printing |
| 4    | `4`          | Print `4`                      |
| 5    | `5`          | Print `5`                      |

Output:

```text
1
2
4
5
```

The loop does not stop when `continue` runs. It simply moves to the next iteration.

---

# `continue` vs `break`

The difference between `break` and `continue` is important:

| Statement  | What it does                                       |
| ---------- | -------------------------------------------------- |
| `break`    | Stops the entire loop                              |
| `continue` | Skips the current iteration and continues the loop |

Example:

Using `break`:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
```

The loop ends completely.

---

Using `continue`:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

The loop continues after skipping `3`.

---

# Common Use Case: Skipping Unwanted Values

A common use of `continue` is ignoring values that you don't want to process.

Example:

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 == 0) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
3
5
7
9
```

The condition:

```java
i % 2 == 0
```

checks if the number is even.

When the number is even, `continue` skips the printing step.

---

# `continue` with a `while` Loop

The `continue` statement also works with `while` loops.

Example:

```java
int number = 0;

while (number < 5) {

    number++;

    if (number == 3) {
        continue;
    }

    System.out.println(number);
}
```

Output:

```text
1
2
4
5
```

When `number` becomes `3`, the loop skips the print statement and moves to the next iteration.

---

# Be Careful With `while` Loops

When using `continue` with a `while` loop, make sure the loop variable is updated before the `continue` statement.

Example:

```java
int number = 1;

while (number <= 5) {

    if (number == 3) {
        continue;
    }

    number++;
}
```

This creates an infinite loop.

Why?

When `number` becomes `3`:

1. The condition is true.
2. `continue` runs.
3. The `number++` line is skipped.
4. `number` stays `3` forever.

A corrected version:

```java
int number = 1;

while (number <= 5) {

    number++;

    if (number == 3) {
        continue;
    }

    System.out.println(number);
}
```

The loop variable still changes, so the loop can finish.

---

# When Should You Use `continue`?

A `continue` statement is useful when:

- You want to skip certain values.
- Some data should be ignored.
- You want to avoid putting large sections of code inside an `if` statement.

For example:

Instead of:

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 != 0) {
        System.out.println(i);
    }
}
```

You can write:

```java
for (int i = 1; i <= 10; i++) {

    if (i % 2 == 0) {
        continue;
    }

    System.out.println(i);
}
```

Both achieve the same result.

---

# Summary

- The `continue` statement skips the current loop iteration.
- After `continue`, the loop moves to the next iteration.
- Unlike `break`, `continue` does not end the loop.
- `continue` is useful for ignoring unwanted values or skipping unnecessary work.
- Be careful when using `continue` in `while` loops to avoid infinite loops.
