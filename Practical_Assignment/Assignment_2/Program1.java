package Practical_Assignment.Assignment_2;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Index for Array : ");
        int idx = scan.nextInt();
        System.out.println("");

        int count = 0,inc = idx;
        boolean newInputState = true;
        int [] arr = new int[idx];

        for(int i=0;i<inc;i++)
        {
            do{
                try {
                    System.out.print("Enter value for index "+count+" : ");
                    int val = scan.nextInt();

                    arr[count++] = val;
                    newInputState = false;
                } catch (InputMismatchException e) {
                    System.out.println("Interger is required..Try again.");
                    inc++;
                }
            }while(newInputState);
            scan.nextLine();
        }

        newInputState = true;
        System.out.println("\n");
        System.out.print("Wanna print any number of array [1 for Yes / 0 for No] : ");
        int cs = scan.nextInt();
        System.out.println("");
        while(cs == 1)
        {
            do{
                try {
                    System.out.print("Enter index number : ");
                    int idx1 = scan.nextInt();
                    System.out.println("Vlaue at index "+idx1+" is : "+arr[idx1]);
                    newInputState = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index is Out of bounds!!");
                    System.out.println("Please try between 0 to "+count);
                    newInputState = true;
                }
            }while(newInputState);

            scan.nextLine();
            System.out.println("");
            System.out.print("Do u want to print another number [1 for Yes / 0 for No] : ");
            cs = scan.nextInt();
            System.out.println("");
        }

        int sum = 0,div = idx;
        try {
            for(int i=0;i<idx;i++)
                sum += arr[i];
            double ans = sum/div;

            System.out.println("Arithmatic mean of Array : "+ans);
        } catch (ArithmeticException e) {
            System.out.print("Arithmetic Exception ... can't devide by zero");
        }
        scan.close();
    }
}