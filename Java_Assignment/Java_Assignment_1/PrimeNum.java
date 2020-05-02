package Java_Assignment.Java_Assignment_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jay.bict18
 */
import java.util.Scanner;

public class PrimeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = scan.nextInt();
        
        boolean ans = isPrime(n);
        
        if(ans == true)
            System.out.println(n+" is prime Number");
        else
            System.out.println(n+" is not prime Number");
        scan.close();
    }
    
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
                count++;
        }
        if(count >= 3)
            return false;
        else
            return true;
    }
}
