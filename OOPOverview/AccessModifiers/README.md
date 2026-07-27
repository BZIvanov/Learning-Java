# Access Modifiers

Access modifiers control where classes, fields, constructors, and methods can be used.

They help you decide which parts of a class are visible to other code and which parts should stay internal.

## Common Modifiers

```text
public     accessible from anywhere
private    accessible only inside the same class
default    accessible inside the same package
protected  accessible inside the same package and from subclasses
```

`default` is used when you do not write an access modifier.

```java
class Product {
    String name; // default access
}
```

## Public

Use `public` for behavior that other code should be allowed to call.

```java
public class Product {
    public void printInfo() {
        System.out.println("Product info");
    }
}
```

## Private

Use `private` for data that should not be changed directly from outside the class.

```java
public class Product {
    private String name;
    private double price;
}
```

Only code inside the `Product` class can access `name` and `price` directly.

## Why Fields Are Usually Private

Public fields allow outside code to put an object into an invalid state.

```java
Product product = new Product();
product.price = -100;
```

A negative price does not make sense.

With private fields, the class can control changes through methods:

```java
public class Product {
    private double price;

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
```

## Beginner Rule

Start with this rule for most classes:

- Fields should be `private`.
- Constructors should usually be `public`.
- Methods that other code needs should be `public`.
- Helper methods used only inside the class should be `private`.

```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (isValidAmount(amount)) {
            balance += amount;
        }
    }

    private boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
```

`deposit()` is public because other code should be able to deposit money.

`isValidAmount()` is private because it is only a helper for the class.
