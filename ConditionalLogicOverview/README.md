# Conditional Logic

Programs often need to make decisions.

For example:

- Should a user be allowed to log in?
- Is a student old enough to enroll in a course?
- Is a number positive or negative?
- Did the player win the game?

A program cannot always execute the same instructions every time it runs. Instead, it needs a way to choose what should happen based on different situations.

This is where **conditional logic** comes in.

---

# What Is Conditional Logic?

**Conditional logic** allows a program to execute different blocks of code depending on whether a condition is **`true`** or **`false`**.

A condition is simply an expression that produces a boolean result:

- `true`
- `false`

For example:

```java
10 > 5
```

evaluates to:

```text
true
```

while:

```java
10 < 5
```

evaluates to:

```text
false
```

The result of a condition determines which code the program executes.

---

# Why Do We Need Conditional Logic?

Imagine a program without conditional logic.

Suppose you want to display a message only when a user is at least 18 years old.

Without conditional logic, the program couldn't decide whether to display the message or not.

Instead, it would always execute the same code.

With conditional logic, the program can make a decision based on the user's age.

Example:

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

The message is printed because the condition:

```java
age >= 18
```

is `true`.

---

# How Conditional Logic Works

Every conditional statement follows the same basic idea:

1. Evaluate a condition.
2. If the condition is `true`, execute one block of code.
3. If the condition is `false`, either skip the block or execute a different one.

For example:

```java
int temperature = 30;

if (temperature > 25) {
    System.out.println("It's a warm day.");
}
```

Execution:

1. Check whether `temperature > 25`.
2. The result is `true`.
3. Print `"It's a warm day."`

Output:

```text
It's a warm day.
```

---

# Conditions Use Comparison Operators

Conditions are often created using **comparison operators**.

Some common comparison operators are:

| Operator | Meaning                  | Example      |
| -------- | ------------------------ | ------------ |
| `==`     | Equal to                 | `age == 18`  |
| `!=`     | Not equal to             | `age != 18`  |
| `>`      | Greater than             | `score > 50` |
| `<`      | Less than                | `score < 50` |
| `>=`     | Greater than or equal to | `age >= 18`  |
| `<=`     | Less than or equal to    | `age <= 18`  |

Each comparison produces either `true` or `false`.

For example:

```java
7 == 7
```

Result:

```text
true
```

Example:

```java
7 != 7
```

Result:

```text
false
```

## Content of this section

- **IfStatement**
- **IfElseStatement**
- **ElseIfStatement**
- **SwitchStatement**
- **LogicalOperators**
- **tasks**
