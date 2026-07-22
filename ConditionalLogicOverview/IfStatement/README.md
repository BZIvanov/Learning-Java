# The `if` Statement

The `if` statement is the simplest form of conditional logic in Java.

It allows a program to execute a block of code **only if a condition is `true`**.

If the condition is `false`, the code inside the `if` statement is skipped.

---

# `if` Statement Syntax

The basic syntax of an `if` statement is:

```java
if (condition) {
    // Code to execute if the condition is true
}
```

The condition inside the parentheses must evaluate to either `true` or `false`.

If the condition is `true`, Java executes the code inside the curly braces.

If the condition is `false`, Java skips that code and continues with the rest of the program.

---

# A Simple Example

Suppose we want to display a message only if a person is at least 18 years old.

```java
int age = 20;

if (age >= 18) {
    System.out.println("Access granted.");
}
```

Output:

```text
Access granted.
```

The condition:

```java
age >= 18
```

evaluates to `true`, so the message is printed.

---

# When the Condition Is False

If the condition is `false`, the code inside the `if` statement does not execute.

Example:

```java
int age = 16;

if (age >= 18) {
    System.out.println("Access granted.");
}

System.out.println("Program finished.");
```

Output:

```text
Program finished.
```

Since the condition is `false`, the first message is skipped.

The program continues with the next statement after the `if` block.

---

# How an `if` Statement Works

Consider the following code:

```java
int score = 85;

if (score >= 50) {
    System.out.println("You passed!");
}
```

Execution:

1. Evaluate the condition `score >= 50`.
2. The result is `true`.
3. Execute the code inside the `if` block.
4. Continue with the rest of the program.

Output:

```text
You passed!
```

---

# Using Different Conditions

The condition can be any expression that evaluates to a boolean value.

Example:

```java
int temperature = 28;

if (temperature > 25) {
    System.out.println("It's a warm day.");
}
```

Output:

```text
It's a warm day.
```

Another example:

```java
int balance = 100;

if (balance > 0) {
    System.out.println("Your account has money.");
}
```

Output:

```text
Your account has money.
```

---

# Using a Boolean Variable

Sometimes the condition is already stored in a boolean variable.

Example:

```java
boolean isLoggedIn = true;

if (isLoggedIn) {
    System.out.println("Welcome!");
}
```

Output:

```text
Welcome!
```

Since `isLoggedIn` already contains either `true` or `false`, there is no need for a comparison.

---

# Common Mistakes

## Using `=` Instead of `==`

One common beginner mistake is confusing the assignment operator (`=`) with the equality operator (`==`).

Incorrect:

```java
if (age = 18) {
    System.out.println("Adult");
}
```

This code does not compile because `=` assigns a value instead of comparing values.

Correct:

```java
if (age == 18) {
    System.out.println("Adult");
}
```

Remember:

- `=` assigns a value to a variable.
- `==` compares two values.

---

## Forgetting Curly Braces

Curly braces are optional when an `if` statement contains only one statement.

Example:

```java
if (age >= 18)
    System.out.println("Access granted.");
```

Although this works, using curly braces is generally recommended because it makes the code easier to read and helps prevent mistakes when adding more statements later.

Preferred style:

```java
if (age >= 18) {
    System.out.println("Access granted.");
}
```

---

## Placing a Semicolon After the Condition

A semicolon immediately after the condition ends the `if` statement.

Incorrect:

```java
if (age >= 18);
{
    System.out.println("Access granted.");
}
```

The block inside the braces is no longer controlled by the `if` statement and will always execute.

Simply remove the semicolon:

```java
if (age >= 18) {
    System.out.println("Access granted.");
}
```

---

# When Should You Use an `if` Statement?

Use an `if` statement when:

- An action should happen only when a condition is `true`.
- There is no alternative action if the condition is `false`.
- You simply want to check whether something is true before executing some code.

If you need different actions for `true` and `false`, an `if-else` statement is usually a better choice.
