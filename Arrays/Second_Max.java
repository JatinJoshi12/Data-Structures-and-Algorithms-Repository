import java.util.*;
class Second_Maximum
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        int p=0;
        int s=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(s<arr[i])
            {
                s=arr[i];
                p=i;
            }
        }
        arr[p]=Integer.MIN_VALUE;
        s=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(s<arr[i])
            {
                s=arr[i];
            }
        }
        System.out.println("Second Largest Element is : "+s);
    }
}