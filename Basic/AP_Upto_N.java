import java.util.*;
class AP
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Terms ");
        int n=scan.nextInt();
        int a,d;
        System.out.println("Enter A and D");
        a=scan.nextInt();
        d=scan.nextInt();
        int c=0;
        for(int i=a;c<n;i=i+d)
        {
            System.out.println(i);
            c++;
        }
    }
}