// Code to demonstrate the use of Threads in Java
class Task1 extends Thread {
    public void run() {
        System.out.println("Task 1 started");
        for (int i = 0; i < 100; i++) {
            if (i == 0 || i == 99) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Task 1 completed");
    }
}

// Implementing Runnable interface
class Task2 implements Runnable {
    public void run() {
        System.out.println("Task 2 started");
        for (int i = 100; i < 200; i++) {
            if (i == 100 || i == 199) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Task 2 completed");
    }
}

public class BasicThreads {
    public static void main(String[] args) {
        System.out.println("Task 1 initiated");
        Task1 task1 = new Task1();
        task1.start();

        System.out.println("Task 2 initiated");
        Task2 task2 = new Task2();
        Thread thread = new Thread(task2);
        thread.start();

        System.out.println("Task 3 initiated");
        System.out.println("Task 3 started");
        for (int i = 200; i < 300; i++) {
            if (i == 200 || i == 299) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Task 3 completed");
    }
}
