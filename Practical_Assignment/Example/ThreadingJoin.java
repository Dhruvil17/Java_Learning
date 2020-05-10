package Practical_Assignment.Example;

class ParallelTask2 implements Runnable {
    private Thread preDecessor;

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");

        if (preDecessor != null) {
            try {
                preDecessor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Finished..");
    }

    public void setPreducessor(Thread t)
    {
        this.preDecessor = t;
    }
}


public class ThreadingJoin {
    public static void main(String[] args) {
        ParallelTask2 task1 = new ParallelTask2();
        ParallelTask2 task2 = new ParallelTask2();
        ParallelTask2 task3 = new ParallelTask2();

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");
        Thread t3 = new Thread(task3, "Thread-3");

        task1.setPreducessor(t2);
        task2.setPreducessor(t3);

        t1.start();
        t2.start();
        t3.start();
    }
}