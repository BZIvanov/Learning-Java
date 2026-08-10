# Multidimensional arrays

A multidimensional array stores arrays inside another array. The most common
form is a two-dimensional array, which can represent a table, grid, board, or
matrix using rows and columns.

Complete the [one-dimensional arrays](../OneDimensional/README.md) chapter
first. The same rules for indexes, default values, and references still apply.

## Declaring and creating a matrix

Use two pairs of brackets for a two-dimensional array:

```java
int[][] matrix = new int[3][4];
```

This creates three rows with four integers in each row. Every integer starts at
its default value, `0`.

An initializer can provide the values directly:

```java
int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 }
};
```

## Rows, columns, and indexes

Access an element by its row index and then its column index:

```java
int value = matrix[1][2]; // 6
matrix[0][1] = 20;
```

Both indexes start at `0`:

- `matrix.length` is the number of rows.
- `matrix[row].length` is the number of columns in that row.
- `matrix.length - 1` is the last row index.
- `matrix[row].length - 1` is the last column index for that row.

Using `matrix[0].length` for every row is safe only when the matrix is known to
be rectangular and non-empty.

## Traversing a matrix

Nested loops visit every element. The outer loop selects a row and the inner
loop walks through that row:

```java
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
```

Use enhanced `for` loops when indexes are not needed:

```java
int sum = 0;

for (int[] row : matrix) {
    for (int value : row) {
        sum += value;
    }
}
```

## Reading a matrix from the console

When the first line contains the row and column counts and each following line
contains one row:

```java
import java.util.Arrays;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int[] dimensions = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
        .mapToInt(Integer::parseInt)
        .toArray();

int rows = dimensions[0];
int cols = dimensions[1];
int[][] matrix = new int[rows][cols];

for (int row = 0; row < rows; row++) {
    matrix[row] = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
}
```

If exactly `cols` values are required per row, validate the parsed row before
assigning it to the matrix.

## Rectangular and jagged arrays

Because a two-dimensional array is an array of row arrays, its rows do not need
to have equal lengths:

```java
int[][] triangle = new int[3][];
triangle[0] = new int[1];
triangle[1] = new int[2];
triangle[2] = new int[3];
```

This is a jagged array. Always use `matrix[row].length` while traversing it.
Rows created with `new int[3][]` initially contain `null`, so each row must be
created before it can be indexed.

## Useful `Arrays` methods

The regular array methods operate on one level. Use their `deep` variants to
inspect or compare nested arrays:

```java
import java.util.Arrays;

int[][] first = { { 1, 2 }, { 3, 4 } };
int[][] second = { { 1, 2 }, { 3, 4 } };

System.out.println(Arrays.deepToString(first)); // [[1, 2], [3, 4]]
System.out.println(Arrays.deepEquals(first, second)); // true
```

`Arrays.toString(first)` prints the row-array references rather than all nested
values.

## Copying a multidimensional array

`Arrays.copyOf(matrix, matrix.length)` copies only the outer array. Both
matrices would still share the same row arrays. Copy every row to make an
independent two-dimensional copy:

```java
int[][] copy = new int[matrix.length][];

for (int row = 0; row < matrix.length; row++) {
    copy[row] = Arrays.copyOf(matrix[row], matrix[row].length);
}
```

For arrays containing mutable objects, copying each row still copies only the
object references.

## Common matrix patterns

### Row sums

```java
for (int row = 0; row < matrix.length; row++) {
    int rowSum = 0;
    for (int value : matrix[row]) {
        rowSum += value;
    }
    System.out.println(rowSum);
}
```

### Main and secondary diagonals

For a square matrix of size `n`, the main diagonal uses `[i][i]`, and the
secondary diagonal uses `[i][n - 1 - i]`:

```java
for (int i = 0; i < matrix.length; i++) {
    int mainValue = matrix[i][i];
    int secondaryValue = matrix[i][matrix.length - 1 - i];
}
```

### Bounds checking

Grid algorithms often inspect neighboring cells. Check both coordinates before
accessing a cell:

```java
static boolean isInBounds(int[][] matrix, int row, int col) {
    return row >= 0
            && row < matrix.length
            && col >= 0
            && col < matrix[row].length;
}
```

## Common mistakes

- Treating `matrix.length` as the number of columns.
- Writing `<=` instead of `<` in loop conditions.
- Assuming every row has the same length.
- Accessing a row that is still `null` in a partially created array.
- Using `Arrays.toString` or `Arrays.equals` instead of their `deep` variants.
- Expecting a copy of the outer array to copy its rows and elements.
- Swapping the row and column indexes.

## Practice

The [multidimensional array exercises](tasks/Tasks.md) progress from reading and
comparing matrices to diagonals, submatrices, rotations, dynamic grids, and
simulation problems.
