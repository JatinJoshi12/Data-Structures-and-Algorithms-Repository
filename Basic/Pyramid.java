import java.util.*;
class Pyramid
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=nsp;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("*");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}