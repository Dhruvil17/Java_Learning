package Practical_Assignment;

class ParallelTask implements Runnable
{
    int n1,n2;
    ParallelTask(int n1,int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" is Executing Sum of two number..");
        System.out.println("Sum : "+(n1+n2));
    }

    public int getNum()
    {
        return n1+n2;
    }
}

class ParallelTask1 implements Runnable
{
    ParallelTask num = new ParallelTask(10, 15);
    int n2 = num.getNum();

    int n1;
    ParallelTask1(int n1)
    {
        this.n1 = n1;
    }

    public void run()
    {
        try { 
            System.out.println(Thread.currentThread().getName()+" is executing Multiplication of two number..");
            System.out.println("Multiplication : "+(n1*n2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadingStart {
    public static void main(String[] args) throws InterruptedException {
        ParallelTask task = new ParallelTask(10,15);
        ParallelTask1 task1 = new ParallelTask1(30);

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task1);

        t1.start();
        t2.start();
    }
}