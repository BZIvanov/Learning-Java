# Getters and Setters

Getters and setters are methods used to read and change private fields.

They are common in Java because fields are usually kept private.

## Getter

A getter returns a field value.

```java
public class Student {
    private String name;

    public String getName() {
        return name;
    }
}
```

## Setter

A setter changes a field value.

```java
public class Student {
    private String name;

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }
}
```

The setter can validate the new value before changing the field.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200);

        product.setPrice(1100);
        product.setPrice(-50);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
```

Output:

```text
Laptop
1100.0
```

The second price change is ignored because `-50` is invalid.

## Do You Always Need Both?

No.

Sometimes a field should be readable but not changeable from outside the class.

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

This class has a getter but no setter.

The username is set when the object is created and cannot be changed later through public methods.

## Naming Convention

Java getters and setters usually follow this pattern:

```text
getFieldName()
setFieldName(value)
```

For boolean fields, getters often start with `is`:

```java
public boolean isActive() {
    return active;
}
```
