import java.util.*;
class ABC
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A Number to Check Whether Number's Magnitude Is Greater Than 69 or Not");
        int n=scan.nextInt();
        int x=0;
        if(n>0)
        {
            x=n;
        }
        if(n<=0)
        {
            x=-n;
        }
        if(x>69)
        System.out.println("Greater Than 69");
        else if(x==69)
        {
            System.out.println("Equal to 69");
        }
        else
        System.out.println("Smaller Than 69");
    }
}