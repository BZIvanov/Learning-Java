# OOP

The 4 pillars of OOP are:

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

## Constructor

A constructor is a special method in a class used to initialize objects. It has the following characteristics:

1. **Same Name as the Class** - The constructor's name must match the class name
2. **No Return Type** - Constructors do not have a return type, not even `void`
3. **Automatic Invocation** - A constructor is called automatically when an object of the class is created
4. **Overloading** - A class can have multiple constructors with different parameter lists (constructor overloading).

```java
class Animal {
    private String name;
    private int age;

    // Non-parameterized constructor
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Non-parameterized constructor called.");
    }

    // Parameterized constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display the animal's details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class App {
    public static void main(String[] args) {
        // Using the non-parameterized constructor
        Animal genericAnimal = new Animal();
        genericAnimal.displayInfo();

        // Using the parameterized constructor
        Animal specificAnimal = new Animal("Dog", 5);
        specificAnimal.displayInfo();
    }
}
```

### Default constructor

If no constructor is explicitly defined in a class, the Java compiler automatically provides a **default constructor**. This constructor has no arguments and initializes the object with default values (e.g., `null` for objects, `0` for integers, etc.).

However, if any constructor (default or parameterized) is explicitly declared in the class, the compiler will not add a default constructor.

## super and this

```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal created: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        // Call the superclass constructor (Animal) to initialize the name field
        super(name); // This MUST be the first line in the subclass constructor
        this.breed = breed;
        System.out.println("Dog created: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador");
    }
}
```

## Override annotation

Using the `@Override` annotation is not strictly required for method overriding. However, it's strongly recommended for the following benefits:

- It helps catch potential errors during compilation, such as typos in method names or argument lists.
- It enhances code readability by explicitly stating the intention to override a method.
- It provides an additional layer of safety during refactoring when the superclass method signature changes.

## Overloading

Providing multiple methods with the same name, but different signatures due to a different parameter list.

## Hiding

Hiding a static member of a parent class with a static member of the same name in a child class.

## abstract class

Class that cannot be instantiated.

```java
abstract class MyAbstractClass {
    public void myConcreteMethod() {
        System.out.println("Concrete method");
    }

    abstract void myAbstractMethod();
}
```

## final

Modifier that changes the behaviour of a class, method or variable.

- When a class is final, it cannot be extended
- When a method is final it cannot be overridden
- Whan a variable is final it can only be assigned a value once
