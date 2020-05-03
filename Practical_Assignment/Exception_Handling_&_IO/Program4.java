import java.util.*;
import java.io.*;

public class Program4 {
    static final int ASCCI_SIZE = 256;
    public static void MostFrequentChar(String str)
    {
        int charArr [] = new int[ASCCI_SIZE];

        for(int i=0;i<str.length();i++)
            charArr[str.charAt(i)]++;

        int max = 0;

        for(int i=0;i<str.length();i++)
            if(max < charArr[str.charAt(i)] && str.charAt(i) != ' ')
                max = charArr[str.charAt(i)];

        char [] charEntry = new char[str.length()];
        char [] result = new char[str.length()];
        int count = 0,k = 0;

        for(int i=0;i<256;i++)
            if(charArr[i] > 0)
                charEntry[count++] = (char)i; 

        for(int i=0;i<count;i++)
            if(charArr[charEntry[i]] == max)
                result[k++] = charEntry[i];

        if(k == 1)
            System.out.println("Most frequent character is : "+result[0]);
        else
        {
            System.out.print("Most frequent characters are : ");
            for(int i=0;i<k;i++)
                System.out.print(" "+result[i]+" , ");
        }

        //return freqChar;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String data = scan.nextLine(); 

        try {
            FileWriter fw = new FileWriter("Test1.txt");
            fw.write(data);

            fw.close();

            FileReader fr = new FileReader("Test1.txt");
            int temp;
            String readData = "";
            while((temp = fr.read()) != -1)
                readData += (char)temp;
          
            fr.close();

            MostFrequentChar(readData);
        } 
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        scan.close();
    }
}