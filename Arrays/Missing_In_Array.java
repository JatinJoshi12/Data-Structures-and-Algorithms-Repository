import java.util.*;
class Missing_In_Array
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=scan.nextInt();  
        int[] arr=new int[n-1];
        int arraysum=0;
        int sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
            arraysum+=arr[i];
        }
        int MissNum=sum-arraysum;
        System.out.println(MissNum);
    }
}