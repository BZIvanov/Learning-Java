# Inheritance

Inheritance allows one class to reuse and extend another class.

The class being inherited from is called the **parent class**, **base class**, or **superclass**.

The class that inherits is called the **child class**, **derived class**, or **subclass**.

---

## Basic Example

```java
public class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println("Animal eating");
    }
}
```

```java
public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barking");
    }
}
```

`Dog` inherits the fields and methods from `Animal`.

```java
Dog dog = new Dog();
dog.name = "Rex";
dog.age = 3;

dog.eat();
dog.bark();
```

Output:

```text
Animal eating
Dog barking
```

## The `extends` Keyword

In Java, inheritance is created with `extends`.

```java
public class Dog extends Animal {
}
```

This means:

```text
Dog is an Animal.
```

Use inheritance when there is a real "is-a" relationship.

Good examples:

- `Dog` is an `Animal`.
- `Car` is a `Vehicle`.
- `Manager` is an `Employee`.

## Single Class Inheritance

One Java class can directly extend only one class.

```java
public class Dog extends Animal {
}
```

A class cannot directly extend two classes.

Java uses interfaces when a class needs to follow multiple contracts.

## Why use Inheritance?

- **Code Reusability:** Write shared logic once in the parent class.
- **Extensibility:** Add new features by extending existing classes.
- **Hierarchy:** Represent real-world relationships (e.g., `Bird` is a type of `Animal`).

## Be Careful

Do not use inheritance only to reuse a few lines of code.

If the relationship is "has-a", use composition instead.

```text
A car has an engine.       Composition
A car is a vehicle.        Inheritance
```

## Implicit Inheritance: The Object Class

In Java, all classes automatically inherit from the built-in `Object` class if they do not explicitly extend another class.

`Object` is the root superclass of all Java classes.

## Key Idea

Inheritance helps model "is-a" relationships and share common behavior, but it should be used carefully.
