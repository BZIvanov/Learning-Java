# Method Parameters

Sometimes a method needs some information in order to perform its task. This information is provided using **parameters**.

A **parameter** is a variable that is defined in a method's declaration. When the method is called, you provide a value for each parameter.

Think of a method as a machine. Parameters are the **inputs** you give to the machine so it can produce the desired result.

## A Method With Parameters

Let's make the method a little more flexible by allowing it to greet different people.

```java
public class MyFirstClass {

    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
```

Program output:

```text
Hello, Alice!
Hello, Bob!
```

In this example:

- `String name` is the **parameter**.
- `"Alice"` and `"Bob"` are the **arguments** passed to the method.

The method uses the value stored in `name` to build the message.

---

## Parameters Are Like Variables

A parameter behaves just like a variable inside the method.

```java
public static void greet(String name) {
    System.out.println(name);
}
```

When you call:

```java
greet("Charlie");
```

it's as if Java temporarily creates a variable like this:

```java
String name = "Charlie";
```

The method can then use that variable until it finishes running.

---

## Multiple Parameters

A method can have more than one parameter.

```java
public static void introduce(String name, int age) {
    System.out.println(name + " is " + age + " years old.");
}
```

Calling the method:

```java
introduce("Emma", 25);
```

produces:

```text
Emma is 25 years old.
```

Parameters are separated by commas, and each parameter has its own type and name.

---

## Why Use Parameters?

Parameters make methods much more useful because the same method can work with different values.

Without parameters, you might write:

```java
System.out.println("Hello, Alice!");
System.out.println("Hello, Bob!");
System.out.println("Hello, Charlie!");
```

With a parameter, you only need one method:

```java
greet("Alice");
greet("Bob");
greet("Charlie");
```

This avoids repeating code and makes your programs easier to update and maintain.
