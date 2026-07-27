# Encapsulation

Encapsulation means keeping data and the methods that work with that data together inside one class.

It also means protecting the internal state of an object from unsafe direct access.

This topic was introduced in **OOPOverview**. In this section, think of encapsulation as one of the main pillars of object-oriented programming.

---

## Basic Example

```java
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

The fields are private, so outside code cannot directly change them.

```java
Animal animal = new Animal("Rex", 3);

System.out.println(animal.getName());
animal.setAge(4);
```

## Why Not Public Fields?

If fields are public, any code can assign invalid values.

```java
animal.age = -10;
```

That does not make sense for an animal.

With encapsulation, the class controls its own rules through methods.

## Benefits

- The object can protect itself from invalid data.
- The class is easier to change later.
- Other code depends on public methods instead of internal field details.
- Related data and behavior stay together.

## Key Idea

Encapsulation is not only about writing `private`.

It is about giving a class control over its own data and exposing a useful public API.
