package Java_Assignment.Java_Assignment_1;

public class RandomUntil169
{
    public static void main(String[] args) {
        int count = 1;
        int ran = Random169();
        System.out.println(ran);
        if(ran == 169)
            System.out.println("We got 169 in First Trial..");
        else
        {
            while(ran != 169)
            {
                count++;
                ran = Random169();
                System.out.println(ran);
            }
            System.out.print("We got 169 in "+count+" Trials..");
        }
    }

    public static int Random169()
    {
        double ran = Math.random();
        ran = Math.round((200 - 150)*ran);

        return (int)(200-ran);
    }
}