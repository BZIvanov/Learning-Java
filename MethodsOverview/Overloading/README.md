# Method Overloading

Sometimes you want several methods to perform the **same general task**, but with different kinds or amounts of information.

Instead of creating methods with different names, Java allows you to create multiple methods with the **same name**, as long as their **parameter lists are different**. This is called **method overloading**.

Method overloading makes your code easier to read because similar operations can share the same method name.

---

## A Simple Example

Suppose you want to greet a person.

Sometimes you only know their name:

```java
greet("Alice");
```

Other times, you also know their age:

```java
greet("Alice", 25);
```

You can create two versions of the `greet()` method:

```java
public class MyFirstClass {

    public static void main(String[] args) {
        greet("Alice");
        greet("Bob", 30);
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
```

Program output:

```text
Hello, Alice!
Hello, Bob! You are 30 years old.
```

Although both methods are named `greet`, Java knows which one to use based on the arguments you provide.

---

## How Java Chooses a Method

When you call a method, Java looks at the **number** and **types** of the arguments.

For example:

```java
greet("Alice");
```

matches:

```java
public static void greet(String name)
```

while:

```java
greet("Bob", 30);
```

matches:

```java
public static void greet(String name, int age)
```

Since the parameter lists are different, Java can determine which method to execute.

---

## Another Example

Overloading isn't limited to strings. Here are two versions of an `add()` method:

```java
public static int add(int a, int b) {
    return a + b;
}

public static int add(int a, int b, int c) {
    return a + b + c;
}
```

Calling:

```java
System.out.println(add(5, 3));
System.out.println(add(5, 3, 2));
```

produces:

```text
8
10
```

Both methods perform the same task—adding numbers—but one accepts two numbers while the other accepts three.

---

## What Makes Two Methods Different?

Methods can be overloaded by changing their **parameter list**, for example:

- The **number** of parameters.
- The **types** of parameters.
- Both the number and the types.

For example, these are all different methods:

```java
print(String message)

print(String message, int times)

print(int number)
```

---

## What Does _Not_ Count as Overloading?

Changing only the **return type** does **not** create a new overloaded method.

For example, the following code is **not allowed**:

```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(int a, int b) {
    return a + b;
}
```

These methods have identical parameter lists, so Java cannot tell them apart when they are called.

---

## Why Use Method Overloading?

Method overloading helps make your code:

- **More readable** by using one method name for similar tasks.
- **More intuitive** because users of your code don't have to remember multiple method names.
- **More organized** since related functionality is grouped together.

Instead of creating methods like:

```java
printText();
printNumber();
printTextWithTimes();
```

you can simply use:

```java
print("Hello");
print(42);
print("Hello", 3);
```

The method name stays the same, while the parameters describe exactly what you want to do.
