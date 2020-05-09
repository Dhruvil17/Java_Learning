package Java_Assignment.Java_Assignment_2;
import java.util.Scanner;

class BankBranch
{
    static int networth = 50000;
    static int no_of_account = 0;
    static int loan = 0;

    String c_name;
    int c_no;
    int account_bal;
    int loan_sanctioned;
 
    BankBranch(int c_no,String c_name,int account_bal,int loan_sanctioned)
    {
        this.c_name = c_name;
        this.c_no = c_no;
        this.account_bal = account_bal;
        this.loan_sanctioned = loan_sanctioned;
    }

    void net_worth_and_account()
    {   
        no_of_account++;
        networth += account_bal;
    }

    void loan_approval (int amount)
    {
        if(amount <= 2*account_bal && amount<networth){
            System.out.println("Loan Granted..");
            account_bal += amount;
            loan_sanctioned = loan = amount;
            networth = networth - amount;
        }
        else
            System.out.println("Not enough balance for loan..");
    }

    int loan_repay(int amount)
    {
        int count = 0;
        if(amount > loan_sanctioned)
        {
            account_bal += (amount - loan_sanctioned);
            networth += (amount - loan_sanctioned);
            loan -= loan_sanctioned;
            loan_sanctioned = 0;
            count++;
        }
        else
        {
            account_bal -= amount;
            loan_sanctioned = loan = loan_sanctioned - amount;
            networth += amount;
            count++;
        }
        return count;
    }

    void account_info()
    {
        System.out.println("Account No.     : "+c_no);
        System.out.println("Customer Name   : "+c_name);
        System.out.println("Account balance : "+account_bal);
        System.out.println("Loan Sanctioned : "+loan_sanctioned);
    }

    public static void inspection()
    {
        System.out.println("Networth of Bank : "+networth);
        System.out.println("Total no. of Accounts : "+no_of_account);
        System.out.println("Total loan sanctioned : "+loan);
    }
}

public class Banking{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int no,bal,l;
        int ch = 1,numCount = 0;

        BankBranch bk[] = new BankBranch[10];

        while(ch == 1)
        {
            System.out.println("1 . New Account\n2 . Account Info\n3 . Loan Sanctioned\n4 . Loan repay\n5 . Inspection\n");
            System.out.print("Enter your choise : ");
            int cs = scan.nextInt();
            System.out.println("");
            switch(cs)
            {
                case 1:
                    if(numCount>10)
                        System.out.println("No more than 10 entries ..");

                    System.out.print("Enter account no. :");
                    no = scan.nextInt();
                    System.out.print("Enter Customer Name : ");
                    name = scan.next();
                    System.out.print("Enter balance : ");
                    bal = scan.nextInt();
                    bk[numCount] = new BankBranch(no, name, bal,0);
                    bk[numCount].net_worth_and_account();
                    numCount++;
                    
                    break;
                case 2:
                    System.out.print("Enter your Account no. : ");
                    int ac_no = scan.nextInt();
                    for(int i=0;i<10;i++)
                    {
                        if(bk[i].c_no == ac_no)
                        {
                            bk[i].account_info();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("For which Account no. do you want loan : ");
                    int cn = scan.nextInt();
                    System.out.print("Enter ammount of loan : ");
                    l = scan.nextInt();
                    bk[cn-1].loan_approval(l);
                    break;
                case 4:
                    System.out.print("For which Account no. do you want loan repay : ");
                    int cr = scan.nextInt();
                    System.out.print("Enter the ammount of loan repay : ");
                    int l_repay = scan.nextInt();
                    bk[cr-1].loan_repay(l_repay);
                    break;
                case 5:
                    BankBranch.inspection();
                    break;
                default:
                    System.out.println("Wrong choise ...");
                    break;
            }
            System.out.println("");
            System.out.print("Do u want to continue [1 for Yes / 0 for No] :");
            ch = scan.nextInt();
        }
        scan.close();
    }
}