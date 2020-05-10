package Practical_Assignment.Example;

import java.util.*;
/**
 * ExceptionHandling
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean currentStatus = true;

        do{
            try {
                System.out.print("Enter any Interger : ");
                int num = scan.nextInt();

                System.out.println("Entered nuber is : "+num);
                currentStatus = false;
            } catch (InputMismatchException e) {
                System.out.println("Interger is Required ... Try again with interger.");
                scan.nextLine();
            } 
        }while(currentStatus);
        scan.close();
    }
}