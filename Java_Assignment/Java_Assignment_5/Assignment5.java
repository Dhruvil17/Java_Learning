package Java_Assignment.Java_Assignment_5;
import java.util.Scanner;

interface List_1
{
    static int capacity = 10;

    void insert(int a);
    int delete();
    int search(int a);
    void print();
}

class Stack_test implements List_1
{
    int [] stk = new int[capacity];
    int tos = -1;

    public void insert(int val)
    {
        if(tos == capacity-1)
            System.out.println("Stack is Full");
        else
        {
            stk[++tos] = val;
        }
    }

    public int delete()
    {
        int val = 0;
        if(tos == -1)
            System.out.println("Stack is Empty");
        else
        {
            val = stk[tos];
            tos--;
        }
        return val;
    }

    public int search(int val)
    {
        int pos = -1;
        for(int i=0;i<=tos;i++)
        {
            if(val == stk[i])
                pos = i;
        }
        return pos+1;
    }

    public void print()
    {
        System.out.println("Stack elements are : ");
        for(int i=tos;i>=0;i--)
        {
            System.out.println(stk[i]);
        }
    }
} 

class Queue_test implements List_1
{
    int [] Q = new int[List_1.capacity];
    int f = -1,r = -1;

    public void insert(int val)
    {
        if(r == (List_1.capacity-1))
            System.out.println("Queue is Full");
        else
        {
            r++;
            Q[r] = val;
            if(f == -1)
                f = 0;
        }
    }

    public int delete()
    {
        int val = 0;
        if(r == -1)
            System.out.println("Queue is already Empty");
        else
        {
            val = Q[f];
            if(f == r)
                f = r = -1;
            else   
                f++;
        }
        return val;
    }

    public int search(int val)
    {
        int pos = -1;
        for(int i=f;i<=r;i++)
        {
            if(val == Q[i])
                pos = i;
        }
        return pos;
    }

    public void print()
    {
        System.out.println("Queue elements are : ");
        for(int i=f;i<=r;i++)
        {
            System.out.print(Q[i]+" -> ");
        }
        System.out.println(" 0");
    }
}

class Assignment5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number for [Stack:0 / Queue:1] : ");
        int ch = scan.nextInt();

        if(ch == 0)
        {
            int wh1 = 1;
            System.out.println("Stack is Initialized...");
            Stack_test s1 = new Stack_test();
            while (wh1 == 1)
            {
                System.out.println("1 : Insert\n2 : Delete \n3 : Search \n4 : Print ");
                System.out.print("Enter your Choise : ");
                int cs = scan.nextInt();
                switch(cs)
                {
                    case 1:
                        System.out.print("Enter val : ");
                        int val = scan.nextInt();
                        s1.insert(val);
                        break;
                    case 2:
                        int del = s1.delete();
                        System.out.println("Deleted element is : "+del);
                        break;
                    case 3:
                        System.out.print("Enter value to be Search : ");
                        int ser = scan.nextInt();
                        int pos = s1.search(ser);
                        if(pos != -1)
                            System.out.println(ser+" is at "+pos+" index");
                        else
                            System.out.println(ser+" is not in stack");
                        break;
                    case 4:
                        s1.print();
                        break;
                    default:
                        System.out.println("Wrong choise");
                        break;
                }
                System.out.println("");
                System.out.print("Do you want to continue [Yes : 1 / No : 0]:");
                wh1 = scan.nextInt();
            }
        }
        else
        {
            int wh1 = 1;
            Queue_test q1 = new Queue_test();

            if(ch == 1)
                System.out.println("Queue is Initialized...");
            else
                System.out.println("As a Default Queue is Initialized...");   
                
            while (wh1 == 1)
            {
                System.out.println("1 : Insert\n2 : Delete \n3 : Search \n4 : Print ");
                System.out.print("Enter your Choise : ");                    
                int cs = scan.nextInt();
                switch(cs)
                {
                    case 1:
                        System.out.print("Enter val : ");
                        int val = scan.nextInt();
                        q1.insert(val);
                        break;
                    case 2:
                        int del = q1.delete();
                        System.out.println("Deleted element is : "+del);
                        break;
                    case 3:
                        System.out.print("Enter value to be Search : ");
                        int ser = scan.nextInt();
                        int pos = q1.search(ser);
                        if(pos != -1)
                            System.out.println(ser+" is at "+pos+" index");                            
                        else
                            System.out.println(ser+" is not in stack");
                        break;
                    case 4:
                        q1.print();
                        break;
                    default:
                        System.out.println("Wrong choise");
                        break;
                }
                System.out.println("");
                System.out.print("Do you want to continue [Yes : 1 / No : 0]:");
                wh1 = scan.nextInt();
            }
        }
        scan.close();
    }
}
