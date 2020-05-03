import java.util.*;

class myNumberCheck extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = -3959056061356951607L;

    public myNumberCheck(String s)
    {
        super(s);
    }
}


public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean inputState = true;

        do {
            try {
                System.out.print("Enter length in Feet and Inch : ");
                int feetLen = scan.nextInt();
                int inchLen = scan.nextInt();

                if(feetLen < 0 || inchLen < 0)
                {
                    throw new myNumberCheck("Length can't be Negative!! \nPlease enter Positive number again.");
                }
                else if(inchLen > 12)
                {
                    throw new myNumberCheck("1 feet is equal to 12 inches.");
                }

                double ans = feetLen*(30.48) + inchLen*(2.54);
                System.out.println("");
                System.out.println(feetLen+" Feet and "+inchLen+" Inch is equal to : "+ans+" centimetres");
                inputState = false;

            } catch (InputMismatchException e) {
                System.out.println("Input must be in in Integer..");
                inputState = true;
                scan.nextLine();
            } catch (myNumberCheck e1){
                System.out.println(e1.getMessage());
                inputState = true;
            }
        } while (inputState);
        scan.nextLine();
        scan.close();
    }
}