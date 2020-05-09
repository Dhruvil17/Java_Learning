package Practical_Assignment.Multi_Threading;

import java.util.Scanner;

class matrixSum implements Runnable
{
    int size,rowNo;
    int arr1[][] = new int[size][size];

    matrixSum(int size, int [][] arr1,int rowNo)
    {
        this.size = size;
        this.arr1 = arr1;
        this.rowNo = rowNo;
    }

    public void run() {
        int sum = 0;
        synchronized(this)
        {
            for(int i=0;i<size;i++)
            {
                sum += arr1[rowNo][i];
            }
            System.out.println("Sum of elements of "+rowNo+" is : "+sum);
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter matrix size : ");
        int n = scan.nextInt();

        int arrMat[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter data for "+i+" row : ");
            for(int j=0;j<n;j++)
            {
                arrMat[i][j] = scan.nextInt();
            }
            System.out.println("");
        }

        Thread Th[] = new Thread[n];

        synchronized(Program3.class)
        {
            for(int i=0;i<n;i++)
            {
                matrixSum mt = new matrixSum(n, arrMat, i);
                Th[i] = new Thread(mt);
                Th[i].start();
            }
        }
        scan.close();
    }    
}