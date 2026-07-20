# Reference Types

In Java, variables can store two main kinds of values:

1. **Primitive types**
2. **Reference types**

Understanding the difference helps explain how variables behave when they are used in methods and when objects are shared between different parts of a program.

---

## Primitive Types

Primitive types store the actual value directly.

Examples of primitive types:

```java
int age = 25;
double price = 19.99;
boolean isStudent = true;
char grade = 'A';
```

In this example, the variable contains the actual data:

```
age → 25
```

If you copy a primitive variable, you get a separate copy of the value.

Example:

```java
int firstNumber = 10;
int secondNumber = firstNumber;

secondNumber = 20;

System.out.println(firstNumber);
System.out.println(secondNumber);
```

Output:

```text
10
20
```

Changing `secondNumber` does not affect `firstNumber` because they store separate values.

---

## Reference Types

Reference types do not store the object itself. Instead, they store a **reference** (a way to find the object).

Examples of reference types:

```java
String name = "Alice";
```

```java
Scanner scanner = new Scanner(System.in);
```

```java
int[] numbers = {1, 2, 3};
```

A simple way to imagine it:

```
name ──────► "Alice"
```

The variable `name` contains a reference to the String object.

---

## Objects and References

Reference types are usually related to **objects**.

For example:

```java
String firstName = "Alice";
String secondName = firstName;
```

Now both variables refer to the same object:

```
firstName ──► "Alice"
secondName ─► "Alice"
```

The variables contain references, not separate copies of the object.

---

## Reference Types and Methods

This difference becomes important when passing values to methods.

### Primitive Example

```java
public class Main {

    public static void main(String[] args) {
        int number = 10;

        changeNumber(number);

        System.out.println(number);
    }

    public static void changeNumber(int number) {
        number = 20;
    }
}
```

Output:

```text
10
```

The method receives a copy of the value.

The original variable is not changed.

---

## Reference Type Example

Now let's look at an object:

```java
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        changeArray(numbers);

        System.out.println(numbers[0]);
    }

    public static void changeArray(int[] numbers) {
        numbers[0] = 100;
    }
}
```

Output:

```text
100
```

Why did the original array change?

Because the method received a copy of the **reference** to the same array object.

Both variables point to the same object:

```
main method:
numbers ──────► [1, 2, 3]

changeArray:
numbers ──────► [1, 2, 3]
```

When the method changes the object, everyone referring to that object sees the change.

---

## Java Is Always Pass-by-Value

A common misconception is:

> "Primitive types are passed by value, and objects are passed by reference."

This is not exactly correct in Java.

Java always passes a copy of the value.

The difference is:

- For primitives → the copied value is the actual data.
- For reference types → the copied value is the reference pointing to an object.

Example:

```
Primitive:

original variable
       |
       v
      10

copy passed to method
       |
       v
      10
```

The values are independent.

---

```
Reference type:

original variable
       |
       v
    Object

copy passed to method
       |
       v
    Object
```

Both references point to the same object.

---

## Strings as Reference Types

`String` is a reference type:

```java
String message = "Hello";
```

However, Strings behave differently from many other objects because they are **immutable**.

This means a String cannot be changed after it is created.

Example:

```java
String text = "Hello";

text = text + " World";

System.out.println(text);
```

Output:

```text
Hello World
```

Java did not modify the original String. Instead, it created a new String and changed the reference to point to it.

The details of immutability are usually covered later.
