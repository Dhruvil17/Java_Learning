package Practical_Assignment.Packages.MainWork;

import Practical_Assignment.Packages.Area.*;
import java.util.Scanner;

/**
 * Program1_1
 */

public class Program1_1 {
    public static void main(String[] args) {
        int cn = 1;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Finding area of What !! [1 For Cricle / 2 For Cylinder] : ");
        int ch = scan.nextInt();

        if(ch == 1)
        {
            Shape2D c1 = new Circle();
            while(cn == 1)
            {
                System.out.print("Provide radius of Circle :");
                double r = scan.nextDouble();
                System.out.println("Area of Given Circle is : "+c1.findArea(r, 1.0));
                System.out.println("");
                System.out.print("Do u want to Find another area of Circle [1 for Yes / 0 for No] : ");
                cn = scan.nextInt();
            }
        }
        else
        {
            if(ch != 2)
                System.out.println("As a Default Area of Cylinder will be Given..");
            
            Shape2D c1 = new Cylinder();
            while(cn == 1)
            {
                System.out.print("Provide radius of Cylinder :");
                double r = scan.nextDouble();
                System.out.print("Provide height of Cylinder :");
                double h = scan.nextDouble();
                System.out.println("Area of Given Cylinder is : "+c1.findArea(r, h));
                System.out.println("");
                System.out.print("Do u want to Find another area of Cylinder [1 for Yes / 0 for No] : ");
                cn = scan.nextInt();
            }
        }
        scan.close();
    }
}