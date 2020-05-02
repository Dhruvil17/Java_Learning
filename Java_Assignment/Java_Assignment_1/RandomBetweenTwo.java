package Java_Assignment.Java_Assignment_1;

import java.util.Scanner;

public class RandomBetweenTwo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        double ran = RandomNum(a,b);

        System.out.print("Random Number is : " + ran);
        scan.close();
    }

    public static double RandomNum(int a,int b)
    {
        double ran = Math.random();
        ran = Math.abs(a-b)*ran;

        return Math.round(b-ran);
    }
}