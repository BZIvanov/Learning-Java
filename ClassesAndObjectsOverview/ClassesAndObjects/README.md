# Classes and Objects

A **class** describes a type of thing. An **object** is one actual thing created from that class.

For example, `Student` can be a class. One actual student, such as "Maria Petrova", can be an object.

```java
public class Student {
    String name;
    int age;
}
```

The class above says that every `Student` object can store a `name` and an `age`.

## Creating Objects

Objects are created with the `new` keyword.

```java
Student firstStudent = new Student();
Student secondStudent = new Student();
```

`firstStudent` and `secondStudent` are two different objects created from the same class.

```java
firstStudent.name = "Maria";
firstStudent.age = 20;

secondStudent.name = "Ivan";
secondStudent.age = 22;
```

Each object has its own copy of the fields.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "Maria";
        firstStudent.age = 20;

        Student secondStudent = new Student();
        secondStudent.name = "Ivan";
        secondStudent.age = 22;

        System.out.println(firstStudent.name + " is " + firstStudent.age + " years old.");
        System.out.println(secondStudent.name + " is " + secondStudent.age + " years old.");
    }
}

class Student {
    String name;
    int age;
}
```

Output:

```text
Maria is 20 years old.
Ivan is 22 years old.
```

## Important Notes

- A class is a definition.
- An object is created from a class.
- One class can be used to create many objects.
- Each object can store different data.

## Common Beginner Mistake

Do not confuse the class name with the object variable name.

```java
Student student = new Student();
```

In this line:

- The first `Student` is the class name.
- `student` is the variable name.
- `new Student()` creates the object.
