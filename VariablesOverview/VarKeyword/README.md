# The var Keyword

The `var` keyword lets Java figure out the type of a local variable from the value assigned to it.

This is called **local variable type inference**.

```java
var age = 25;
var name = "Maria";
var isActive = true;
```

Java reads the value on the right side and decides the type:

- `age` becomes an `int`
- `name` becomes a `String`
- `isActive` becomes a `boolean`

## var Does Not Mean Dynamic Type

Java is still type-strict.
After Java decides the type, the variable keeps that type.

```java
var age = 25;
age = 30;      // OK
age = "old";   // Error
```

The variable `age` is an `int`, even though the word `int` was not written.

## var Needs a Starting Value

Java must see the value immediately so it can infer the type.

This works:

```java
var score = 100;
```

This does not work:

```java
var score;   // Error
score = 100;
```

Java cannot infer the type from an empty declaration.

## Where var Can Be Used

Use `var` for local variables inside methods, constructors, or blocks.

```java
public class Main {
    public static void main(String[] args) {
        var message = "Hello";
        var count = 3;

        System.out.println(message.repeat(count));
    }
}
```

## Where var Cannot Be Used

You cannot use `var` for fields, method parameters, or method return types.

```java
class Student {
    var name = "Maria";   // Error
}
```

```java
public static var getName() {   // Error
    return "Maria";
}
```

```java
public static void printName(var name) {   // Error
    System.out.println(name);
}
```

## When to Use var

Use `var` when the type is obvious from the right side.

Good examples:

```java
var name = "Maria";
var numbers = new ArrayList<Integer>();
var student = new Student("Ivan");
```

Prefer writing the type when it makes the code easier to understand.

```java
double priceWithTax = calculatePrice();
```

This is clearer than:

```java
var priceWithTax = calculatePrice();
```

because the method name does not show the exact returned type.

## Key Idea

`var` makes local variable declarations shorter, but it does not remove types from Java.
The compiler still decides one exact type, and that type cannot change.
