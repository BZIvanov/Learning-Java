# Basic syntax

## Running a program using the terminal

Below is an example of how to run a program using the terminal without using an IDE.

Here is the content of the program file, which is named `PrintSum.java`:

```java
public class PrintSum {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + 5;

        System.out.println(a + " + " + b + " = " + sum);
    }
}
```

Now in the terminal run the below command to compile the program, this command will create executable file `PrintSum.class`. It will invoke the java compiler.

```
javac PrintSum.java
```

The above command will create the compiled version of our program. With the below command we can execute the program. It will invoke the java runtime.

```
java PrintSum 10 15
```
