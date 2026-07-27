# Polymorphism

Polymorphism means "many forms".

In Java, it usually means that the same method call can behave differently depending on the actual object.

---

## Basic Example

```java
public class Animal {
    public void eat() {
        System.out.println("Animal eating");
    }
}
```

```java
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
}
```

```java
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }
}
```

Both `Dog` and `Cat` are animals, but each can have its own version of `eat()`.

## Parent Reference, Child Object

```java
Animal firstAnimal = new Dog();
Animal secondAnimal = new Cat();

firstAnimal.eat();
secondAnimal.eat();
```

Output:

```text
Dog eating
Cat eating
```

The variable type is `Animal`, but the actual objects are `Dog` and `Cat`.

Java chooses the method based on the actual object at runtime.

## Method Overriding

Polymorphism usually works together with method overriding.

Overriding means a child class provides its own version of a method from the parent class.

```java
@Override
public void eat() {
    System.out.println("Dog eating");
}
```

The `@Override` annotation is recommended because it helps catch mistakes.

## Why use Polymorphism?

- **Flexibility:** Write generic code that works for multiple types (e.g., parent references for child objects).
- **Extensibility:** Add new behavior easily by overriding methods in subclasses.
- **Cleaner Code:** Reduce redundant code with shared interfaces or parent classes.

## Key Idea

Polymorphism lets you write code that works with a general type while each specific object provides its own behavior.
