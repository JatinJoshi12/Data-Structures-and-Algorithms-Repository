import java.util.*;

class Reverse_Of_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to Reverse It.");
        int n=scan.nextInt();
        int RevN=0;
        for(int i=n;i>0;i/=10)
        {
            RevN=RevN*10+i%10;
        }
        System.out.println("Reversed NUmber - "+RevN);
    }
}