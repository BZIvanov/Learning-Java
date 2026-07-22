## Return Values

So far, you've seen methods that perform a task but don't give anything back.

For example:

```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
```

This method prints a message to the console and then finishes.

Sometimes, however, a method needs to **produce a result** that can be used elsewhere in the program. This is called a **return value**.

---

## The `return` Keyword

A method returns a value using the `return` keyword.

For example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

This method adds two numbers together and returns the result.

Notice that the method uses `int` instead of `void`.

- `void` means the method **does not return anything**.
- `int` means the method **returns an integer**.

---

## Using a Returned Value

When you call a method that returns a value, you can use that value in your program.

For example:

```java
public static void main(String[] args) {
    int result = add(5, 3);

    System.out.println(result);
}

public static int add(int a, int b) {
    return a + b;
}
```

Program output:

```text
8
```

Here's what happens:

1. `add(5, 3)` is called.
2. The method calculates `5 + 3`.
3. The result (`8`) is returned.
4. The returned value is stored in the variable `result`.
5. The value is printed to the console.

---

## Returning Different Types

Methods can return many different types of values.

A method returning a `String`:

```java
public static String getGreeting() {
    return "Hello!";
}
```

Usage:

```java
String message = getGreeting();
System.out.println(message);
```

Program output:

```text
Hello!
```

A method returning a `boolean`:

```java
public static boolean isAdult(int age) {
    return age >= 18;
}
```

Usage:

```java
boolean adult = isAdult(20);

System.out.println(adult);
```

Program output:

```text
true
```

The return type must always match the value returned by the method.

---

## Using Returned Values Directly

You don't always have to store a returned value in a variable.

You can use it immediately:

```java
System.out.println(add(10, 20));
```

Program output:

```text
30
```

Here, the value returned by `add()` is passed directly to `System.out.println()`.

---

## Every Non-`void` Method Must Return a Value

If a method has a return type other than `void`, Java expects it to return a value.

For example:

```java
public static int multiply(int a, int b) {
    return a * b;
}
```

If the `return` statement is missing, the program will not compile because Java expects an `int` to be returned.

---

## `void` vs Returning a Value

Compare these two methods:

```java
public static void printSum(int a, int b) {
    System.out.println(a + b);
}
```

This method prints the result directly.

```java
public static int getSum(int a, int b) {
    return a + b;
}
```

This method returns the result instead of printing it.

Returning a value is often more useful because the calling code decides what to do with it.

For example:

```java
int sum = getSum(5, 3);

System.out.println(sum);
```

Or even:

```java
int doubled = getSum(5, 3) * 2;

System.out.println(doubled);
```

Because `getSum()` returns a value, it can be used anywhere an `int` is expected.
