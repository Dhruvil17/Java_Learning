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

    void loan_condition(int amount)
    {
        if(amount <= 2*account_bal && amount<networth){
            System.out.println("Loan Granted..");
            loan_sanctioned = loan = amount;
            networth -= amount;
        }
        else
            System.out.println("Not enough balance for loan..");
    }

    int loan_repay(int amount)
    {
        int count = 0;
        if(amount>loan_sanctioned)
        {
            account_bal += amount - loan_sanctioned;
            networth += amount - loan_sanctioned;
            loan_sanctioned = loan = 0;
            count++;
        }
        else
        {
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
        System.out.println("No. of Instalments : ");
    }

    void inspection()
    {
        System.out.println("Network of Bank : "+networth);
        System.out.println("Total no. of Accounts : "+no_of_account);
        System.out.println("Total loan sanctioned : "+loan);
    }
}

public class Banking{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int no,bal,l;
        int ch = 1;

        while(ch == 1)
        {
            System.out.print("1 . New Account\n2 . Account Info\n3 . Loan Sanctioned\n4 . Inspection");
            int cs = scan.nextInt();
            switch(cs)
            {
                case 1:
                    System.out.print("Enter account no. :");
                    no = scan.nextInt();
                    System.out.print("Enter Customer Name : ");
                    name = scan.next();
                    System.out.print("Enter balance : ");
                    bal = scan.nextInt();

            }
        }
    }
}