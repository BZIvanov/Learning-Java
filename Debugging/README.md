# Debugging

**Debugging** is the process of finding and fixing problems in your program.

When a program does not behave the way you expect, you need to investigate what is happening step by step. Debugging helps you understand the real flow of the program, the values stored in variables, and the reason why the result is wrong.

It is a normal part of programming. Even experienced developers spend a lot of time debugging.

---

# What Is a Bug?

A **bug** is an error in a program.

Some bugs stop the program from running. Other bugs allow the program to run, but produce the wrong result.

For example:

```java
int price = 10;
int quantity = 3;

int total = price + quantity;

System.out.println(total);
```

Output:

```text
13
```

The program runs, but the result is not correct if we wanted to calculate the total price. The correct operation should be multiplication:

```java
int total = price * quantity;
```

This type of mistake is called a **logic error**.

---

# Common Types of Errors

Java programs can have different kinds of errors.

## Compilation Errors

A **compilation error** happens when Java cannot understand your code.

Example:

```java
System.out.println("Hello")
```

This code is missing a semicolon at the end.

Correct version:

```java
System.out.println("Hello");
```

Compilation errors must be fixed before the program can run.

---

## Runtime Errors

A **runtime error** happens while the program is running.

Example:

```java
int[] numbers = {1, 2, 3};

System.out.println(numbers[5]);
```

The array has indexes `0`, `1`, and `2`, but the program tries to access index `5`.

This causes an error similar to:

```text
ArrayIndexOutOfBoundsException
```

Runtime errors usually stop the program.

---

## Logic Errors

A **logic error** happens when the program runs, but the result is wrong.

Example:

```java
int age = 18;

if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Not adult");
}
```

Output:

```text
Not adult
```

If `18` should count as adult, the condition should be:

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

Logic errors can be harder to find because the program does not always show an obvious error message.

---

# Debugging With Print Statements

One simple way to debug is to print values while the program runs.

Example:

```java
int firstNumber = 10;
int secondNumber = 0;

System.out.println("firstNumber = " + firstNumber);
System.out.println("secondNumber = " + secondNumber);

int result = firstNumber / secondNumber;

System.out.println(result);
```

Printing values can help you see what happens before the error.

This technique is useful, but it can become messy if you add many print statements. A better tool for larger programs is the debugger in your IDE.

---

# Debugging With an IDE

Most Java IDEs, such as IntelliJ IDEA, Eclipse, and VS Code, include a **debugger**.

A debugger allows you to pause the program and inspect it while it is running.

With a debugger, you can:

- Pause the program on a specific line.
- Execute the code one line at a time.
- Check the current values of variables.
- See which methods were called.
- Find where the program starts behaving incorrectly.

---

# Breakpoints

A **breakpoint** is a marker that tells the debugger where to pause the program.

You usually add a breakpoint by clicking next to the line number in your IDE.

Example:

```java
public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = a + b;

        System.out.println(sum);
    }
}
```

If you add a breakpoint on this line:

```java
int sum = a + b;
```

the program will pause before that line is executed. At that moment, you can inspect the values of `a` and `b`.

---

# Stepping Through Code

When the program is paused, the debugger gives you commands for moving through the code.

| Command   | Meaning                                                                |
| --------- | ---------------------------------------------------------------------- |
| Step Over | Execute the current line and move to the next line.                    |
| Step Into | Go inside the method that is being called on the current line.         |
| Step Out  | Finish the current method and return to the place where it was called. |
| Resume    | Continue running the program until the next breakpoint or program end. |

For beginners, **Step Over** is usually the most useful command.

---

# Example Debugging Session

Suppose we have this program:

```java
public class App {
    public static void main(String[] args) {
        int number = 5;
        int result = doubleNumber(number);

        System.out.println(result);
    }

    public static int doubleNumber(int number) {
        return number + 2;
    }
}
```

Expected output:

```text
10
```

Actual output:

```text
7
```

The program runs, but the result is wrong. This is a logic error.

To debug it:

1. Add a breakpoint on this line:

```java
int result = doubleNumber(number);
```

2. Run the program in debug mode.
3. Check the value of `number`.
4. Step into the `doubleNumber()` method.
5. Look at the return statement.

The problem is here:

```java
return number + 2;
```

The method name says `doubleNumber`, so the correct operation should be:

```java
return number * 2;
```

---

# Reading Error Messages

Java error messages often look scary at first, but they contain useful information.

Example:

```text
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at App.main(App.java:6)
```

Important parts:

- `ArithmeticException` tells you the type of problem.
- `/ by zero` explains the reason.
- `App.java:6` tells you the file and line number where the error happened.

When you see an error message, start by reading the first line and then look for the file name and line number.

---

# Tips for Debugging

- Read the error message carefully.
- Reproduce the problem before trying to fix it.
- Start from the line where the error happens.
- Check the values of variables.
- Test small parts of the program separately.
- Change one thing at a time.
- Run the program again after each change.
- Think about what you expected and compare it with what actually happened.

---

# Debugging Mindset

Debugging is not guessing. It is investigation.

When something is wrong, ask questions like:

- What did I expect the program to do?
- What did the program actually do?
- Which line produced the wrong value?
- Which variable has an unexpected value?
- Did the problem happen before or after this line?

The goal is to make the problem smaller until the mistake becomes easy to see.
