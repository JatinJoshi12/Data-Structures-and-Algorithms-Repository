import java.util.*;
class Point
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 Points X and Y");
        int x=scan.nextInt();
        int y=scan.nextInt();
        if(x==0&&y==0)
        System.out.println("Point is At Origin");
        else if(x==0 &&y!=0)
        System.out.println("Points is At Y Axis");
        else if(y==0 &&x!=0)
        System.out.println("Points is At X Axis");
        else if(x>0 &&y>0)
        System.out.println("Points is in First Quadrant");
        else if(x<0 &&y>0)
        System.out.println("Points is in Second Quadrant");
        else if(x<0 &&y<0)
        System.out.println("Points is in Third Quadrant");
        else if(x>0 &&y<0)
        System.out.println("Points is in Fourth Quadrant");
    }
}