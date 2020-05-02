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

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Input String is : "+input);
        String reverse = ReverseStr(input);
        System.out.println("Reversed String is : "+reverse);
        PalinDrome(input,reverse);
        scan.close();
    }
    
    public static String ReverseStr(String str)
    {
        char[] charStr = str.toCharArray(); 
        char[] ncharStr = new char[charStr.length];
        
        int j = 0;
        for (int i = charStr.length-1; i>=0; i--) 
        {
            ncharStr[j] = charStr[i];
            j++;
        }
        String str2 = String.valueOf(ncharStr);
        return str2;
    }
    
    public static void PalinDrome(String str,String str1)
    {
        boolean ans = str.equals(str1);
        
        if(ans == true)
            System.out.println("Sting is palindrome..");
        else
            System.out.println("string is not palindrome..");
    }
}
