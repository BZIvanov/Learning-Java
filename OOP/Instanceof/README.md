# instanceof

The `instanceof` operator checks whether an object is an instance of a specific class or interface.

It is useful when a variable has a general type, but you need to know the object's real type.

```java
Animal animal = new Dog("Rex");

if (animal instanceof Dog) {
    System.out.println("This animal is a dog.");
}
```

The expression `animal instanceof Dog` produces a `boolean` value: `true` or `false`.

## Why instanceof Is Useful

With polymorphism, a parent variable can store a child object:

```java
Animal animal = new Dog("Rex");
```

The variable type is `Animal`, but the real object is a `Dog`.

If you need behavior that exists only in `Dog`, Java first needs proof that the object really is a `Dog`.

```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.bark();
}
```

The cast `(Dog)` tells Java to treat the object as a `Dog`.

## Assigning the Check to a Variable

Because `instanceof` returns a boolean value, you can store the result in a boolean variable.

```java
Animal animal = new Dog("Rex");

boolean isDog = animal instanceof Dog;

if (isDog) {
    System.out.println("The animal is a dog.");
}
```

This is useful when the result has a clear meaning or you need to use it more than once.

```java
boolean canBark = animal instanceof Dog;

System.out.println("Can bark: " + canBark);
```

## Pattern Matching with instanceof

Modern Java also supports a shorter form called **pattern matching for instanceof**.

Instead of checking and then casting:

```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.bark();
}
```

you can write:

```java
if (animal instanceof Dog dog) {
    dog.bark();
}
```

In this example:

- `animal instanceof Dog` checks the real type.
- `dog` is a new variable of type `Dog`.
- The `dog` variable is available only inside the `if` block where the check is true.

This avoids writing the cast manually.

## Complete Example

```java
public class Main {
    public static void main(String[] args) {
        Animal firstAnimal = new Dog("Rex");
        Animal secondAnimal = new Cat("Misty");

        printAnimalInfo(firstAnimal);
        printAnimalInfo(secondAnimal);
    }

    public static void printAnimalInfo(Animal animal) {
        boolean isDog = animal instanceof Dog;

        System.out.println("Is dog: " + isDog);

        if (animal instanceof Dog dog) {
            dog.bark();
        } else if (animal instanceof Cat cat) {
            cat.meow();
        }
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " says woof.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(getName() + " says meow.");
    }
}
```

Output:

```text
Is dog: true
Rex says woof.
Is dog: false
Misty says meow.
```

## instanceof and null

If the variable is `null`, `instanceof` returns `false`.

```java
Animal animal = null;

System.out.println(animal instanceof Dog);
```

Output:

```text
false
```

This means `instanceof` itself does not throw a `NullPointerException`.

## When to Use instanceof

Use `instanceof` when:

- You have a general type, such as a parent class or interface.
- You need to check the object's more specific type.
- You need to safely cast before using subtype-specific behavior.

Avoid using too many `instanceof` checks when normal polymorphism would work better.

Prefer this when possible:

```java
animal.makeSound();
```

instead of:

```java
if (animal instanceof Dog dog) {
    dog.bark();
} else if (animal instanceof Cat cat) {
    cat.meow();
}
```

If every type should perform the same kind of action, method overriding is usually cleaner.

## Key Idea

`instanceof` checks an object's real type.
You can store the check in a `boolean`, or use pattern matching to create a typed variable only when the check is true.
