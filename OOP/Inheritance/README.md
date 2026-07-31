# Inheritance

Inheritance allows one class to reuse and extend another class.

The class being inherited from is called the **parent class**, **base class**, or **superclass**.

The class that inherits is called the **child class**, **derived class**, or **subclass**.

---

## Basic Example

```java
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}
```

```java
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(getName() + " is barking");
    }
}
```

`Dog` inherits the fields and methods from `Animal`.

```java
Dog dog = new Dog("Rex", 3);

dog.eat();
dog.bark();
```

Output:

```text
Rex is eating
Rex is barking
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
    public Dog(String name, int age) {
        super(name, age);
    }
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

## Inheritance and Encapsulation

Inheritance does not mean fields should be public.

Keep fields private when possible and let child classes use public or protected methods from the parent class.

## Key Idea

Inheritance helps model "is-a" relationships and share common behavior, but it should be used carefully.
