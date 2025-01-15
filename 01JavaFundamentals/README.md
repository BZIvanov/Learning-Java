# Java Fundamentals

## JShell

JShell is an interactive REPL (Read-Evaluate-Print Loop) tool. It allows developers to execute Java code snippets interactively without the need to create a full program or class structure. JShell is particularly useful for learning, experimentation, and quick testing.

To use it type in the terminal `jshell` and then you can write simple Java commands.

## Primitive types

- byte
- short
- int
- long
- float
- double
- char
- boolean

```java
byte b = 23; // 8 bits
short s = 21000; // 16 bits
int i = 45000; // 32 bits
long l = 12345678912L; // 64 bits

float f = 4.5f;
double d = 3.42345234234423;

char c = 'b';

boolean bool = true;
```

## Reference types

- String

```java
String s = "hello";
```

## Object

Object is an instance of a class.

## StringBuilder

StringBuilder making working with strings very fast because for example concatenating is usually slow operation.

Basic example:
`StringBuilder sb = new StringBuilder();`

It is operating the string with methods. Example methods are _.append_ and more

## Access modifiers

Access modifiers are keywords to control the visibility and accessibility of the class members.

There are 4 types

- public - accessible from anywhere within the program
- protected - accessible from anywhere the same package and its subclasses outside the package
- default - accessible from anywhere within the same package. If we don't provide the access modifier, default will be used
- private - accessible from anywhere within the same class

## Static modifier

It indicates that a member belongs to the class itself, rather than to any instance of the class.

## String pool

A string pool in Java, also known as the interned string pool or string intern pool, is a special memory area in the Java heap where string literals are stored. This mechanism optimizes memory usage and improves performance by storing only one copy of each distinct string value, which can be shared among multiple variables.
