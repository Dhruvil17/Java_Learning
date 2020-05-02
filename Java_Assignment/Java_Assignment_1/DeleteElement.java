package Java_Assignment.Java_Assignment_1;

import java.util.Scanner;

public class DeleteElement
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the index of Array : ");
        int index = scan.nextInt();
        int [] arr = new int[index]; 
        for(int i=0;i<index;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter your Target which will be deleted : ");
        int target = scan.nextInt();
        int [] NewArr = targetFun(arr,index,target); 
        int j = 1;
        for(int i=0;i<index;i++)
        {
            if(NewArr[0] == 0)
                break;
            else if(i == NewArr[j])
                j++;
            else
                System.out.print(arr[i]+" ");
        }
        scan.close();
    }

    public static int[] targetFun(int [] arr,int index,int target) {
        int [] ret = new int[index];
        int j = 0;
        for(int i=0;i<index;i++)
        {
            if(arr[i] == target)
                ret[++j] = i;
        }
        if(j == 0)
            System.out.println("Targeted Element is not in Array ...");
        ret[0] = j;
        return ret;
    }
}