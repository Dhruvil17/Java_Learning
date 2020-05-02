class pattern
{
    public static void main(String[] args) {
        for(int i=7;i>0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int z=i-1;z<7;z++)
            {
                    System.out.print("A ");
            }
            System.out.print("\n");
        }
    }
}