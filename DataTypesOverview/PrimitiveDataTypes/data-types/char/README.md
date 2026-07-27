# char data type

The `char` data type stores a single UTF-16 code unit. For many common characters, this is the same as storing one visible character.

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
- a numeric character value: `65`, `0x0041`, `'\u0041'`

```java
char example1 = 'A';
char example2 = '\u0022'; // value: "
char example3 = 65;       // value: A
char example4 = '\n';     // newline character
```

## Unicode characters

You can use Unicode escape sequences to store many characters and symbols.

```java
char heart = '\u2665';
char smile = '\u263A';
System.out.println(heart); // heart symbol
System.out.println(smile); // smile symbol
```

Some Unicode characters need more than one UTF-16 code unit. Those values should be handled with `String`, not a single `char`.

[Here](https://en.wikipedia.org/wiki/List_of_Unicode_characters) is a list of Unicode characters.

## Character class

The wrapper class `Character` provides useful helper methods for working with characters.

```java
char letter = 'A';
System.out.println(Character.isLetter(letter));      // true
System.out.println(Character.isDigit('7'));          // true
System.out.println(Character.toLowerCase(letter));   // a
System.out.println(Character.isWhitespace(' '));     // true
```

## Common mistakes

- `char c = "A";` is invalid because double quotes define a string.
- `char c = 'AB';` is invalid because `char` holds only one character.
- `char c = 70000;` is invalid because values must fit into the `char` range.

Use `char` when you need to store a single character or symbol, especially for text processing and low-level character handling.
