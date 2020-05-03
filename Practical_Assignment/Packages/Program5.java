package Practical_Assignment.Packages;

import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Date Day:Month:Year  :: ");
        int day1 = scan.nextInt();
        int month1 = scan.nextInt();
        int year1 = scan.nextInt();
        System.out.print("Enter Second Date Day:Month:Year  :: ");
        int day2 = scan.nextInt();
        int month2 = scan.nextInt();
        int year2 = scan.nextInt();

        Date d1 = new Date(year1,month1,day1);
        Date d2 = new Date(year2,month2,day2);

        long t1,t2;

        t1 = d1.getTime();
        t2 = d2.getTime();

        long diff = Math.abs(t2-t1);

        System.out.println("Total Difference in milliSecond is : "+diff);
        scan.close();
    }
}