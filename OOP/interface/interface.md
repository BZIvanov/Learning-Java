# Interface

An interface defines a contract that a class can implement.

It describes what methods a class must have, but it usually does not describe exactly how those methods work.

---

## Basic Example

```java
public interface Prey {
    void hide();
}
```

Any class that implements `Prey` must provide a `hide()` method.

```java
public class Cat implements Prey {
    @Override
    public void hide() {
        System.out.println("Cat hiding");
    }
}
```

## The `implements` Keyword

Classes use `implements` to follow an interface.

```java
public class Dog implements Predator {
    @Override
    public void hunt() {
        System.out.println("Dog hunting");
    }
}
```

This means that `Dog` promises to provide all methods from `Predator`.

## Multiple Interfaces

A class can implement more than one interface.

```java
public class Cat implements Prey, Predator {
    @Override
    public void hide() {
        System.out.println("Cat hiding");
    }

    @Override
    public void hunt() {
        System.out.println("Cat hunting");
    }
}
```

This is one reason interfaces are useful in Java. A class can extend only one class, but it can implement multiple interfaces.

## Interface Reference

You can use an interface as a variable type.

```java
Prey prey = new Cat();
prey.hide();
```

The variable type is `Prey`, but the actual object is a `Cat`.

This is another form of polymorphism.

## Interface vs Abstract Class

```text
Abstract class: use when classes share identity and some common code.
Interface: use when classes share a capability or contract.
```

Example:

```text
Dog is an Animal.       Abstract class or inheritance can make sense.
Dog can Hunt.           Interface can make sense.
```

## Key Idea

Use interfaces when you want different classes to promise that they can do the same kind of action.
