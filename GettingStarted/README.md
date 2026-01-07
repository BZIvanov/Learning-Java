# Getting started

## JShell

JShell is an interactive REPL (Read-Evaluate-Print Loop) tool. It allows developers to execute Java code snippets interactively without the need to create a full program or class structure. JShell is particularly useful for learning, experimentation, and quick testing.

To use it type in the terminal `jshell` and then you can write simple Java commands.

## IDE

Pick an IDE of your choice for development.

### IntelliJ IDEA

### VSCode

If you are using VSCode as an IDE for Java, make sure to install the extensions from the `Extension Pack for Java` by Microsoft.

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
