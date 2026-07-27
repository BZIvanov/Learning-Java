# OOP Overview

In the previous section, you learned how to create classes, objects, fields, constructors, instance methods, static members, packages, and object references.

This section takes the next natural step: how to use those building blocks to write code that is easier to protect, organize, and extend.

Object-oriented programming is not only about creating classes. It is about deciding:

- What each class is responsible for.
- Which data should be hidden from direct access.
- Which methods should be available to other code.
- How objects can work together to model a larger program.

---

## From Classes to OOP Thinking

When you first create classes, it is common to make fields directly accessible:

```java
public class BankAccount {
    public String owner;
    public double balance;
}
```

This works, but it allows any code to change the object in unsafe ways:

```java
BankAccount account = new BankAccount();
account.balance = -5000;
```

A real bank account should not be able to have its balance changed freely from outside the class.

OOP helps solve this by keeping important data inside the object and exposing controlled behavior through methods.

```java
public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

Now the object protects its own rules.

---

## The Main Idea

An object should combine:

- **State** - the data it stores in fields.
- **Behavior** - the actions it performs with methods.
- **Rules** - the conditions that keep the object valid.

Example:

```java
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }
}
```

The `Product` class does not only store a price. It also makes sure the price is not negative.

---

## Basic OOP Concepts

### Access Control

Access modifiers decide where a class, field, constructor, or method can be used.

The most common modifiers are:

- `public` - accessible from anywhere.
- `private` - accessible only inside the same class.
- default, or package-private - accessible inside the same package when no modifier is written.
- `protected` - useful with inheritance, which is covered later.

Beginner rule:

- Make fields `private`.
- Use methods to control how the fields are read or changed.

### Encapsulation

**Encapsulation** means keeping data and the methods that work with that data together inside one class.

It also usually means hiding fields from direct access:

```java
private String name;
private int age;
```

Then you expose only the operations that make sense:

```java
public String getName() {
    return name;
}

public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    }
}
```

### Getters and Setters

A **getter** returns a field value.

A **setter** changes a field value.

```java
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }
}
```

Not every field needs both a getter and a setter.

For example, a field can be read-only after the constructor sets it:

```java
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
```

### Class Responsibility

A class should have a clear purpose.

Good class names usually describe one thing:

```text
Student
Course
Book
Order
Invoice
BankAccount
```

Try to avoid classes that do too many unrelated jobs.

For example, a `Student` class should store and manage student data. It should not also read files, print menus, connect to a database, and calculate unrelated statistics.

### Composition

**Composition** means building one class by using objects of other classes as fields.

This is often described as a "has-a" relationship.

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

A `Car` has an `Engine`.

Composition is one of the most useful tools in basic OOP because it lets you build larger models from smaller classes.

---

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Maria");
        Order order = new Order(customer);

        order.addItem("Keyboard", 79.99);
        order.addItem("Mouse", 34.50);

        order.printSummary();
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private Customer customer;
    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        this.total = 0;
    }

    public void addItem(String itemName, double price) {
        if (price > 0) {
            total += price;
            System.out.println("Added: " + itemName);
        }
    }

    public void printSummary() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total: " + total);
    }
}
```

Output:

```text
Added: Keyboard
Added: Mouse
Customer: Maria
Total: 114.49
```

In this example:

- `Customer` stores customer data.
- `Order` stores order data and controls how the total changes.
- `Order` uses a `Customer` object through composition.
- Fields are private, so outside code cannot freely change object data.

---

## Recommended Learning Order

1. **[AccessModifiers](AccessModifiers/)** - learn how visibility works.
2. **[Encapsulation](Encapsulation/)** - protect object data with methods.
3. **[GettersAndSetters](GettersAndSetters/)** - expose controlled access to private fields.
4. **[Composition](Composition/)** - connect objects together.
5. **[ClassDesignBasics](ClassDesignBasics/)** - think about class responsibility and clean object models.

## Key Idea

The first goal of OOP is not to use complicated syntax.

The first goal is to create objects that keep their data valid and make your program easier to understand.
