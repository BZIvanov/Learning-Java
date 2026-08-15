# Built-in Classes

So far, you've created your own classes, such as `MyFirstClass`.

However, you've also been using classes that you **didn't create**, for example:

```java
System.out.println("Hello, World!");
```

Where did `System` come from?

The answer is that Java comes with a large collection of **built-in classes** that you can use in your programs.

This collection is called the **Java Standard Library**.

In this section, "built-in classes" means classes that are already provided by Java.
Some of them can be used immediately, while others need an `import` statement.

Instead of writing everything from scratch, you can use these classes to perform common tasks such as:

- Printing text to the console
- Working with numbers
- Reading user input
- Working with dates and time
- Managing files
- And much more

---

## The `System` Class

One of the first built-in classes you'll use is `System`.

```java
System.out.println("Hello!");
```

The `System` class provides useful features for interacting with your program and the computer.

One of those features is `System.out.println()`, which prints text to the console.

You'll use this class frequently while learning Java.

---

## The `Math` Class

Another useful built-in class is `Math`.

It provides methods for performing common mathematical operations.

For example:

```java
System.out.println(Math.max(10, 25));
```

Output:

```text
25
```

Finding the square root of a number:

```java
System.out.println(Math.sqrt(64));
```

Output:

```text
8.0
```

Generating a random number:

```java
System.out.println(Math.random());
```

Example output:

```text
0.4832751946521783
```

The exact value will be different each time the program runs.

---

## The `Integer` Class

The `Integer` class provides useful methods for working with `int` values.

For example, converting text into a number:

```java
String text = "42";

int number = Integer.parseInt(text);

System.out.println(number);
```

Output:

```text
42
```

This is especially useful when reading numbers entered by a user.

`Integer` is also the wrapper class corresponding to the primitive type `int`.
The dedicated [Wrapper classes](WrapperClasses/) lesson explains all eight
primitive wrappers, boxing, autoboxing, and unboxing.

---

## Do We Always Need to Create Classes?

No.

Many of the classes you'll use already exist in Java.

For example:

```java
System
Math
String
Integer
Scanner
StringBuilder
BigInteger
```

Some of these classes are available immediately, while others must be imported before they can be used.

For example, these classes are available automatically because they are part of `java.lang`:

```java
System
Math
String
Integer
```

Other classes are still provided by Java, but they live in different packages and must be imported:

```java
import java.util.Scanner;
import java.math.BigInteger;
```

For now, it's enough to know that Java provides many useful classes that are ready to use.

---

## Why Does Java Provide These Classes?

Imagine if every programmer had to write their own code for:

- Finding the maximum of two numbers
- Calculating square roots
- Printing text
- Reading keyboard input

Programming would become repetitive and time-consuming.

Instead, Java includes these features so you can focus on solving your own problems instead of rewriting common functionality.

---

## Your Classes vs Built-in Classes

As you continue learning Java, you'll write your own classes just like the ones provided by Java.

For example, you might create:

```java
public class Car {

}
```

or

```java
public class Student {

}
```

These classes work the same way as Java's built-in classes.

The main difference is simply who wrote them:

- **Built-in classes** were created by the developers of Java.
- **Your classes** are created by you to solve problems in your own programs.

## Content of this section

- **[WrapperClasses](WrapperClasses/)** - wrapper types, boxing, autoboxing,
  unboxing, and their common caveats.
- **[BigIntegerClass](BigIntegerClass/)** - working with very large whole numbers.
- **[StringBuilderClass](StringBuilderClass/)** - building and changing text efficiently.
