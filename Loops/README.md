# Loops

A **loop** is a programming construct that allows you to execute the same block of code multiple times.

Without loops, you would have to write the same code over and over again.

For example, if you wanted to print `"Hello!"` five times, you could write:

```java
System.out.println("Hello!");
System.out.println("Hello!");
System.out.println("Hello!");
System.out.println("Hello!");
System.out.println("Hello!");
```

This works, but it quickly becomes repetitive and difficult to maintain.

Instead, you can use a loop:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Hello!");
}
```

Output:

```text
Hello!
Hello!
Hello!
Hello!
Hello!
```

The loop repeats the code automatically, making your program shorter, cleaner, and easier to read.

---

# Why Use Loops?

Loops are useful whenever you need to repeat an action.

Some common examples include:

- Printing a sequence of numbers.
- Processing every element in an array.
- Reading user input until it is valid.
- Repeating an action until a condition is met.
- Performing the same task multiple times.

Instead of copying and pasting the same code, you can write it once and let the loop do the repetition.

---

# How Do Loops Work?

Every loop follows the same basic idea:

1. A loop begins.
2. A **condition** is checked.
3. If the condition is `true`, the code inside the loop executes.
4. The condition is checked again.
5. The loop stops once the condition becomes `false`.

For example:

```java
int number = 1;

while (number <= 3) {
    System.out.println(number);
    number++;
}
```

The program performs these steps:

1. `number` is `1`.
2. `1 <= 3` is `true`, so `1` is printed.
3. `number` becomes `2`.
4. `2 <= 3` is `true`, so `2` is printed.
5. `number` becomes `3`.
6. `3 <= 3` is `true`, so `3` is printed.
7. `number` becomes `4`.
8. `4 <= 3` is `false`, so the loop ends.

Output:

```text
1
2
3
```

---

# Types of Loops in Java

Java provides three main types of loops.

## `for` Loop

A `for` loop is commonly used when you know **how many times** you want to repeat the code.

Example:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

## `while` Loop

A `while` loop repeats as long as a condition is `true`.

It is useful when you don't know exactly how many times the loop will execute.

Example:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
    number++;
}
```

---

## `do-while` Loop

A `do-while` loop is similar to a `while` loop, but it always executes its code **at least once** before checking the condition.

Example:

```java
int number = 1;

do {
    System.out.println(number);
    number++;
} while (number <= 5);
```

---

# Infinite Loops

A loop whose condition never becomes `false` is called an **infinite loop**.

Example:

```java
while (true) {
    System.out.println("Running...");
}
```

This loop never stops on its own.

Infinite loops are sometimes intentional, but beginners often create them accidentally by forgetting to update the loop condition.

For example:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
}
```

Since `number` is never increased, the condition remains `true` forever.

---

# Which Loop Should I Use?

| Loop       | Best used when...                                                                                           |
| ---------- | ----------------------------------------------------------------------------------------------------------- |
| `for`      | You know how many times the code should repeat.                                                             |
| `while`    | The loop should continue until a condition changes, and you don't know the number of iterations beforehand. |
| `do-while` | The code must execute at least once before the condition is checked.                                        |

As you continue learning, you'll explore each loop type in more detail and learn when one is a better choice than another.

## Content of this section

- **ForLoop**
- **WhileLoop**
- **DoWhileLoop**
- **BreakStatement**
- **ContinueStatement**
- **NestedLoops**
- **EnhancedForLoop**
- **tasks**
