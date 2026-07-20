# The `break` Statement in Java

The `break` statement is used to **immediately stop a loop**.

When Java reaches a `break` statement inside a loop, the loop ends right away, and the program continues executing the code after the loop.

Normally, a loop stops when its condition becomes `false`. The `break` statement allows you to stop a loop **before reaching that point**.

---

# Basic Syntax

The `break` statement is written simply as:

```java
break;
```

It is usually placed inside a conditional statement within a loop.

Example:

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

When `i` becomes `5`, the `if` condition becomes `true`, and the `break` statement immediately ends the loop.

The number `5` is not printed because the loop stops before reaching the `System.out.println()` statement.

---

# How `break` Works

Consider this example:

```java
int number = 1;

while (number <= 10) {

    if (number == 4) {
        break;
    }

    System.out.println(number);
    number++;
}
```

The execution happens like this:

| Step | Value of `number` | Action                       |
| ---- | ----------------- | ---------------------------- |
| 1    | `1`               | Print `1`                    |
| 2    | `2`               | Print `2`                    |
| 3    | `3`               | Print `3`                    |
| 4    | `4`               | `break` executes, loop stops |

Output:

```text
1
2
3
```

The loop condition (`number <= 10`) is still true, but the `break` statement stops the loop anyway.

---

# Using `break` with User Input

A common use of `break` is stopping a loop when a certain input is received.

For example:

```java
Scanner scanner = new Scanner(System.in);

while (true) {

    System.out.print("Enter a number (0 to stop): ");
    int number = scanner.nextInt();

    if (number == 0) {
        break;
    }

    System.out.println("You entered: " + number);
}
```

The loop continues forever because of:

```java
while (true)
```

However, the `break` statement provides a way to exit the loop.

If the user enters `0`, the loop ends.

Example:

```text
Enter a number (0 to stop): 5
You entered: 5

Enter a number (0 to stop): 8
You entered: 8

Enter a number (0 to stop): 0
```

The program stops after receiving `0`.

---

# `break` in Different Loops

The `break` statement works with all main Java loops:

## `for` Loop

```java
for (int i = 1; i <= 10; i++) {

    if (i == 3) {
        break;
    }

    System.out.println(i);
}
```

---

## `while` Loop

```java
int i = 1;

while (i <= 10) {

    if (i == 3) {
        break;
    }

    System.out.println(i);
    i++;
}
```

---

## `do-while` Loop

```java
int i = 1;

do {

    if (i == 3) {
        break;
    }

    System.out.println(i);
    i++;

} while (i <= 10);
```

In every case, `break` immediately exits the loop.

---

# `break` vs Loop Condition

Sometimes the same result can be achieved without `break`.

Using a loop condition:

```java
for (int i = 1; i < 5; i++) {
    System.out.println(i);
}
```

Using `break`:

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Both produce:

```text
1
2
3
4
```

The difference is that `break` is useful when you don't know exactly when the loop should stop.

---

# Common Mistake

A common beginner mistake is using `break` when changing the loop condition would make the code clearer.

Example:

```java
for (int i = 1; i <= 100; i++) {

    if (i > 10) {
        break;
    }

    System.out.println(i);
}
```

This works, but a better approach is:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

Use `break` when the stopping condition depends on something that happens **inside** the loop.
