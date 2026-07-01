import java.util.*;
class Reverse_Array
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int temp=0;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}