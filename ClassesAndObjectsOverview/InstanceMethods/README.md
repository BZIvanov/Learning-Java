# Instance Methods

An **instance method** is a method that belongs to an object.

Instance methods can use the object's fields.

```java
public class Book {
    String title;
    String author;
    int pages;

    public void printInfo() {
        System.out.println(title + " by " + author + ", " + pages + " pages");
    }
}
```

## Calling an Instance Method

You call an instance method through an object.

```java
Book book = new Book();
book.title = "Effective Java";
book.author = "Joshua Bloch";
book.pages = 416;

book.printInfo();
```

Output:

```text
Effective Java by Joshua Bloch, 416 pages
```

## Methods Can Return Values

An instance method can also calculate and return a value.

```java
public boolean isLongBook() {
    return pages > 300;
}
```

Example:

```java
if (book.isLongBook()) {
    System.out.println("This is a long book.");
}
```

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}

class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
}
```

Output:

```text
15
16
```

## Instance Methods vs Static Methods

Most methods you wrote earlier in the repository used `static`.

Instance methods usually do not use `static` because they work with one specific object.

```java
rectangle.getArea();
```

This means: calculate the area of this exact `rectangle` object.
