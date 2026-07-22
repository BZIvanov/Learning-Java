# Terminology

## Expression

An **expression** is a piece of code that **evaluates to a value**.

### Examples of expressions

```java
42
```

```java
x
```

## Statement

A **statement** is a complete instruction that the Java program can execute. You can think of it as a single step in a program.

### Examples of statements

- This is a **declaration statement**. It declares a variable and initializes it:

```java
int x = 10;
```

- This is an **expression statement**. It updates the value of `x`.

```java
x = x + 5;
```

### Statement vs. Expression

- **Expression**: Produces a value.
- **Statement**: Performs an action

A good rule of thumb is to ask:

- Can I replace this code with its resulting value? If yes, it's an expression.
- Is this code telling the program to perform an action? If yes, it's a statement.
