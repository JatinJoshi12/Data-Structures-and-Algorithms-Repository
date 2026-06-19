import java.util.*;
class Pattern_4
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                c+=2;
            }
            c=1;
            System.out.println();
        }
    }
}