import java.util.Scanner;
class Pattern{
    public static void main(String[] args)
    { 
        System.out.println(" Enter a number Printing pattern from 1 to 5: ");
     Scanner s=new Scanner(System.in);
       int r= s.nextInt();
        for(int i=1;i<=r;i++)
            {
                for(int j=r;j>=i;j--)
                    {
                        System.out.print("*\t\t");
                    }
                System.out.println();
            }
        for(int i=1;i<=r;i++) // 3 is rows
            { 
                for(int j=r;j>i;j--)  // 3 is rows for spacing
                    System.out.print(" "+"\t\t");
                 for(int j=i;j>1;j--)
                    System.out.print(j+"\t\t");
                for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+"\t\t");
                    }
               
                System.out.println();
            }
     for(int i=r-1;i>=1;i--) //  2 is row-1
            { for(int j=r-1;j>=i;j--)// j=2 is total row
                    System.out.print(" "+"\t\t");
                for(int j=i;j>1;j--)
                    System.out.print(j+"\t\t");
              for(int j=1;j<=i;j++)
                   System.out.print(j+"\t\t");
                System.out.println();
            }
    }
}
