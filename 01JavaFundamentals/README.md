# Java Fundamentals

## Object

Object is an instance of a class.

## StringBuilder

StringBuilder making working with strings very fast because for example concatenating is usually slow operation.

Basic example:
`StringBuilder sb = new StringBuilder();`

It is operating the string with methods. Example methods are _.append_ and more

## Access modifiers

Access modifiers are keywords to control the visibility and accessibility of the class members.

There are 4 types:

- **public** - accessible from anywhere within the program
- **protected** - accessible from anywhere the same package and its subclasses outside the package
- **default** - accessible from anywhere within the same package. If we don't provide the access modifier, default will be used
- **private** - accessible from anywhere within the same class

Protected and private cannot be used on a class.

## Static modifier

It indicates that a member belongs to the class itself, rather than to any instance of the class.

## String pool

A string pool in Java, also known as the interned string pool or string intern pool, is a special memory area in the Java heap where string literals are stored. This mechanism optimizes memory usage and improves performance by storing only one copy of each distinct string value, which can be shared among multiple variables.

## Java code compilation process

1. **Write the Java File** - You write your code in a text file with a .java extension using a text editor or an Integrated Development Environment (IDE). For example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

2. **Compile the Java File** - The Java file is passed to the Java Compiler (javac). The compiler translates your human-readable Java source code into an intermediate binary format called **bytecode**. The bytecode is stored in a file with a `.class` extension, e.g., `HelloWorld.class`.
3. **Run the Bytecode with the JVM** - The compiled bytecode is not directly executed by the hardware. Instead, it is interpreted or compiled further by the **Java Virtual Machine (JVM)**. The JVM's job is to make the bytecode portable and executable on any machine with a compatible JVM implementation.
4. **Convert Bytecode to Native Machine Code** - The JVM uses a component called the **Just-In-Time (JIT) Compiler** to translate bytecode into native machine code (binary code) that the underlying hardware can execute. This conversion happens at runtime and ensures platform independence.
5. **Execution** - The native machine code is executed by the processor, and the program produces the desired output, e.g., printing "Hello, World!" to the console.
