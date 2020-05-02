package Java_Assignment.Java_Assignment_1;

import java.util.Scanner;

public class RPS
{
    public static void main(String[] args) {
        Game();
    }

    public static void Game()
    {
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            double com = Math.round(2*Math.random());
            System.out.println("0 : for Rock\n1 : for Paper\n2 : for Scissor\n3 : Exit()");
            System.out.print("Enter you choise : ");
            int user = scan.nextInt();

            if(com == user)
            {
                System.out.println("Tied .... try again :");
                Game();
            }
            else if(com == 0 && user == 1)
                System.out.println("Paper covers Rock .... User win");
            else if(com == 0 && user == 2)
                System.out.println("Rock crushes scissors .... Computer Win");
            else if(com == 1 && user == 0)
                System.out.println("Paper covers Rock .... Computer win");
            else if(com == 1 && user == 2)
                System.out.println("Scissors cuts paper .... User Win");
            else if(com == 2 && user == 0)
                System.out.println("Rock crushes scissors .... User Win");
            else if(com == 2 && user == 1)
                System.out.println("Paper covers Rock .... Computer win");
            else
                break;
        }
        scan.close();
    }
}