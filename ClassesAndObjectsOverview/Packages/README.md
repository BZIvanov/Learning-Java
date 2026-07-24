# Packages

A **package** is a way to organize related Java classes.

Packages work similarly to folders on your computer, but they also become part of the class name.

## Why Packages Are Useful

Packages help you:

- Organize classes by topic or feature.
- Avoid class name conflicts.
- Make larger projects easier to navigate.
- Separate different parts of an application.

For example, a small shop application might have classes organized like this:

```text
shop
  Main.java
  products
    Product.java
  orders
    Order.java
```

## Declaring a Package

The package declaration must be the first line in the Java file.

```java
package products;

public class Product {
    String name;
    double price;
}
```

If `Product.java` is inside a folder named `products`, the package name should match that folder.

## Importing a Class

If one class wants to use a class from another package, it can import it.

```java
import products.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
    }
}
```

## Package and Folder Example

```text
src
  Main.java
  products
    Product.java
```

`Product.java`:

```java
package products;

public class Product {
    public String name;
    public double price;
}
```

`Main.java`:

```java
import products.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Keyboard";
        product.price = 49.99;

        System.out.println(product.name + " costs " + product.price);
    }
}
```

## Important Notes

- The package declaration must be at the top of the file.
- The folder structure should match the package name.
- Classes from `java.lang`, such as `String` and `System`, do not need imports.
- Classes from other packages usually need imports.

You will see packages more often as your projects become larger.
