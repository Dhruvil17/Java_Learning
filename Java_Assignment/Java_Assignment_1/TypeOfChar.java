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

public class TypeOfChar {

    /**
     * @param args the command line arguments
     */
    static void printTypeOfChar(char ch)
    {
       
        if (ch >= 'A' && ch <= 'Z') 
            System.out.println(ch + " is an UpperCase character");  
        else if (ch >= 'a' && ch <= 'z')    
            System.out.println(ch + " is an LowerCase character" );  
        else
            System.out.println(ch + " is a Symbol" );  
    }
            
    public static void main(String[] args)   
    {   Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char c = scan.nextLine().charAt(0); 
        printTypeOfChar(c);
        scan.close();
    }
    
}
