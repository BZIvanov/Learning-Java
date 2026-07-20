# The `for` Loop

The `for` loop is one of the most commonly used loops in Java.

It is typically used when you know **how many times** you want to repeat a block of code.

For example, if you want to print the numbers from `1` to `5`, a `for` loop is an excellent choice.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
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

Instead of writing five `System.out.println()` statements, the loop repeats the code automatically.

---

# `for` Loop Syntax

A `for` loop consists of three parts:

```java
for (initialization; condition; update) {
    // Code to repeat
}
```

Each part has a specific purpose.

---

## Initialization

The **initialization** runs **once**, before the loop begins.

It is commonly used to create a loop variable.

Example:

```java
int i = 1
```

Here, the variable `i` starts with the value `1`.

---

## Condition

The **condition** is checked before every iteration.

If the condition is `true`, the loop continues.

If the condition is `false`, the loop ends.

Example:

```java
i <= 5
```

As long as `i` is less than or equal to `5`, the loop keeps running.

---

## Update

The **update** runs after each iteration.

It usually changes the loop variable.

Example:

```java
i++
```

This increases `i` by `1` after each iteration.

---

# How a `for` Loop Works

Consider the following example:

```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```

The loop executes like this:

| Step  | Value of `i` | Condition          | Action    |
| ----- | ------------ | ------------------ | --------- |
| Start | `1`          | `1 <= 3` → `true`  | Print `1` |
| Next  | `2`          | `2 <= 3` → `true`  | Print `2` |
| Next  | `3`          | `3 <= 3` → `true`  | Print `3` |
| Next  | `4`          | `4 <= 3` → `false` | Loop ends |

Output:

```text
1
2
3
```

---

# Counting Up

The most common use of a `for` loop is counting upward.

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

Output:

```text
1
2
3
4
5
6
7
8
9
10
```

---

# Counting Down

A `for` loop can also count backward.

```java
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
```

Output:

```text
5
4
3
2
1
```

Here, `i--` decreases the value of `i` by `1` after each iteration.

---

# Changing the Step Size

The loop variable doesn't have to increase or decrease by `1`.

For example, you can count by twos:

```java
for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}
```

Output:

```text
2
4
6
8
10
```

Or by fives:

```java
for (int i = 0; i <= 20; i += 5) {
    System.out.println(i);
}
```

Output:

```text
0
5
10
15
20
```

---

# Common Mistakes

## Forgetting to Update the Loop Variable

```java
for (int i = 1; i <= 5;) {
    System.out.println(i);
}
```

Since `i` never changes, the condition is always `true`, creating an infinite loop.

---

## Incorrect Condition

Suppose you want to print the numbers `1` through `5`.

This loop:

```java
for (int i = 1; i < 5; i++) {
    System.out.println(i);
}
```

produces:

```text
1
2
3
4
```

The number `5` is not printed because the condition uses `<` instead of `<=`.

Always make sure your loop condition matches the desired result.

---

# When Should You Use a `for` Loop?

A `for` loop is usually the best choice when:

- You know how many times the code should repeat.
- You need a counter.
- You want to count forward or backward.
- You are processing a range of values.

If the number of iterations depends on something that changes while the program is running, a `while` loop is often a better choice.
