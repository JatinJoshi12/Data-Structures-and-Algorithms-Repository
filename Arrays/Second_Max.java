import java.util.*;
class Second_Max
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        int smax=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(smax<arr[i]&&arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        System.out.println("Second Largest Element is : "+smax);
    }
}