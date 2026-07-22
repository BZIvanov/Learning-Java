# The `if-else` Statement

The `if-else` statement allows a program to choose between **two different blocks of code**.

If the condition is `true`, the code inside the `if` block executes.

If the condition is `false`, the code inside the `else` block executes instead.

Unlike a simple `if` statement, one of the two blocks will always execute.

---

# `if-else` Statement Syntax

The basic syntax is:

```java
if (condition) {
    // Code to execute if the condition is true
} else {
    // Code to execute if the condition is false
}
```

The condition must evaluate to either `true` or `false`.

- If the condition is `true`, Java executes the `if` block.
- If the condition is `false`, Java executes the `else` block.

---

# A Simple Example

Suppose we want to determine whether a person is an adult or a minor.

```java
int age = 20;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

Output:

```text
Adult
```

Since the condition is `true`, the `if` block executes.

---

If we change the value of `age`:

```java
int age = 15;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

Output:

```text
Minor
```

This time, the condition is `false`, so the `else` block executes.

---

# How an `if-else` Statement Works

Consider the following example:

```java
int score = 72;

if (score >= 50) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

Execution:

1. Evaluate the condition `score >= 50`.
2. The result is `true`.
3. Execute the `if` block.
4. Skip the `else` block.
5. Continue with the rest of the program.

Output:

```text
Passed
```

Only one block executes.

---

# Another Example

Suppose a program checks whether a number is even or odd.

```java
int number = 8;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

Output:

```text
Even
```

The condition:

```java
number % 2 == 0
```

checks whether the remainder after dividing by `2` is `0`.

If it is, the number is even.

Otherwise, it is odd.

---

# Using a Boolean Variable

A boolean variable can also be used directly as the condition.

```java
boolean isLoggedIn = false;

if (isLoggedIn) {
    System.out.println("Welcome!");
} else {
    System.out.println("Please log in.");
}
```

Output:

```text
Please log in.
```

---

# Common Mistakes

## Forgetting That Only One Block Executes

Some beginners expect both blocks to execute.

Example:

```java
int age = 25;

if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

Output:

```text
Adult
```

The `else` block is skipped because the condition is `true`.

Only one block executes.

---

## Writing Multiple `else` Blocks

An `if` statement can have only one `else` block.

Incorrect:

```java
if (score >= 50) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
} else {
    System.out.println("Try again");
}
```

This code does not compile.

If you need to check multiple conditions, you'll learn about the `else-if` statement on the next page.

---

## Forgetting Curly Braces

As with the `if` statement, curly braces are optional when there is only one statement.

Example:

```java
if (age >= 18)
    System.out.println("Adult");
else
    System.out.println("Minor");
```

Although this works, using curly braces is recommended because it improves readability and helps prevent mistakes.

Preferred style:

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

# When Should You Use an `if-else` Statement?

Use an `if-else` statement when:

- There are exactly two possible outcomes.
- One block should execute when the condition is `true`.
- A different block should execute when the condition is `false`.

If you need to choose between more than two possibilities, an `else-if` statement or a `switch` statement may be a better choice.
