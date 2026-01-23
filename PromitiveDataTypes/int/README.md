# int data type

## Types

### Binary

Binary numbers use the prefix `0b`

```java
int a = 0b1010; // Value will be 10
```

### Octal

Octal numbers use the prefix `0`

```java
int a = 010; // value will be 8
```

### Hexadecimal

Hexadecimal numbers use the prefix `0x`

```java
int a = 0x10; // value will be 16
```

## Integer class

Example method to check the minimum and maximum value for int:

```java
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
```

## Integer Overflow & Underflow

In Java, integers (`int`) have a **fixed size (32 bits)**. This means they can only store values within a specific range:

```java
int min = -2,147,483,648
int max =  2,147,483,647
```

When a calculation goes **beyond these limits**, Java does **not throw an error**. Instead, the value **wraps around**.

### Integer Overflow

Occurs when a value exceeds `Integer.MAX_VALUE`.

```java
int max = Integer.MAX_VALUE;
int result = max + 1;
System.out.println(result);
```

Output: -2147483648. The value wraps from the maximum to the minimum.

### Integer Underflow

Occurs when a value goes below `Integer.MIN_VALUE`.

```java
int min = Integer.MIN_VALUE;
int result = min - 1;
System.out.println(result);
```

Output: 2147483647. The value wraps from the minimum to the maximum.
