package Java_Assignment.Java_Assignment_1;

class A {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=7-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            System.out.print("A");
            for(int k=0;k<2*i;k++)
            {
                if(i==2)
                    System.out.print("A");   
                else
                    System.out.print(" ");
            }
            if(i == 0)
                System.out.print("\n");
            else
                System.out.print("A\n");
        }
    }
}
