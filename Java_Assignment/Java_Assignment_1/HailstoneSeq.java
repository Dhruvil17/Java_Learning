package Java_Assignment.Java_Assignment_1;

import java.util.Scanner;

public class HailstoneSeq
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = scan.nextInt();
        int count = 0;
        
        if(n%2 == 0)
        {
            System.out.println(n+" is even so half of "+n+" is "+n/2);
            count = Even(n,count);
        }
        else
        {
            System.out.println(n+" is odd so 3n+1 is "+(3*n+1));
            count = Odd(n,count);
        }
        scan.close();
    }

    public static int Even(int n,int count) {
        n = n/2;
        count++;
        if(n == 1)
            System.out.println("This process took "+count+" steps to reach 1");
        else if(n%2 == 0)
        {
            System.out.println(n+" is even so half of "+n+" is "+n/2);
            count = Even(n, count);
        }
        else
        {
            System.out.println(n+" is odd so 3n+1 is "+(3*n+1));
            count = Odd(n, count);
        }
        
        return count;
    }

    public static int Odd(int n,int count) {
        n = 3*n+1;
        count++;
        if(n%2 == 0)
        {
            System.out.println(n+" is even so half of "+n+" is "+n/2);
            count = Even(n, count);
        }
        else
        {
            System.out.println(n+" is odd so 3n+1 is "+(3*n+1));
            count = Odd(n, count);
        }
        
        return count;
    }
}