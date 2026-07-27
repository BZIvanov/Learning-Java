# OOP

This section contains deeper object-oriented programming topics.

Earlier, **[ClassesAndObjectsOverview](../ClassesAndObjectsOverview/)** introduced classes, objects, fields, constructors, instance methods, static members, packages, and object references.

Then **[OOPOverview](../OOPOverview/)** introduced basic OOP thinking: access modifiers, encapsulation, getters and setters, composition, and class responsibility.

This section goes further into the main OOP features used when classes start working in larger relationships.

---

## The Four Pillars of OOP

The four commonly named pillars of object-oriented programming are:

- **Encapsulation** - keeping data protected inside objects.
- **Inheritance** - allowing one class to reuse and extend another class.
- **Polymorphism** - allowing the same method call to behave differently depending on the object.
- **Abstraction** - focusing on what an object can do instead of every implementation detail.

The pillars are connected. For example, inheritance and polymorphism often work together, and abstraction is often created with abstract classes or interfaces.

---

## Recommended Learning Order

1. **[Encapsulation](Encapsulation/)** - revisit encapsulation as one of the OOP pillars.
2. **[Inheritance](Inheritance/)** - learn parent and child classes with `extends`.
3. **[Polymorphism](Polymorphism/)** - use parent references for child objects and override behavior.
4. **[Abstraction](Abstraction/)** - use abstract classes to describe shared behavior.
5. **[interface](interface/interface.md)** - define contracts that classes can implement.
6. **[enum](enum/enum.md)** - represent a fixed set of named constants.
7. **[generic](generic/)** - create classes that work with different data types.

---

## Inheritance

Inheritance allows one class to reuse fields and methods from another class.

```java
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}
```

`Dog` extends `Animal`, so it can use the behavior from `Animal` and add behavior of its own.

Java classes can extend only one class directly.

---

## `super` and `this`

Use `this` to refer to the current object.

Use `super` to refer to the parent class.

```java
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}
```

When calling a parent constructor with `super(...)`, it must be the first statement in the child constructor.

---

## Method Overriding

Method overriding means a child class provides its own version of a method inherited from a parent class.

```java
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
```

Use `@Override` when overriding methods. It helps the compiler catch mistakes in method names or parameters.

---

## Polymorphism

Polymorphism allows a variable of a parent type to refer to an object of a child type.

```java
Animal animal = new Dog();
animal.makeSound();
```

The variable type is `Animal`, but the actual object is a `Dog`.

If `Dog` overrides `makeSound()`, Java runs the `Dog` version.

---

## Abstraction

Abstraction means focusing on the important behavior and hiding unnecessary details.

In Java, abstraction is commonly created with:

- Abstract classes.
- Interfaces.

An abstract class cannot be instantiated directly.

```java
abstract class Animal {
    public abstract void makeSound();
}
```

A concrete child class must implement the abstract behavior.

```java
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

---

## Other Important Terms

### Overloading

Overloading means creating multiple methods with the same name but different parameter lists.

```java
public int add(int a, int b) {
    return a + b;
}

public double add(double a, double b) {
    return a + b;
}
```

### Hiding

Hiding happens when a static member in a child class has the same name as a static member in a parent class.

Static members are resolved by the reference type, not by the runtime object in the same way overridden instance methods are.

### `final`

The `final` modifier limits changes:

- A final class cannot be extended.
- A final method cannot be overridden.
- A final variable can be assigned only once.

```java
final int maxUsers = 100;
```

## Key Idea

The basic overview section helps you protect and organize individual classes.

This OOP section focuses on relationships between classes and on writing flexible code through inheritance, polymorphism, abstraction, interfaces, enums, and generics.
