package Java_Assignment.Java_Assignment_1;

import java.util.Scanner;

public class FactorsOf
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scan.nextInt();

        int [] factors = FactorOfNum(num);
        int index = factors[0];
        System.out.println("Factors of "+num+" are : ");
        for(int i=1;i<=index;i++)
            System.out.print(factors[i]+" ");

        scan.close();
    }

    public static int[] FactorOfNum(int n) {
        int count = 0,j = 0;
        int [] factors = new int[n];

        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
                factors[++j] = i;
            }
        }
        factors[0] = count;
        return factors;
    }
}