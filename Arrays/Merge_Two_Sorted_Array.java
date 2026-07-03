import java.util.*;

class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int k = 0;
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[a.length + b.length];
        for (int x = 0; x < a.length; x++) {
            a[x] = scan.nextInt();
        }
        for (int y = 0; y < b.length; y++) {
            b[y] = scan.nextInt();
        }
        while (i != a.length && j != b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else if (a[i] >= b[j]) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if (i == a.length) {
            while (j != b.length) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if (j == b.length) {
            while (i != a.length) {
                c[k] = a[j];
                k++;
                j++;
            }
        }
        int z;
        for (z = 0; z < a.length; z++) {
            System.out.print(a[z] + " ");
        }
        System.out.println();
        for (z = 0; z < b.length; z++) {
            System.out.print(b[z] + " ");
        }
        System.out.println();
        for (z = 0; z < c.length; z++) {
            System.out.print(c[z] + " ");
        }
    }
}