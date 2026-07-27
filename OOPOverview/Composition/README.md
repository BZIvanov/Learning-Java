# Composition

Composition means creating a class that contains objects of other classes as fields.

It describes a "has-a" relationship.

```text
A car has an engine.
An order has a customer.
A library has books.
```

## Basic Example

```java
public class Engine {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
```

```java
public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void printInfo() {
        System.out.println(model + " with " + engine.getHorsePower() + " hp");
    }
}
```

The `Car` class has a field of type `Engine`.

```java
Engine engine = new Engine(150);
Car car = new Car("Toyota Corolla", engine);

car.printInfo();
```

Output:

```text
Toyota Corolla with 150 hp
```

## Why Composition Is Useful

Composition helps you build larger objects from smaller objects.

Instead of putting every field into one large class, you can split the model into meaningful parts.

```java
public class Address {
    private String city;
    private String street;
}

public class Customer {
    private String name;
    private Address address;
}
```

This is easier to understand than placing all customer and address fields into one class.

## Composition vs Simple Fields

A field can be a primitive type:

```java
private int age;
private double price;
```

A field can also be another object:

```java
private Customer customer;
private Address address;
private Engine engine;
```

Both are still fields. The difference is that object fields can have their own fields and methods.

## Key Idea

Use composition when one object naturally contains or uses another object.
