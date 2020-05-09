package Practical_Assignment.Multi_Threading;

class TrafficLight
{
    public void lightOrder() throws InterruptedException {
        while(true)
        {
            synchronized(this)
            {
                System.out.println("Stop");
                System.out.println("RED : ON\n");
                Thread.sleep(5000);

                System.out.println("You may start your engine..");
                System.out.println("YELLOW : ON\n");
                Thread.sleep(3000);

                System.out.println("Go..");
                System.out.println("Gereen : ON\n");
                Thread.sleep(5000);
            }   
        }
    }
}


public class Program2 {
    public static void main(String[] args) {

        TrafficLight tf = new TrafficLight();

        Thread t1 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                try {
                    tf.lightOrder();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Light");

        t1.start();
    }
}