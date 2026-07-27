# Class Design Basics

Class design means deciding what each class should represent and what responsibility it should have.

Good class design makes code easier to read and change.

## Start With a Real Thing or Concept

Useful classes often represent things from the problem you are solving.

Examples:

```text
Student
Course
Book
Library
Product
Order
BankAccount
```

Each class should have a clear reason to exist.

## Ask Three Questions

When designing a class, ask:

- What data does this object need?
- What actions should this object perform?
- What rules should this object protect?

Example for `BankAccount`:

```text
Data: owner, balance
Actions: deposit, withdraw, print balance
Rules: deposit must be positive, withdrawal cannot be larger than balance
```

## Keep Responsibilities Focused

A class should not do everything.

This class name is too broad:

```text
ApplicationManager
```

It probably knows too much and does too much.

These names are more focused:

```text
Student
StudentRepository
StudentPrinter
GradeCalculator
```

You do not need to split every small program into many classes immediately, but the habit becomes important as programs grow.

## Put Behavior Near the Data

If a method mostly works with the fields of one class, it probably belongs inside that class.

Instead of this:

```java
double area = rectangle.width * rectangle.height;
```

Prefer this:

```java
double area = rectangle.getArea();
```

The `Rectangle` object knows how to calculate its own area.

## Avoid Invalid Objects

Constructors and setters should help create valid objects.

```java
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getArea() {
        return width * height;
    }
}
```

## Key Idea

A good class has a clear purpose, protects its data, and exposes methods that make sense for the object it represents.
