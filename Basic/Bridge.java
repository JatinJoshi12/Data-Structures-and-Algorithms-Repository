import java.util.*;
class Bridge
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nsp=-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            for(int s=1;s<=nsp;s++)
                System.out.print("  ");
            for(int k=n;k>=i;k--)
            {
                if(i==1)
                {
                    if(k==1)
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
            nsp+=2;
        }
    }
}