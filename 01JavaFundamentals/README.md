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

## JVM vs JRE vs JDK

### JVM (Java Virtual Machine)

The JVM is the runtime environment that executes Java bytecode. It provides platform independence by interpreting or compiling bytecode into native machine code for the underlying operating system.

### JRE (Java Runtime Environment)

The JRE is a software package that provides the runtime environment needed to execute Java applications. It includes the JVM, core libraries and other files necessary for Java programs to run.

### JDK (Java Development Kit)

The JDK is a complete toolkit for Java development. It includes the JRE (runtime environment), Development tools like the Java compiler (javac), debugger, and other utilities required to write and build Java applications.

### Key Differences

| Feature  | JVM                  | JRE                      | JDK                               |
| -------- | -------------------- | ------------------------ | --------------------------------- |
| Purpose  | Executes bytecode    | Runs Java applications   | Develops and runs Java programs   |
| Includes | Bytecode execution   | JVM + Core Libraries     | JRE + Compiler, Debugger, Tools   |
| For Whom | End-users (indirect) | End-users (run programs) | Developers (write & compile code) |
