import java.util.*;
class Prime_Number
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number to Check if Its Prime Or Not .");
        int n=scan.nextInt();
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=false;
            }
        }
        if(flag== false)
        {
            System.out.println("It is not a Prime Number");
        }
        else
            System.out.println("It is a Prime Number");
    }
}