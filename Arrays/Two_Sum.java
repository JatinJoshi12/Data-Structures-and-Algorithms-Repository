import java.util.*;
class Two_Sum
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter a Number whose sum we want .");
        int target=scan.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("Two Number of Array Are : "+arr[i]+","+arr[j]);
                }
            }
        }
    }
}