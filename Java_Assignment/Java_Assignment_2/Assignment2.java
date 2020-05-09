package Java_Assignment.Java_Assignment_2;
import java.util.Scanner;

class TollBooth
{
    static int no_of_vehicle = 0;
    static int [] non_pay_vehicle = new int[2];
    static double total_cash = 0;
    static int non_pay_car = 0;
    static int non_pay_truck = 0;
    
    int vehicle_no;
    String vehicle_type;
    boolean pay_status;

    TollBooth(int vehicle_no,String vehicle_type,boolean pay_status)
    {
        this.vehicle_no = vehicle_no;
        this.vehicle_type = vehicle_type;
        this.pay_status = pay_status;
    }

   void paying_vehicle()
   {
       no_of_vehicle++;
       total_cash += 50;
   }
   
   void noPayVehicle()
   {
       no_of_vehicle++;
   }

   int[] get_count_nonpay_vehicle(String type)
   {
        if(type.equals("Truck") || type.equals("truck"))
            non_pay_truck++;
        else
            non_pay_car++;
        
        non_pay_vehicle[0] = non_pay_car;
        non_pay_vehicle[1] = non_pay_truck;
        return non_pay_vehicle;
   }

   public static void Display()
   {
        System.out.println("Total No. of vehicle passed : "+no_of_vehicle);
        System.out.println("Total No. of amount collected : "+total_cash);
   }

   void Vehicle_info()
   {
       System.out.println("Vehicle No.   : "+vehicle_no);
       System.out.println("Vehicle type  : "+vehicle_type);
       System.out.println("Paying status : "+pay_status);
   }
}

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TollBooth [] obj = new TollBooth[15];
        int v_no,i=0;
        int ch = 1;
        String v_type;
        boolean p_status;
        while(ch == 1)
        {
            System.out.println("1 . New Entry\n2 . Vehicle_info\n3 . Display");
            System.out.print("Enter you choise : ");
            int var = scan.nextInt();
            System.out.println("");
            switch(var)
            {
                case 1:
                    System.out.print("Enter the Vehicle number : ");
                    v_no = scan.nextInt();
                    System.out.print("Enter the vehicle type : ");
                    v_type = scan.next();
                    System.out.print("Enter the Paying status : ");
                    p_status = scan.nextBoolean();
                    obj[i] = new TollBooth(v_no,v_type,p_status);
                    if(p_status == true)
                        obj[i].paying_vehicle();
                    else{
                        obj[i].noPayVehicle();
                        TollBooth.non_pay_vehicle = obj[i].get_count_nonpay_vehicle(v_type);
                    }
                    i++;
                    if(i>20)
                    {
                        System.out.println("Out of Limits..");
                        break;
                    }
                    break;
                case 2:
                    System.out.print("Enter vehicle number to get Info : ");
                    int num = scan.nextInt();
                    for(int z=0;z<TollBooth.no_of_vehicle;z++) {
                        if(obj[z].vehicle_no == num){
                            obj[z].Vehicle_info();
                            break;
                        }
                    }
                    break;
                case 3:
                    TollBooth.Display();
                    System.out.println("Total No. of non paying vehicle Are : "+(TollBooth.non_pay_vehicle[0]+TollBooth.non_pay_vehicle[1]));
                    System.out.println("Non paying cars : "+TollBooth.non_pay_car+"\nNon paying trucks : "+TollBooth.non_pay_truck);
                    break;
                default:
                    System.out.println("Out of choise..");
                    break;
            }
            System.out.println("");
            System.out.print("Do u want to Continue [Yes : 1/ No : 0] :");
            ch = scan.nextInt();
            System.out.println("");
        }
        scan.close();
    }
}