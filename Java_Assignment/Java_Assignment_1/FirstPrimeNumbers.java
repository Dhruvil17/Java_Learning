package Java_Assignment.Java_Assignment_1;

import java.util.Scanner;

public class FirstPrimeNumbers
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the positive Number : ");
        int n = scan.nextInt();

        int [] primeArr = FirstPrime(n);
        for(int i=0;i<n;i++)
            System.out.print(" "+primeArr[i]);
        
        scan.close();
    }

    public static int[] FirstPrime(int n) {
        int status = 1,num = 3,index = -1;
        int [] numbers = new int[n];
        if (n >= 1)
        {
            numbers[++index] = 2;
        }

        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                numbers[++index] = num;
                i++;
            }
            status = 1;
            num++;
        }
        return numbers;
    }
}