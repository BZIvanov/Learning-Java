# Practice Tasks

This folder contains small exercises for practicing classes and objects.

Use these tasks after reading the lesson pages in the parent section. They are designed to help you practice:

- Creating custom classes.
- Adding fields.
- Creating objects with constructors.
- Calling instance methods.
- Working with multiple objects.
- Storing objects in collections.
- Separating the program logic from the data model.

## Suggested Order

1. **SimpleInterestCalculator** - warm up with a small class-based program.
2. **Songs** - create a class and store multiple objects.
3. **Students** - filter objects by one of their fields.
4. **Poll** - compare objects and print the result.
5. **Articles** - update object state through commands.
6. **Messages** - generate output by combining fields and methods.
7. **VehicleCatalogue** - work with different categories of objects and calculate averages.

## How to Approach Each Task

Before writing code, ask:

- What class or classes do I need?
- What fields should each object store?
- Do I need a constructor?
- What methods would make the code easier to read?
- Where should the `main()` method be?

The goal is not only to make the program print the correct output. The goal is to practice organizing data and behavior into classes.

## Test Inputs and Outputs

### Songs

```text
Input:
2
Piano_PianoMusic_2:45
Techno_TechnoMusic_3:15
Piano

Output:
PianoMusic
```

### Students

```text
Input:
Iva Ivanova 23 Sofia
Miro Petrov 28 Varna
Elena Petrova 25 Sofia
end
Sofia

Output:
Iva Ivanova is 23 years old and lives in city Sofia
Elena Petrova is 25 years old and lives in city Sofia
```

### Messages

```text
Input:
2

Output:
Excellent product. I cannot believe but now I feel awesome. Iva - Plovdiv
I can't live without this product. I cannot believe but now I feel awesome. Katya - Ruse
```

### Articles

```text
Input:
MyArticle, Some content, Some Author
2
Edit: Updated content
ChangeAuthor: Iva

Output:
MyArticle - Updated content: Iva
```

### Poll

```text
Input:
2
Mira 29
Ivo 31

Output:
Ivo - 31
```

### VehicleCatalogue

```text
Input:
car model1 blue 123
car model2 red 145
truck model5 white 259
End
car
Close the Catalogue

Output:
Cars have average horsepower of: 134.00.
Trucks have average horsepower of: 259.00.
```

### SimpleInterestCalculator

```text
Input:
No input

Output:
Simple Interest for 3 years: 1500.00
```
