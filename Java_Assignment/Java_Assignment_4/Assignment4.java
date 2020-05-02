package Java_Assignment.Java_Assignment_4;
import java.util.*;


class Apparel{
    static int counter;
    String item_id,item_type;
    double prise;
    int points;
    static {
        counter=100;
    }
    Apparel(double prise,String item_type){
        this.prise=prise;
        this.item_type=item_type;
        item_id=get_item_id();
    }
    void calculate_prise(){
        prise+=(0.05*prise);
    }
    String get_item_id(){
        if("Cotton".equals(item_type)){
            counter++;
            return "C"+Integer.toString(counter);
        }
        else{
            counter++;
            return "S"+Integer.toString(counter);
        }
    }
    void info(){
        System.out.println("item_type : "+item_type);
        System.out.println("item_id : "+item_id);
        System.out.println("prise : "+prise);
        if("Silk".equals(item_type))
            System.out.println("Points of silk : "+points);
    }
}

class Cotton extends Apparel{
    double discount;
    Cotton(double discount,double prise,String item_type){
        super(prise,item_type);
        this.discount=discount;
    }
    void get_discount(){
        super.prise-=((discount/100)*super.prise);
    }
    @Override
    void calculate_prise(){
        super.calculate_prise();
        this.get_discount();
        super.prise+=((0.05)*super.prise);
    }
}

class Silk extends Apparel{
    int points=0;
    Silk(double prise,String item_type){
        super(prise,item_type);
    }
    @Override
    void calculate_prise(){
        super.calculate_prise();
        this.get_points();
        super.prise+=((0.1)*super.prise);
    }
    void get_points(){
        if(super.prise>10000)
           points+=10;
        else
            points+=3;
        super.points=this.points;
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cotton[] c=new Cotton[5];
        Silk[] s=new Silk[5];
        int i=0,j=0;
        for(int k=0;k<4;k++){
            System.out.print("Enter type of item(write Cotton or Silk) : ");
            String item_type=sc.next();
            System.out.print("Enter prise of item : ");
            double prise=sc.nextDouble();
            if("Cotton".equals(item_type)){
                System.out.print("Enter discount : ");
                double discount=sc.nextDouble();
                c[i]=new Cotton(discount,prise,item_type);
                c[i++].calculate_prise();
            }
            else{
                 s[j]=new Silk(prise,item_type);
                 s[j++].calculate_prise();
            }
        }
        System.out.println("-------------All Information----------------");
        for(int m=0;m<i;m++){
            c[m].info();
            System.out.println("--------------------------");
        }
        for(int n=0;n<j;n++){
            s[n].info();
            System.out.println("-----------------------------");
        }
        sc.close();
    } 
}