# Object References

Variables that store objects do not store the object directly. They store a **reference** to the object.

A reference tells Java where the object is located in memory.

## Primitive Variables

Primitive variables store their values directly.

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

## Important Idea

When working with objects, remember this question:

```text
Do I have two different objects, or two variables pointing to the same object?
```

This idea becomes very important when working with arrays, lists, methods, and larger object-oriented programs.
