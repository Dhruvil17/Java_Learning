package Practical_Assignment.Example;

class Server implements Runnable
{
    private volatile boolean exit = false;
    public void run()
    {
        while(!exit)
        {
            System.out.println("Server is running...");
        }
        System.out.println("Server stopped..");
    }

    public void stop()
    {
        exit = true;
    }
}


public class ThreadingStop {
    public static void main(String[] args) throws InterruptedException {
        Server MyServer = new Server();

        Thread t1 = new Thread(MyServer,"T1");

        t1.start();

        System.out.println(Thread.currentThread().getName()+"is Stoping server in one second.");
        Thread.sleep(1000);

        MyServer.stop();
        System.out.println(Thread.currentThread().getName() + " is finished now");
    }
}