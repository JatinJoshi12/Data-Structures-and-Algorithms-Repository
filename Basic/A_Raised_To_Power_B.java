import java.util.*;
class A_Raised_To_Power_B
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A And B");
        int a =scan.nextInt();
        int b =scan.nextInt();
        int Final=1;
        for(int i=1;i<=b;i++)
        {
            Final=Final*a;
        }
        System.out.println("A Raised to The Power B is : "+Final);
    }
}