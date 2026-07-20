# The `do-while` Loop

The `do-while` loop is a type of loop that is similar to a `while` loop, but with one important difference:

> A `do-while` loop always executes its code block **at least once** before checking the condition.

This makes it useful when you want something to happen once before deciding whether the loop should continue.

---

# `do-while` Loop Syntax

A `do-while` loop has the following structure:

```java
do {
    // Code to repeat
} while (condition);
```

Notice that the condition is written **after** the code block.

The semicolon (`;`) after the `while` condition is required.

---

# A Simple Example

The following example prints numbers from `1` to `5`.

```java
int number = 1;

do {
    System.out.println(number);
    number++;
} while (number <= 5);
```

Output:

```text
1
2
3
4
5
```

At first glance, this looks very similar to a `while` loop.

The important difference is **when the condition is checked**.

---

# How a `do-while` Loop Works

Let's look at the execution order:

```java
int number = 1;

do {
    System.out.println(number);
    number++;
} while (number <= 3);
```

The loop executes like this:

| Step  | Value of `number` | Action                       |
| ----- | ----------------- | ---------------------------- |
| Start | `1`               | Execute loop body, print `1` |
| Next  | `2`               | Check condition, continue    |
| Next  | `2`               | Execute loop body, print `2` |
| Next  | `3`               | Check condition, continue    |
| Next  | `3`               | Execute loop body, print `3` |
| Next  | `4`               | Check condition, stop        |

Output:

```text
1
2
3
```

The key point is:

1. Execute the code inside the loop.
2. Check the condition.
3. Repeat if the condition is `true`.

---

# The Difference Between `while` and `do-while`

The biggest difference is what happens when the condition is false from the beginning.

A `while` loop:

```java
int number = 10;

while (number < 5) {
    System.out.println(number);
}
```

Output:

```text

```

Nothing happens because the condition is checked before the first iteration.

---

A `do-while` loop:

```java
int number = 10;

do {
    System.out.println(number);
} while (number < 5);
```

Output:

```text
10
```

The code runs once before checking the condition.

---

# A Common Use Case

A `do-while` loop is often useful when you need to perform an action first and then decide whether to repeat.

For example, asking a user for input:

```java
int choice;

do {
    System.out.println("Showing menu...");
    System.out.println("Choose an option:");

    // Read user input here

    choice = 0; // Example value

} while (choice != 0);
```

A menu usually needs to appear at least once, so a `do-while` loop can be a good fit.

---

# Updating the Loop Condition

Just like with `for` and `while` loops, you need to make sure the condition eventually becomes `false`.

Example:

```java
int number = 1;

do {
    System.out.println(number);
} while (number <= 5);
```

This creates an infinite loop because `number` never changes.

The corrected version:

```java
int number = 1;

do {
    System.out.println(number);
    number++;
} while (number <= 5);
```

Now the loop eventually stops.

---

# `do-while` vs `while`

| Loop       | When is the condition checked? | Minimum executions |
| ---------- | ------------------------------ | ------------------ |
| `while`    | Before the loop body           | 0 times            |
| `do-while` | After the loop body            | 1 time             |

---

# When Should You Use a `do-while` Loop?

A `do-while` loop is useful when:

- The code must execute at least once.
- You need to display a menu before getting a choice.
- You need to ask for input before checking if it is valid.
- The first iteration should happen regardless of the condition.
