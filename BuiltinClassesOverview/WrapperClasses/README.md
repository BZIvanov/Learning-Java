# Wrapper classes, boxing, and unboxing

Java has eight primitive types for simple values such as numbers, characters,
and true/false conditions. Java also provides a class corresponding to each
primitive type. These classes are called **wrapper classes** because a wrapper
object represents, or "wraps," a primitive value.

Complete the [Data Types overview](../../DataTypesOverview/README.md) and the
[Built-in Classes overview](../README.md) first. This lesson builds on the
difference between primitive and reference types and on the idea that Java's
standard library provides classes such as `Integer`.

## Primitive types and their wrappers

Each primitive type has one corresponding wrapper class:

| Primitive type | Wrapper class | Example value |
| --- | --- | --- |
| `boolean` | `Boolean` | `Boolean.TRUE` |
| `byte` | `Byte` | `Byte.valueOf((byte) 10)` |
| `short` | `Short` | `Short.valueOf((short) 10)` |
| `int` | `Integer` | `Integer.valueOf(10)` |
| `long` | `Long` | `Long.valueOf(10L)` |
| `float` | `Float` | `Float.valueOf(10.5f)` |
| `double` | `Double` | `Double.valueOf(10.5)` |
| `char` | `Character` | `Character.valueOf('A')` |

Wrapper class names begin with an uppercase letter because they are classes.
Most names are the capitalized primitive name, but `int` uses `Integer` and
`char` uses `Character`.

All eight wrappers are in the `java.lang` package, so they do not need an
`import` statement.

## Why wrapper classes exist

Primitives and wrapper objects can represent the same kinds of values, but
they serve different purposes:

- Primitives are the usual choice for calculations and simple local values.
- Some Java features and library APIs require an object rather than a
  primitive value.
- Generic types, introduced later, can use `Integer` but cannot use `int`.
- A wrapper variable can contain `null`; a primitive variable cannot.
- Wrapper classes provide useful constants and conversion methods, such as
  `Integer.MAX_VALUE` and `Integer.parseInt`.

Wrapper objects are **immutable**. Their stored values do not change after the
objects are created. Assigning a different value to a wrapper variable gives
the variable a different wrapper value; it does not modify the existing
object.

## Explicit boxing

**Boxing** converts a primitive value to its corresponding wrapper type.

Call the wrapper's `valueOf` method when the conversion should be explicit:

```java
int primitiveScore = 42;
Integer boxedScore = Integer.valueOf(primitiveScore);
```

After the conversion, `primitiveScore` has type `int` and `boxedScore` has type
`Integer`. Both represent the value `42`.

The same pattern works for the other wrappers:

```java
double primitivePrice = 19.99;
Double boxedPrice = Double.valueOf(primitivePrice);

char primitiveGrade = 'A';
Character boxedGrade = Character.valueOf(primitiveGrade);
```

Prefer `valueOf` to wrapper constructors such as `new Integer(42)`. The wrapper
constructors are deprecated, and `valueOf` may reuse an existing immutable
object when that is appropriate.

## Explicit unboxing

**Unboxing** converts a wrapper value to its corresponding primitive type.
Each wrapper provides a method named after its primitive type:

```java
Integer boxedScore = Integer.valueOf(42);
int primitiveScore = boxedScore.intValue();

Double boxedPrice = Double.valueOf(19.99);
double primitivePrice = boxedPrice.doubleValue();

Character boxedGrade = Character.valueOf('A');
char primitiveGrade = boxedGrade.charValue();
```

Methods such as `intValue()`, `doubleValue()`, and `charValue()` make the
conversion visible in the source code.

## Autoboxing and auto-unboxing

Java can insert boxing and unboxing conversions automatically when the source
and target types require them.

**Autoboxing** is automatic conversion from a primitive to its wrapper:

```java
Integer score = 42;
```

This is approximately equivalent to:

```java
Integer score = Integer.valueOf(42);
```

**Auto-unboxing**, often shortened to **unboxing**, is automatic conversion
from a wrapper to its primitive:

```java
Integer boxedScore = 42;
int score = boxedScore;
```

This is approximately equivalent to:

```java
int score = boxedScore.intValue();
```

The compiler determines whether the surrounding code needs a primitive or a
reference type and inserts the permitted conversion. No cast is needed.

Java can also apply these conversions when values are passed to methods or
returned from methods. Those cases will become clearer after the
[Methods](../../MethodsOverview/README.md) section.

## Wrappers in arithmetic

Numeric operators work with primitive numeric values. When a wrapper appears
in an arithmetic expression, Java unboxes it first:

```java
Integer price = 10;
int total = price + 5;

System.out.println(total); // 15
```

The expression `price + 5` unboxes `price` from `Integer` to `int`, then adds
the two primitive values.

An increment can involve both conversions:

```java
Integer count = 3;
count++;

System.out.println(count); // 4
```

Conceptually, Java unboxes `count`, adds `1`, and boxes the result into another
`Integer` value. The immutable wrapper object itself is not changed.

## Unboxing null

A wrapper is a reference type, so its value can be `null`:

```java
Integer number = null;
```

A primitive cannot contain `null`. If Java tries to unbox a `null` wrapper,
the program throws a `NullPointerException`:

```java
Integer boxedNumber = null;
int number = boxedNumber; // NullPointerException
```

The automatic conversion can make this mistake less obvious. Before unboxing,
make sure a wrapper that may contain `null` actually has a value.

The later [Object references](../../ClassesAndObjectsOverview/ObjectReferences/README.md)
section explains `null` and reference variables in more depth.

## Parsing is different from boxing

Parsing converts text into a numeric value. Boxing converts an existing
primitive value into a wrapper representation. They solve different problems.

`Integer.parseInt` parses text and returns a primitive `int`:

```java
int primitiveNumber = Integer.parseInt("42");
```

`Integer.valueOf` has an overload that parses text and returns an `Integer`:

```java
Integer wrapperNumber = Integer.valueOf("42");
```

The second example produces a wrapper, but the conversion from `String` is
parsing rather than boxing. Boxing specifically starts with a primitive value.

Invalid numeric text causes both methods to throw a
`NumberFormatException`. Exception handling is covered in a later section.

## Preview: wrappers and generic collections

Generic types work with reference types, not primitive types. This is why a
list of whole numbers is written as `List<Integer>`, not `List<int>`:

```java
List<Integer> scores = new ArrayList<>();

scores.add(10);        // boxes int to Integer
int first = scores.get(0); // unboxes Integer to int
```

This is a preview. The `List` and `ArrayList` types, their imports, and their
operations are explained later in [List basics](../../Lists/Basics/README.md).

## Preview: comparing wrappers

Wrapper values are objects. When comparing the values represented by two
wrappers, use `equals`:

```java
Integer first = 1000;
Integer second = 1000;

System.out.println(first.equals(second)); // true
```

Do not rely on `first == second` for wrapper value comparison. The `==`
operator compares object references in this situation, and Java may reuse some
boxed objects. This can make `==` appear to work for some values but not for
others.

The distinction is explained fully in the later
[Object references](../../ClassesAndObjectsOverview/ObjectReferences/README.md)
section.

## Choosing between a primitive and a wrapper

Prefer a primitive when the value is required and the code performs ordinary
calculations. Use a wrapper when an API or generic type requires an object, or
when the absence of a value must deliberately be represented with `null`.

Calling a wrapper's static utility method does not require storing values in
wrappers. For example, this code correctly keeps the result as a primitive:

```java
int port = Integer.parseInt("8080");
```

Automatic conversion makes primitives and wrappers convenient to mix, but the
distinction still matters for `null`, comparison, and unnecessary object
creation.

## Common mistakes

- Treating parsing and boxing as the same conversion.
- Forgetting that unboxing `null` throws a `NullPointerException`.
- Using `==` instead of `equals` to compare wrapper values.
- Writing a primitive as a generic type argument, such as `List<int>`.
- Using wrapper types everywhere even when a required primitive is simpler.
- Assuming `count++` changes an immutable wrapper object.

For the precise language rules, see the Java Language Specification sections
on
[`boxing conversion`](https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html#jls-5.1.7)
and
[`unboxing conversion`](https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html#jls-5.1.8).
The Java 21 API documentation describes the methods and constants provided by
[`Integer`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html)
and the other wrapper classes.
