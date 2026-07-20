# The `while` Loop

The `while` loop is used to repeat a block of code **as long as a condition is `true`**.

Unlike a `for` loop, a `while` loop is often used when you **don't know in advance** how many times the loop should execute.

For example, you might continue asking a user for input until they enter a valid value, or keep processing data until there is nothing left to process.

---

# `while` Loop Syntax

A `while` loop has the following structure:

```java
while (condition) {
    // Code to repeat
}
```

Before each iteration, Java checks the condition.

- If the condition is `true`, the code inside the loop executes.
- If the condition is `false`, the loop ends.

---

# A Simple Example

The following loop prints the numbers from `1` to `5`.

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
    number++;
}
```

Output:

```text
1
2
3
4
5
```

Notice that the variable `number` is declared **before** the loop, and it is updated **inside** the loop.

---

# How a `while` Loop Works

Let's look at the previous example step by step.

```java
int number = 1;

while (number <= 3) {
    System.out.println(number);
    number++;
}
```

The loop executes like this:

| Step  | Value of `number` | Condition          | Action    |
| ----- | ----------------- | ------------------ | --------- |
| Start | `1`               | `1 <= 3` → `true`  | Print `1` |
| Next  | `2`               | `2 <= 3` → `true`  | Print `2` |
| Next  | `3`               | `3 <= 3` → `true`  | Print `3` |
| Next  | `4`               | `4 <= 3` → `false` | Loop ends |

Output:

```text
1
2
3
```

---

# A `while` Loop Doesn't Need a Counter

Although many `while` loops use a counter, they don't have to.

For example, imagine a program that continues running until the user chooses to stop.

```java
boolean running = true;

while (running) {
    System.out.println("Program is running...");

    // More code here

    running = false;
}
```

Output:

```text
Program is running...
```

In a real program, the value of `running` might change based on user input or another condition.

---

# Common Mistakes

## Forgetting to Update the Condition

One of the most common mistakes is forgetting to change the value used in the loop condition.

Example:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
}
```

Since `number` never changes, the condition always remains `true`.

This creates an **infinite loop**.

To fix the problem:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
    number++;
}
```

---

## Starting With a False Condition

If the condition is already `false` before the loop begins, the loop body will never execute.

Example:

```java
int number = 10;

while (number < 5) {
    System.out.println(number);
}
```

Output:

```text

```

Nothing is printed because the condition is checked before the first iteration.

---

# `while` vs `for`

Both loops can often solve the same problem.

For example, these two loops produce the same output.

Using a `for` loop:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Using a `while` loop:

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

The main difference is readability.

- Use a **`for` loop** when you know the number of iterations.
- Use a **`while` loop** when the loop continues until a condition changes.

---

# When Should You Use a `while` Loop?

A `while` loop is a good choice when:

- You don't know how many times the loop will execute.
- The loop should continue until a condition changes.
- The loop depends on user input or another event.
