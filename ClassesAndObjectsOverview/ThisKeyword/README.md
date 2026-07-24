# The `this` Keyword

The `this` keyword means **the current object**.

It is most often used when a constructor or method parameter has the same name as a field.

```java
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

In this constructor:

- `this.name` means the field named `name`.
- `name` means the constructor parameter named `name`.

## Why `this` Is Needed

Without `this`, Java uses the closest variable with that name.

```java
public Student(String name, int age) {
    name = name;
    age = age;
}
```

The code above does not set the object's fields. It only assigns each parameter to itself.

The correct version is:

```java
public Student(String name, int age) {
    this.name = name;
    this.age = age;
}
```

## Using `this` in Methods

You can also use `this` inside instance methods.

```java
public void rename(String name) {
    this.name = name;
}
```

This method changes the current object's `name` field.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Maria", 20);

        student.rename("Maria Petrova");

        System.out.println(student.name);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void rename(String name) {
        this.name = name;
    }
}
```

Output:

```text
Maria Petrova
```

## Important Note

You do not always have to write `this`.

This works:

```java
public void printName() {
    System.out.println(name);
}
```

Java understands that `name` refers to the object's field if there is no local variable or parameter with the same name.

Use `this` when it makes the code clearer or when it is needed to avoid a naming conflict.
