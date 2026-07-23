# Handling Exceptions Overview

An **exception** is a problem that happens while a program is running.

Some exceptions stop the program immediately. Others can be handled so the program can show a useful message and continue running.

Exception handling is Java's way of reacting to runtime problems in a controlled way.

---

## Why Handle Exceptions?

Without exception handling, one unexpected value can crash the program.

Example:

```java
int result = 10 / 0;

System.out.println(result);
```

This causes an error:

```text
ArithmeticException: / by zero
```

The program stops because dividing by zero is not allowed.

With exception handling, we can respond to the problem:

```java
try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}

System.out.println("Program continues...");
```

Output:

```text
Cannot divide by zero.
Program continues...
```

---

## The `try-catch` Statement

A `try-catch` statement has two main parts:

- `try` contains code that might throw an exception.
- `catch` contains code that runs if that exception happens.

Basic structure:

```java
try {
    // risky code
} catch (ExceptionType e) {
    // code that handles the problem
}
```

Example:

```java
String text = "abc";

try {
    int number = Integer.parseInt(text);
    System.out.println(number);
} catch (NumberFormatException e) {
    System.out.println("The text is not a valid number.");
}
```

The method `Integer.parseInt()` converts text to an integer. If the text is not a valid number, Java throws a `NumberFormatException`.

---

## Common Beginner Exceptions

| Exception                         | Common reason                                                   |
| --------------------------------- | --------------------------------------------------------------- |
| `ArithmeticException`             | Dividing by zero.                                               |
| `NumberFormatException`           | Converting invalid text to a number.                            |
| `ArrayIndexOutOfBoundsException`  | Accessing an array index that does not exist.                   |
| `StringIndexOutOfBoundsException` | Accessing a character position that does not exist.             |
| `NullPointerException`            | Using a variable that points to `null` instead of a real value. |
| `InputMismatchException`          | Reading input with `Scanner` in the wrong format.               |

You do not need to memorize all exception names at once. Read the error message and look for the exception type.

---

## Multiple `catch` Blocks

Sometimes different problems need different messages.

You can use more than one `catch` block:

```java
try {
    int number = Integer.parseInt("abc");
    System.out.println(number);
} catch (NumberFormatException e) {
    System.out.println("Invalid number.");
} catch (Exception e) {
    System.out.println("Something else went wrong.");
}
```

When using multiple `catch` blocks, put the more specific exceptions first.

This is correct:

```java
catch (NumberFormatException e) {
    System.out.println("Invalid number.");
} catch (Exception e) {
    System.out.println("Something else went wrong.");
}
```

This is wrong:

```java
catch (Exception e) {
    System.out.println("Something went wrong.");
} catch (NumberFormatException e) {
    System.out.println("Invalid number.");
}
```

`Exception` is very general, so it would catch the problem before Java reaches the more specific `NumberFormatException`.

---

## The `finally` Block

A `finally` block runs after `try` and `catch`.

It runs whether an exception happens or not.

```java
try {
    System.out.println("Trying something...");
} catch (Exception e) {
    System.out.println("Handling a problem...");
} finally {
    System.out.println("This always runs.");
}
```

`finally` is commonly used for cleanup, such as closing files, scanners, or connections.

For beginner programs, you will usually see it when a resource needs to be closed.

---

## Throwing an Exception

Java can throw exceptions automatically, but you can also throw one yourself when a value is invalid.

Example:

```java
int age = -5;

if (age < 0) {
    throw new IllegalArgumentException("Age cannot be negative.");
}
```

This is useful when your program receives a value that should never be accepted.

At this stage, focus on throwing simple built-in exceptions. Creating your own custom exception classes is a more advanced topic and can be covered later.

---

## Checked and Unchecked Exceptions

For now, you only need the basic idea:

- **Unchecked exceptions** usually come from programming mistakes, such as invalid indexes or dividing by zero.
- **Checked exceptions** are exceptions Java forces you to handle or declare, often related to files or external resources.

You will meet checked exceptions more often when working with files and streams.

---

## Good Beginner Habits

- Catch specific exceptions when you know what problem might happen.
- Avoid using `catch (Exception e)` for everything.
- Show clear messages to the user.
- Do not hide errors silently.
- Keep the risky code inside `try` as small as possible.
- Use `finally` only when you need cleanup code.
- Read the exception type and line number from the error message.

---

## Content of this Section

- **basic-try-catch**
- **multiple-catch**
- **finally**
- **throw-keyword**
