import java.util.*;
class Pattern_1
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=scan.nextInt();
        for(int i=n;i>0;i--)
        {
            if((n-(i-1))<=i)
            {
            System.out.println(n-(i-1));
            System.out.println(i);
            }
        }
    }
}