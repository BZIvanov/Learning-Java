# Methods

A **method** is a block of code that performs a specific task.

Instead of writing the same code multiple times, you can place it inside a method and run that method whenever you need it.

You can think of a method as a **recipe** or **instruction**. Once it has been defined, you can "call" it whenever you want that task to be performed.

## The `main()` Method

In your first Java program, you've already used a method:

```java
public static void main(String[] args) {
    System.out.println("Hello World");
}
```

This is a special method called `main()`. It is the first method that Java executes when you run your program.

Inside the `main()` method, you write the instructions you want your program to perform.

## Calling a Method

A method runs only when it is **called**.

For example:

```java
public class MyFirstClass {

    public static void main(String[] args) {
        greet();
    }

    public static void greet() {
        System.out.println("Hello!");
    }
}
```

Program output:

```text
Hello!
```

Here, the line:

```java
greet();
```

calls the `greet()` method, causing the code inside it to execute.

## Why Use Methods?

Methods help make your programs:

- **Easier to read** by breaking code into smaller pieces.
- **Easier to reuse** because the same method can be called multiple times.
- **Easier to maintain** since you only need to update the code in one place if something changes.

For example, instead of writing:

```java
System.out.println("Hello!");
System.out.println("Hello!");
System.out.println("Hello!");
```

you could write:

```java
public static void main(String[] args) {
    greet();
    greet();
    greet();
}

public static void greet() {
    System.out.println("Hello!");
}
```

This produces the same output while avoiding repeated code.

## Method Structure

A method has several parts:

```java
public static void greet() {
    System.out.println("Hello!");
}
```

- `greet` is the **method name**.
- `()` holds any information the method might receive (called **parameters**). In this example, it doesn't receive any.
- The code inside `{ }` is the **method body**.
- `void` means the method doesn't return a value.

Don't worry about keywords like `public` and `static` yet—they'll make much more sense in the next sections.

## Content of this section

1. **Parameters**
2. **ReturnValue**
3. **Overloading**
4. **tasks**
