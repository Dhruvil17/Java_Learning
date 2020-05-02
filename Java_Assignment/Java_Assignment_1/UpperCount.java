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

public class UpperCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ant String : ");
        String s = sc.nextLine();

        System.out.println("String has " + printUppercount(s) + " Uppercase Character");
        sc.close();
        
    }
    
    public static int printUppercount(String str)
    {
        char[] charArr = str.toCharArray();
        int count = 0;
        for(int i=0;i<str.length();i++) 
        {
            if(Character.isUpperCase(charArr[i]))
                count++;
        }
        return count;
    }
}
