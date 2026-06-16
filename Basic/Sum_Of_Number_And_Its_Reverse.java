import java.util.*;
class Sum_Of_Number_And_Its_Reverse
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number to Perform a Task .");
        int n=scan.nextInt();
        int sum=0;
        int rev=0;
        for(int i=n;i>0;i/=10)
        {
            sum+=i%10;
        }
        for(int i=sum;i>0;i/=10)
        {
            rev=rev*10+i%10;
        }
        System.out.println("Sum of Number :"+sum);
        System.out.println("Reverse of Sum of Number :"+rev);
    }
}