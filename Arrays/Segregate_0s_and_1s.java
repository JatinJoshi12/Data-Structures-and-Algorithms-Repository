import java.util.*;
class Rough
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=scan.nextInt();
        }
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            if(a[i]==0)
                i++;
            else if(a[j]==1)
                j--;
            else if(a[i]==1&&a[j]==0)
            {
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for(int ele:a)
        {
            System.out.println(ele+" ");
        }
    }
}