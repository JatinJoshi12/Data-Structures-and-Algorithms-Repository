import java.util.*;
class Pattern_3
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int mid =n/2+1;
        if(n%2==1)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==mid || j== mid)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}