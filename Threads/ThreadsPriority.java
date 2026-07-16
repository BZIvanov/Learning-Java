class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " executed by: " + Thread.currentThread().getName() + 
                           " with priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadsPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Task 1"));
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread(new Task("Task 2"));
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
