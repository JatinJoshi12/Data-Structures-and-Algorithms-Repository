import java.util.*;

class VOLUME {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius of a Sphere");
        int r=scan.nextInt();
        System.out.println("Volume of Sphere is "+(4/3*3.1415*r*r*r));
    }
}