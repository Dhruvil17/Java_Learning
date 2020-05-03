import java.util.*;

class InvalidHrExcep extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = -6942784165939646529L;

    InvalidHrExcep(String s)
    {
        super(s);
    }
}

class InvalidMinExcep extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 3534008616081822984L;

    InvalidMinExcep(String s)
    {
        super(s);
    }
}

class InvalidSecExcep extends Exception
{
    /**
     *
     */
    private static final long serialVersionUID = 2865302771647874496L;

    InvalidSecExcep(String s)
    {
        super(s);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean inputState = true;

        do {
            try {
                System.out.print("Enter Hours , Minutes , Seconds for 12 hour-format : ");
                int hr = scan.nextInt();
                int min = scan.nextInt();
                int sec = scan.nextInt();

                if(hr > 12)
                    throw new InvalidHrExcep("It is Not possible With more than 12 hours !! \nTry again");
                else if(min > 60)
                    throw new InvalidMinExcep("It is not posible With more than 60 minutes !! \nTry again");
                else if(sec > 60)
                    throw new InvalidSecExcep("It is not posible With more than 60 seconds !! \nTry again"); 

                
                System.out.print("Enter After morning or Past morning [PM / AM] : ");
                String mode = scan.next();


                if(mode.equals("AM")){
                    if(hr == 12)
                        System.out.println("\n24 Hour-Format : "+0+":"+min+":"+sec);
                    else
                        System.out.println("\n24 Hour-Format : "+hr+":"+min+":"+sec);
                }
                else{
                    if(hr == 12)
                        System.out.println("\n24 Hour-Format : "+12+":"+min+":"+sec);
                    else
                        System.out.println("\n24 Hour-Format : "+(hr+12)+":"+min+":"+sec);
                }
                    
                inputState = false;
            } catch (InvalidHrExcep eH) {
                System.out.println(eH.getMessage());
                inputState = true;
                scan.nextLine();               
            } catch (InvalidMinExcep eM){
                System.out.println(eM.getMessage());
                inputState = true;
                scan.nextLine();
            } catch (InvalidSecExcep eS){
                System.out.println(eS.getMessage());
                inputState = true;
                scan.nextLine();
            } catch (InputMismatchException e){
                System.out.println("\nInput must be in Integer..");
                inputState = true;
                scan.nextLine();
            }
        } while (inputState);
        scan.close();
    }
}