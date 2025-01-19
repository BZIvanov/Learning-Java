# Data types

## Primitive types

Primitive types are the basic building blocks of data in Java. These include:

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

boolean isOnline = true;
```

## Reference types

Reference types store references (or memory addresses) to objects rather than the data itself. These include:

- String

```java
String s = "hello";
```

- Arrays
- Custom objects (instances of classes)

## Additional representation

### int

#### Binary

Binary numbers use the prefix `0b`

```java
int a = 0b1010; // Value will be 10
```

#### Octal

Octal numbers use the prefix `0`

```java
int a = 010; // value will be 8
```

#### Hexadecimal

Hexadecimal numbers use the prefix `0x`

```java
int a = 0x10; // value will be 16
```

### char

```java
char example1 = '\u0022'; // value will be "
char example2 = 65; // value will be A
```
