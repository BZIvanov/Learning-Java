# Object References

Variables that store objects do not store the object directly. They store a **reference** to the object.

A reference tells Java where the object is located in memory.

## Primitive Variables

Primitive variables store their values directly.

Examples of primitive types include:

```java
int age = 25;
double price = 19.99;
boolean isStudent = true;
char grade = 'A';
```

When you copy a primitive variable, Java copies the actual value.

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

Changing `secondNumber` does not change `firstNumber`.

## Object Variables

Object variables store references.

Examples of reference types include objects, arrays, and strings:

```java
String name = "Alice";
Scanner scanner = new Scanner(System.in);
int[] numbers = {1, 2, 3};
Student student = new Student("Maria");
```

The variable does not contain the whole object. It contains a reference that points to the object.

```java
Student firstStudent = new Student("Maria");
Student secondStudent = firstStudent;

secondStudent.name = "Maria Petrova";

System.out.println(firstStudent.name);
System.out.println(secondStudent.name);
```

Output:

```text
Maria Petrova
Maria Petrova
```

Both variables refer to the same object, so changing the object through one variable is visible through the other variable.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Maria");
        Student secondStudent = firstStudent;

        secondStudent.name = "Maria Petrova";

        System.out.println(firstStudent.name);
        System.out.println(secondStudent.name);
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}
```

## References and Methods

Java always passes arguments to methods **by value**.

This means the method receives a copy of the value.

For primitive variables, the copied value is the actual data:

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

The original variable is not changed because the method changed only its own copy.

For reference variables, the copied value is the reference:

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

The method receives a copy of the reference, but that copy still points to the same array object.

That is why changing the array through the method is visible after the method finishes.

So the common phrase "objects are passed by reference" is not quite correct in Java.

Java passes a copy of the reference.

## `null`

An object variable can also contain `null`.

`null` means the variable does not currently refer to any object.

```java
Student student = null;
```

If you try to use a field or method through `null`, the program will fail with a `NullPointerException`.

```java
System.out.println(student.name); // error at runtime
```

## Strings as Reference Types

`String` is a reference type:

```java
String message = "Hello";
```

However, strings behave differently from many other objects because they are **immutable**.

Immutable means the object cannot be changed after it is created.

```java
String text = "Hello";

text = text + " World";

System.out.println(text);
```

Output:

```text
Hello World
```

Java did not modify the original `"Hello"` string. It created a new string and made `text` refer to the new object.

## Important Idea

When working with objects, remember this question:

```text
Do I have two different objects, or two variables pointing to the same object?
```

This idea becomes very important when working with arrays, lists, methods, and larger object-oriented programs.
