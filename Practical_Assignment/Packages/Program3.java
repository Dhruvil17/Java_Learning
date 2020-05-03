package Practical_Assignment.Packages;

import java.util.*;

/**
 * Program3
 */

 public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> ob = new LinkedList<String>();
        int ch = 1;

        while(ch == 1)
        {
            System.out.println("1. Add element \n2. Add at Index \n3. Delete at Index \n4. Print");
            System.out.print("Enter your choise : ");
            int cs = scan.nextInt();

            switch(cs)
            {
                case 1:
                    System.out.print("Enter Vehicle name : ");
                    String name = scan.next();
                    ob.add(name);
                    break;
                case 2:
                    System.out.print("Enter Vehicle Name :  ");
                    String s = scan.next();
                    System.out.print("Enter Index number : ");
                    int in = scan.nextInt();
                    ob.add(in,s);
                    break;
                case 3:
                    System.out.print("Enter Index number : ");
                    int ind = scan.nextInt();
                    String del = ob.remove(ind);
                    System.out.println("Deleted element is : "+del);
                    break;
                case 4:
                    System.out.println("Elements in Linked List..");
                    System.out.print(ob);
                    break;
                default:
                    System.out.println("Wrong choise...");
                    break;
            }
            System.out.println("");
            System.out.print("Do u want to continue [1 for Yes / 2 for No] : ");
            ch = scan.nextInt();
        }
        scan.close();
    }
}