# The Enhanced `for` Loop (for-each Loop)

The **enhanced `for` loop**, also known as the **for-each loop**, is a simpler way to iterate through elements of an array or collection.

It is called "enhanced" because it provides a cleaner syntax compared to the traditional `for` loop.

Instead of using an index to access each element, the enhanced `for` loop gives you the element directly.

## Note About Arrays

The examples in this section use **arrays**, which are a way to store multiple values together.

Arrays will be explained in detail in a later section of this repository.

For now, don't worry about how arrays work internally or how they are created. The purpose of this page is only to introduce the idea of the **enhanced `for` loop** and how it can be used to go through multiple values one by one.

Think of the array examples as a small preview of a concept that will be covered later.

For now, focus on the main idea:

> An enhanced `for` loop takes each value from a group of values and processes them one at a time.

---

# Traditional `for` Loop vs Enhanced `for` Loop

Suppose we have an array:

```java
int[] numbers = {10, 20, 30, 40};
```

Using a traditional `for` loop:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

Output:

```text
10
20
30
40
```

The loop uses an index (`i`) to access each element.

With an enhanced `for` loop:

```java
for (int number : numbers) {
    System.out.println(number);
}
```

Output:

```text
10
20
30
40
```

The loop automatically goes through each element in the array.

---

# Enhanced `for` Loop Syntax

The basic structure is:

```java
for (dataType variable : array) {
    // Code to execute
}
```

Example:

```java
String[] names = {"Alice", "Bob", "Charlie"};

for (String name : names) {
    System.out.println(name);
}
```

Output:

```text
Alice
Bob
Charlie
```

The loop creates a variable (`name`) that holds the current element during each iteration.

---

# How the Enhanced `for` Loop Works

Consider this example:

```java
int[] numbers = {5, 10, 15};

for (int number : numbers) {
    System.out.println(number);
}
```

The loop works like this:

| Iteration | Current value of `number` | Action     |
| --------- | ------------------------- | ---------- |
| 1         | `5`                       | Print `5`  |
| 2         | `10`                      | Print `10` |
| 3         | `15`                      | Print `15` |

The loop automatically moves to the next element until all elements have been processed.

---

# Enhanced `for` Loop with Strings

The enhanced `for` loop is commonly used with arrays of Strings.

Example:

```java
String[] fruits = {"Apple", "Banana", "Orange"};

for (String fruit : fruits) {
    System.out.println(fruit);
}
```

Output:

```text
Apple
Banana
Orange
```

---

# Enhanced `for` Loop vs Traditional `for` Loop

Both loops can process arrays, but they have different strengths.

## Enhanced `for` Loop

Advantages:

- Shorter and easier to read.
- No need to manage an index.
- Less chance of index-related mistakes.

Example:

```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

---

## Traditional `for` Loop

Advantages:

- Gives access to the index.
- Allows changing the order of iteration.
- Allows skipping or jumping between positions.

Example:

```java
for (int i = 0; i < fruits.length; i++) {
    System.out.println(i + ": " + fruits[i]);
}
```

Output:

```text
0: Apple
1: Banana
2: Orange
```

---

# Changing Elements Inside an Enhanced `for` Loop

A common beginner mistake is expecting the enhanced `for` loop variable to modify the original array.

Example:

```java
int[] numbers = {1, 2, 3};

for (int number : numbers) {
    number = 0;
}
```

The array remains unchanged:

```text
1
2
3
```

The variable `number` is only a temporary copy of each value.

If you need to change specific elements, the traditional `for` loop is usually a better choice because it provides access to the index.

Example:

```java
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = 0;
}
```

Now the array becomes:

```text
0
0
0
```

---

# When Should You Use an Enhanced `for` Loop?

Use an enhanced `for` loop when:

- You only need to read each element.
- You don't need the element's position.
- You want simpler and cleaner code.

Use a traditional `for` loop when:

- You need the index.
- You need to modify elements.
- You need more control over the iteration.
