import java.util.*;
class Segregate_0s_and_1s
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        int Zeroes=0;
        System.out.println("Enter Elements only as 0s and 1s ");
        for(int i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
            if(arr[i]==0)
            Zeroes++;
        }
        for(int i=0;i<Zeroes;i++)
        {
            arr[i]=0;
        }
        for(int i=Zeroes;i<arr.length;i++)
        {
            arr[i]=1;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}