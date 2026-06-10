import java.util.*;
class TSA{
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Length of Cuboid :");
    int l=scan.nextInt();
    System.out.println("Enter Width of Cuboid :");
    int w=scan.nextInt();
    System.out.println("Enter Height of Cuboid :");
    int h=scan.nextInt();
    System.out.println("Total Surface Area of Cuboid is :"+(2*(l*h+l*w+w*h)));
    }
}