import java.util.*;
class Wave_Array
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(i%2==0)
            {
                if(arr[i]<arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            if(i%2==1)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
         for(int i=0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
}