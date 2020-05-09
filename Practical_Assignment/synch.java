package Practical_Assignment;

class table {
        public static void printTable(int n) throws InterruptedException {
        synchronized(table.class){
            for (int i = 1; i <= 10; i++) {
                System.out.print(n + " x " + i + " = ");
                System.out.println(i * n);
            }
            System.out.println();

            Thread.sleep(1000);
        }
    }
}

class tableThread implements Runnable {
    int n;
    tableThread(int n)
    {
        this.n = n;
    }

    public void run() {
        try {
            table.printTable(n);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class synch
{
    public static void main(String[] args) {
        tableThread ob1 = new tableThread(5);
        tableThread ob2 = new tableThread(10);

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}