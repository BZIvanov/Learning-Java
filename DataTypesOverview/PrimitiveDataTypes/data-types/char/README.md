# char data type

The `char` data type stores a single character. It uses **16 bits** and represents a Unicode code point.

```java
char letter = 'A';
char quote = '"';
char number = 65;      // Unicode value for 'A'
char newLine = '\n';
```

## Character values

A `char` can hold:

- a single visible character: `'A'`, `'z'`, `'7'`
- an escape sequence: `'\n'`, `'\t'`, `'\\'`
- a Unicode code point: `65`, `0x0041`, `\u0041`

```java
char example1 = 'A';
char example2 = '\u0022'; // value: "
char example3 = 65;       // value: A
char example4 = '\n';   // newline character
```

## Unicode characters

Java `char` values represent UTF-16 code units. You can use Unicode escape sequences to store characters from many languages and symbols.

```java
char heart = '\u2665';
char smile = '\u263A';
System.out.println(heart); // ♥
System.out.println(smile); // ☺
```

[Here](https://en.wikipedia.org/wiki/List_of_Unicode_characters) is a list of unicode characters you could use as char data type.

## Character class

The wrapper class `Character` provides useful helper methods for working with characters.

```java
char letter = 'A';
System.out.println(Character.isLetter(letter));      // true
System.out.println(Character.isDigit('7'));         // true
System.out.println(Character.toLowerCase(letter));  // a
System.out.println(Character.isWhitespace(' '));    // true
```

## Common mistakes

- `char c = "A";` is invalid because double quotes define a string.
- `char c = 'AB';` is invalid because `char` holds only one character.
- `char c = 256;` is invalid because values must fit into the `char` range.

Use `char` when you need to store a single character or symbol, especially for text processing and low-level character handling.
