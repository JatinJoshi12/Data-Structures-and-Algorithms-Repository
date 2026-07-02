import java.util.*;
class Reverse_ArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(5);
        arr.add(30);
        arr.add(60);
        arr.add(78);
        System.out.println(arr);
        int i=0;
        int j=arr.size()-1;
        while(i<j)
        {
            int temp=arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}