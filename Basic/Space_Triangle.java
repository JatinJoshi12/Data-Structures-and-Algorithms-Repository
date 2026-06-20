import java.util.*;
class Space_Triangle
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sp=n;
        for(int i=1;i<=n;i++)
        {
            for(int s=sp;s<n;s++)
            {
                System.out.print(" ");
            }
            sp--;
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}