# Encapsulation

Encapsulation means keeping an object's data and behavior together inside one class.

It also means protecting the object's data from unsafe direct changes.

## Without Encapsulation

```java
public class Student {
    public String name;
    public int age;
}
```

This allows any code to do this:

```java
Student student = new Student();
student.age = -5;
```

The program compiles, but the object now contains invalid data.

## With Encapsulation

```java
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

Now the `Student` class controls how the age can change.

## Encapsulation Is About Rules

Objects should protect their own rules.

Examples:

- A bank account should not accept a negative deposit.
- A product should not have a negative price.
- A username should not be blank.
- An order total should not be changed directly from outside the order.

## Example

```java
public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

The field `balance` is private. Other code cannot directly assign any value to it.

Instead, the object exposes meaningful actions: `deposit()` and `withdraw()`.

## Key Idea

Encapsulation lets a class say:

```text
You can use me through these public methods,
but you cannot freely change my internal data.
```
