# Static Fields and Methods

The `static` keyword means that something belongs to the class itself, not to one specific object.

## Static Methods

You already used static methods earlier in the repository.

```java
public static void main(String[] args) {
    System.out.println("Hello");
}
```

The `main()` method is static because Java must be able to start the program without creating an object first.

## Instance Method

An instance method belongs to an object.

```java
Student student = new Student("Maria");
student.printName();
```

`printName()` is called on one specific `student` object.

## Static Method

A static method belongs to the class.

```java
Math.max(10, 20);
```

You call it using the class name, not an object.

## Static Fields

A static field is shared by all objects of the class.

```java
public class Student {
    static int studentCount = 0;

    String name;

    public Student(String name) {
        this.name = name;
        studentCount++;
    }
}
```

Every time a new `Student` object is created, the shared `studentCount` value increases.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Student first = new Student("Maria");
        Student second = new Student("Ivan");

        System.out.println(Student.studentCount);
    }
}

class Student {
    static int studentCount = 0;

    String name;

    public Student(String name) {
        this.name = name;
        studentCount++;
    }
}
```

Output:

```text
2
```

## When to Use Static

Use `static` for data or behavior that belongs to the class as a whole.

Good examples:

- A utility method, such as `Math.max()`.
- A constant value, such as `PI`.
- A counter shared by all objects of the same class.

Avoid using `static` just to make code easier to call. If a method needs object data, it should usually be an instance method.

## Static vs Instance

```text
Instance field: each object has its own copy.
Static field: all objects share one copy.

Instance method: called through an object.
Static method: called through a class.
```
