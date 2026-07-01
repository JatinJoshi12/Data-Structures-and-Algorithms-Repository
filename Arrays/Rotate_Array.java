import java.util.*;
class Rotate_Array
{
    public static void rev(int[] arr, int i,int j)
    {
        int temp;
        while(i<j)
        {
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter a Number");
        int d=scan.nextInt();
        rev(arr,0,arr.length-1);
        rev(arr,0,arr.length-d-1);
        rev(arr,arr.length-d,arr.length-1);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    } 
}