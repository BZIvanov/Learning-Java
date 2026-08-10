# Arrays

This section covers Java arrays from basic indexed collections to tables,
grids, and other multidimensional structures.

## Learning path

1. [One-dimensional arrays](OneDimensional/README.md)
   - declaration, creation, indexes, and default values
   - traversal, console input, copying, and `java.util.Arrays`
   - [practice exercises](OneDimensional/tasks/Tasks.md)
2. [Multidimensional arrays](Multidimensional/README.md)
   - arrays of arrays, rows and columns, and jagged arrays
   - nested traversal, matrix input, copying, and common algorithms
   - [practice exercises](Multidimensional/tasks/Tasks.md)

Complete the one-dimensional chapter first. Multidimensional arrays use the
same indexing and reference concepts, then add another level of nesting.

## Quick comparison

| Concept | One-dimensional | Two-dimensional |
| --- | --- | --- |
| Declaration | `int[] values` | `int[][] matrix` |
| Creation | `new int[5]` | `new int[3][4]` |
| Access | `values[index]` | `matrix[row][column]` |
| Size | `values.length` | `matrix.length` and `matrix[row].length` |
| Typical traversal | one loop | nested loops |

Java does not have a special matrix type. An `int[][]` is an array whose
elements are references to other `int[]` arrays. This explains why rows can
have different lengths and why copying multidimensional arrays requires care.
