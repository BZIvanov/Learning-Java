# Variable Arguments (Varargs)

A method normally declares a fixed number of parameters. A **variable argument**
parameter, usually called **varargs**, allows a method to receive zero or more
values of the same type.

Write three dots (`...`) between the parameter type and its name:

```java
public static void printNames(String... names) {
    for (String name : names) {
        System.out.println(name);
    }
}
```

The method can now be called with different numbers of arguments:

```java
printNames();
printNames("Alice");
printNames("Alice", "Bob", "Charlie");
```

The first call is valid. It gives the method an empty array, so the loop does
not print anything.

## Varargs Behaves Like an Array

Inside the method, a varargs parameter is an array. This means that `names` in
the previous example has the type `String[]`, and array features such as
`length` and indexes can be used:

```java
public static void showArguments(String... arguments) {
    System.out.println("Number of arguments: " + arguments.length);

    for (int i = 0; i < arguments.length; i++) {
        System.out.println(i + ": " + arguments[i]);
    }
}
```

An existing array can also be passed directly:

```java
String[] names = { "Alice", "Bob" };
printNames(names);
```

These two method declarations cannot exist together because Java treats them
as the same parameter type:

```java
public static void printNames(String... names) { }
public static void printNames(String[] names) { } // compilation error
```

## Combining Varargs With Other Parameters

A method may have ordinary parameters before its varargs parameter:

```java
public static void printMessages(String prefix, String... messages) {
    for (String message : messages) {
        System.out.println(prefix + message);
    }
}

printMessages("INFO: ", "Started", "Finished");
```

The varargs parameter must be the **last** parameter because Java needs to know
where its arguments end. A method can therefore have only one varargs
parameter:

```java
public static void invalid(String... names, int count) { } // compilation error
public static void invalid(int... numbers, String... words) { } // compilation error
```

## Varargs and Primitive Types

Varargs works with reference types and primitive types:

```java
public static int sum(int... numbers) {
    int total = 0;

    for (int number : numbers) {
        total += number;
    }

    return total;
}

System.out.println(sum());          // 0
System.out.println(sum(4));         // 4
System.out.println(sum(4, 5, 6));   // 15
```

Here, `numbers` behaves like an `int[]` inside the method.

## Varargs and Method Overloading

A fixed-argument overload is chosen before a compatible varargs overload:

```java
public static void display(String value) {
    System.out.println("One value: " + value);
}

public static void display(String... values) {
    System.out.println("Many values: " + values.length);
}

display("Java");          // calls display(String)
display("Java", "Kotlin"); // calls display(String...)
```

Avoid overloads whose varargs forms make a call ambiguous. For example:

```java
public static void process(int... values) { }
public static void process(String... values) { }

process(); // compilation error: both methods match
```

## The `main` Method

The usual `main` declaration uses an array:

```java
public static void main(String[] args) {
}
```

It may also be written with varargs because `String...` becomes `String[]`:

```java
public static void main(String... args) {
}
```

The array form is more common, but both are valid entry points for a Java
program.

## When to Use Varargs

Use varargs when:

- callers may naturally provide different numbers of values;
- all optional values have the same type;
- accepting no values is meaningful.

Use an ordinary array or collection parameter when the caller already works
with a collection of values, or when accepting zero arguments would hide a
mistake.

## Key Rules

- Declare varargs as `Type... parameterName`.
- A caller may provide zero or more arguments of that type.
- Inside the method, the parameter behaves like an array.
- An existing array can be passed as the argument.
- A method can declare only one varargs parameter.
- The varargs parameter must be the final parameter.
- Be careful when combining varargs with method overloading.
