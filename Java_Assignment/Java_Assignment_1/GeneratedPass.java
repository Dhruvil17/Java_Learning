package Java_Assignment.Java_Assignment_1;

public class GeneratedPass
{
    public static void main(String[] args) {
        double [] ch = new double[6];

        for(int i=0;i<ch.length;i++)
        {
            ch[i] = Math.random();
        }
        ch[0] = 122 - Math.round(25*ch[0]);
        ch[1] = Math.round(9*ch[1]);
        ch[2] = 90 - Math.round(25*ch[2]);
        ch[3] = 122 - Math.round(25*ch[3]);
        ch[4] = Math.round(9*ch[4]);
        ch[5] = Math.round(9*ch[5]);

        char ch0 = (char) ch[0];
        int ch1 = (int) ch[1];
        char ch2 = (char) ch[2];
        char ch3 = (char) ch[3];
        int ch4 = (int) ch[4];
        int ch5 = (int) ch[5];
        String password = (String) (ch0 + Integer.toString(ch1) + ch2 + ch3 + Integer.toString(ch4) + Integer.toString(ch5));
        System.out.print(password);
    }
}