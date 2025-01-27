# Threads

## Content

Recommended learning order for the given examples.

1. BasicThreads
2. ThreadsPriority
3. InvokeAllExample

## States of a thread

1. **NEW**

   - The thread is created but has not yet started
   - A thread is in this state after its creation using the Thread class but before calling `start()`

2. **RUNNABLE**

   - The thread is ready to run and is waiting for CPU time
   - It may or may not be actively running depending on the operating system's thread scheduler

3. **BLOCKED**

   - The thread is waiting to acquire a monitor lock to enter a synchronized block/method
   - This state occurs when another thread holds the lock the current thread needs

4. **WAITING**

   - The thread is waiting indefinitely for another thread to signal or notify it
   - Commonly occurs when methods like `Object.wait()` or `Thread.join()` (without a timeout) are used

5. **TIMED_WAITING**

   - Similar to WAITING, but the thread waits for a specified amount of time
   - Methods like `Thread.sleep()`, `Object.wait(timeout)`, or `Thread.join(timeout)` put a thread in this state

6. **TERMINATED**
   - The thread has completed its execution and is no longer active
   - Once a thread reaches this state, it cannot be restarted
