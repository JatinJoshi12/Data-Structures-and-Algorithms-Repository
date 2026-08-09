package Array;
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={1,4,5,3,6,7,9,87,100};
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele:arr)
        {
            System.out.println(ele);
        }
    }
}
