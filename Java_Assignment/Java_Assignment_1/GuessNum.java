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

public class GuessNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ran,gue;
        
        ran = Math.random();
        ran = 10*ran;
        ran = Math.round(ran);
        
        System.out.println("guess any Number between 0 to 9 : ");
        gue = sc.nextDouble();
        if(gue > ran)
            System.out.println("Guess is Higher..");
        else if(gue < ran)
            System.out.println("Guess is Lower..");
        else
            System.out.println("Bingo ... Exactly Same Number");
        
        System.out.println("random number is : "+ran);
        sc.close();
    }
    
}
