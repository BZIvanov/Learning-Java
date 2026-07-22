# The `else-if` Statement

The `else-if` statement is used when a program needs to choose between **more than two possible outcomes**.

A simple `if` statement checks one condition.

An `if-else` statement chooses between two possibilities.

An `else-if` statement allows you to check **multiple conditions**, one after another.

---

# `else-if` Statement Syntax

The basic syntax is:

```java
if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition2 is true
} else {
    // Code to execute if none of the conditions are true
}
```

Java evaluates the conditions from **top to bottom**.

As soon as one condition is `true`, its code block executes, and the remaining conditions are skipped.

If none of the conditions are `true`, the `else` block executes.

---

# A Simple Example

Suppose we want to display a letter grade based on a student's score.

```java
int score = 82;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: D");
}
```

Output:

```text
Grade: B
```

Since the score is `82`:

- `score >= 90` → `false`
- `score >= 80` → `true`

Java executes the second block and skips the remaining conditions.

---

# How an `else-if` Statement Works

Consider the following example:

```java
int temperature = 15;

if (temperature > 30) {
    System.out.println("Hot");
} else if (temperature > 20) {
    System.out.println("Warm");
} else if (temperature > 10) {
    System.out.println("Cool");
} else {
    System.out.println("Cold");
}
```

Execution:

1. Check `temperature > 30`.
2. The result is `false`.
3. Check `temperature > 20`.
4. The result is `false`.
5. Check `temperature > 10`.
6. The result is `true`.
7. Execute the corresponding code block.
8. Skip the remaining `else` block.

Output:

```text
Cool
```

---

# Order Matters

The order of the conditions is important.

Java checks them from top to bottom.

Example:

```java
int score = 95;

if (score >= 60) {
    System.out.println("Passed");
} else if (score >= 90) {
    System.out.println("Excellent");
}
```

Output:

```text
Passed
```

Although the score is `95`, the first condition is already `true`.

Java executes that block and never checks the second condition.

A better approach is:

```java
if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 60) {
    System.out.println("Passed");
}
```

Output:

```text
Excellent
```

When writing an `else-if` chain, place the **most specific conditions first**.

---

# The `else` Block Is Optional

You don't have to include an `else` block.

Example:

```java
int number = 5;

if (number > 10) {
    System.out.println("Greater than 10");
} else if (number > 7) {
    System.out.println("Greater than 7");
}
```

Output:

```text

```

Nothing is printed because none of the conditions are `true`, and there is no `else` block.

---

# Common Mistakes

## Expecting Multiple Blocks to Execute

Consider this example:

```java
int score = 95;

if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 80) {
    System.out.println("Very Good");
} else if (score >= 70) {
    System.out.println("Good");
}
```

Output:

```text
Excellent
```

Only the **first matching condition** executes.

The remaining conditions are skipped.

---

## Writing Separate `if` Statements

Sometimes beginners write multiple `if` statements when they actually want an `else-if` chain.

Example:

```java
int score = 95;

if (score >= 70) {
    System.out.println("Good");
}

if (score >= 80) {
    System.out.println("Very Good");
}

if (score >= 90) {
    System.out.println("Excellent");
}
```

Output:

```text
Good
Very Good
Excellent
```

All three conditions are checked independently.

If you want **only one result**, use an `else-if` chain instead.

---

# When Should You Use an `else-if` Statement?

Use an `else-if` statement when:

- There are several possible outcomes.
- Only one outcome should be selected.
- The conditions should be checked in order.

If you are comparing a single variable against several specific values, a `switch` statement may provide a cleaner solution.
