# Abstraction

Abstraction means focusing on what an object can do, without exposing every detail of how it does it.

It helps you design classes around important behavior.

For example, if you are working with animals, you may care that every animal can `eat()`. You do not need the parent class to know exactly how every animal eats.

---

## Abstract Classes

An abstract class is a class that cannot be used to create objects directly.

It is meant to be extended by child classes.

```java
abstract class Animal {
    abstract void eat();

    void sleep() {
        System.out.println("Animal sleeping");
    }
}
```

The `eat()` method is abstract because it has no body.

The `sleep()` method is concrete because it has a body.

## Child Classes Must Implement Abstract Methods

```java
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog eating");
    }
}
```

The `Dog` class must provide its own implementation of `eat()`.

## Why Use Abstraction?

- It lets you define common behavior for related classes.
- It forces child classes to provide important methods.
- It hides details that should belong to each child class.
- It helps you write code that works with general types.

## Example Idea

```java
Animal dog = new Dog();
dog.eat();
dog.sleep();
```

The variable type is `Animal`, but the real object is a `Dog`.

This allows code to work with the general idea of an animal while each specific animal controls its own behavior.

## Abstract Class vs Regular Class

```text
Regular class: can be instantiated with new.
Abstract class: cannot be instantiated directly.

Regular method: has a body.
Abstract method: has no body and must be implemented by a child class.
```

## Key Idea

Use abstraction when you want to describe shared behavior while leaving some details for child classes.
