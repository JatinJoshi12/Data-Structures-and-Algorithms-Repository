import java.util.*;
class Smallest_Of_Three_Number
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println(a<b?(a<c?a:c):(b<c?b:c));
    }
}