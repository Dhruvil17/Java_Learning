package Practical_Assignment.Packages;

import java.util.Scanner;

/**
 * Program2
 */
class ArrayList {
   static String arr[] = new String[10];
   int idx = 0,Fidx = 0;

   public void AddColor(String clr) 
   {
        arr[idx] = clr;
        idx++;
   }

   public void AddFirst(String fclr) 
   {
       String temp [] = new String[10]; 
        if(idx > 10)
            System.out.println("Array is Full..");
        else
        {
            for(int i=0;i<idx;i++)
                temp[i] = arr[i];
            for(int i=0;i<idx;i++)  
                arr[i+1] = temp[i];
            arr[0] = fclr;
        }
        idx++; 
   }

   public void Retrieve(int in)
   {
       String ele = arr[in];
       System.out.println("Retrieve element at index "+in+" is : "+ele);
       for(int i=in;i<idx;i++)
       {
           if(i+1<idx)
                arr[i] = arr[i+1];
       }
       idx--;
   }

   public void Search(String s) 
   {
       int j=0;
        for(int i=0;i<idx;i++)
        {
            if(arr[i] == s)
            {   
                System.out.println(s+" is at index : "+i);
                j=1;
            }
        }
        if(j == 0)
            System.out.println("No such color in Array...");
   }

   public void printArr()
   {
       System.out.println("Colours are : ");
       for(int i=0;i<idx;i++)
       {
           System.out.print(arr[i]+",");
       }
       System.out.println("");
   }
}

public class Program2 {
    public static void main(String[] args) {
        ArrayList ob = new ArrayList();
        Scanner scan = new Scanner(System.in);

        int ch = 1;
        while(ch == 1)
        {
            System.out.println("1. Add Color \n2. Add Color at First Position \n3. Retrieve Element \n4. Search element \n5. Print Array");
            System.out.print("Enter your choise : ");
            int cs = scan.nextInt();
            
            switch(cs)
            {
                case 1:
                    System.out.print("Enter Color Name to add : ");
                    String clr = scan.next();
                    ob.AddColor(clr);
                    break;
                case 2:
                    System.out.print("Enter Color Name to add at First index : ");
                    String fclr = scan.next();
                    ob.AddFirst(fclr);
                    break;
                case 3:
                    System.out.print("Enter index to retrieve element : ");
                    int in = scan.nextInt();
                    ob.Retrieve(in);
                    break;
                case 4:
                    System.out.print("Enter color name to search in Array list : ");
                    String s = scan.next();
                    ob.Search(s);
                    break;
                case 5:
                    ob.printArr();
                    break;
                default:
                    System.out.println("Wrong choise..");
                    break;
            }
            System.out.println("");
            System.out.print("Do u want to continue [1 for Yes / 0 for No] : ");
            ch = scan.nextInt();
        }
        scan.close();
    }
}

