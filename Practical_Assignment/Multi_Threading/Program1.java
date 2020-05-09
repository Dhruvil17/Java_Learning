package Practical_Assignment.Multi_Threading;

import java.util.LinkedList;
import java.util.Scanner; 
  
public class Program1 { 
    public static void main(String[] args) throws InterruptedException 
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Buffer : ");
        int number = scan.nextInt();

        final PC pc = new PC(number); 

        Thread t1 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.produce(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        } , "Producer "); 
  
        Thread t2 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.consume(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        } , "Consumer "); 
  
        t1.start(); 
        t2.start(); 
  
        t1.join(); 
        t2.join(); 

        scan.close();
    } 

    public static class PC {  
        LinkedList<Integer> list = new LinkedList<>(); 
        
        int size;
        PC(int size)
        {
            this.size = size;
        }
 
        public void produce() throws InterruptedException 
        { 
            int value = 0; 
            while (true) { 
                synchronized (this) 
                {
                    while (list.size() == size) 
                        wait(); 
  
                    System.out.println(Thread.currentThread().getName()+"has produced-"+ value); 
 
                    list.add(value++); 
 
                    notify(); 
  
                    Thread.sleep(1000); 
                } 
            } 
        } 
  
        public void consume() throws InterruptedException 
        { 
            while (true) { 
                synchronized (this) 
                {  
                    while (list.size() == 0) 
                        wait(); 
   
                    int val = list.removeFirst(); 
  
                    System.out.println(Thread.currentThread().getName()+" hasconsumed-" + val); 

                    notify(); 

                    Thread.sleep(1000); 
                } 
            } 
        } 
    } 
} 