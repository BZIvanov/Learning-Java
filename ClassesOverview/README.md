# Classes Overview

## Understanding Your First Java Program

```java
public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Let's break down what this program does:

`public class MyFirstClass`, this line creates a class named `MyFirstClass`.

A class is like a **blueprint** or **container** that holds your Java code. Every Java program is built around one or more classes.

For now, you don't need to worry too much about the word `public`. Just know that it's a keyword Java requires in many situations and you'll learn more about it later when discussing object-oriented programming (OOP).

> Note: In Java, the filename should match the public class name. This class should be saved in a file named `MyFirstClass.java`.

---

`public static void main(String[] args)`, this is the **main method**.

When you run a Java program, the Java Virtual Machine (JVM) starts executing the code from this method. You can think of it as the **entry point** of your application.

At this stage, it's perfectly fine to remember one simple rule:

> Every standalone Java program starts running from the `main()` method.

The different keywords (`public`, `static`, `void`) and the parameter (`String[] args`) all have specific purposes, but you'll explore what each one means later in the course.

### Program Flow

When you run this program, Java performs these steps:

1. Finds the `main()` method.
2. Starts executing the code inside it.
3. Executes `System.out.println("Hello World");`.
4. Displays `Hello World` in the console.
5. Reaches the end of the `main()` method, and the program finishes.

## Running a program using the terminal

Below is an example of how to run a program using the terminal without using an IDE.

Here is the content of the program file, which is named `PrintSum.java`:

```java
public class PrintSum {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + 5;

        System.out.println(a + " + " + b + " = " + sum);
    }
}
```

Now in the terminal run the below command to compile the program, this command will create executable file `PrintSum.class`. It will invoke the java compiler.

```
javac PrintSum.java
```

The above command will create the compiled version of our program. With the below command we can execute the program. It will invoke the java runtime.

```
java PrintSum 10 15
```

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

## Content of this section

1. **tasks**
