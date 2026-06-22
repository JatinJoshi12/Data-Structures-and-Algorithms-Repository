import java .util.*;
class Number_Spiral
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i =1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                int a=i;
                int b=j;
                if(i>n)
                {
                    a=2*n-i;
                }
                if(j>n)
                {
                    a=2*n-j;
                }
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}