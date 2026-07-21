import java.util.*;
public class Two_Sum_Better_Approach {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] arr={1,4,5,3,2,6,7,8,6};
        System.out.println("Enter Target");
        int target=scan.nextInt();
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);
        int c=0;
        while(i<j)
        {
            if(arr[i]+arr[j]<target)
            {
                i++;
            }
            else if(arr[i]+arr[j]>target)
            {
                j--;
            }
            else
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("Found the Target");
        }
        else
        {
            System.out.println("Target Not Found");
        }
    }
}
