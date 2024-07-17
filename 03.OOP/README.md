# OOP

## Constructor

Constructor is used to create an object of a class. It has the same name as the class.

The constructor has no return type, only methods have it.

A class can have multiple constructors.

### Default constructor

Gets added for us if we don't create our own constructor. It has no arguments.

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
        super(name);  // This MUST be the first line in the subclass constructor
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
