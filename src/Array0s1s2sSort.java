import java.util.Arrays;
import java.util.Scanner;

public class Array0s1s2sSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz;
        System.out.println("Enter the size of the array");
        sz=sc.nextInt();
        int[] arr = new int[sz];
        System.out.println("Enter elements in the array");
        if(sz>0) {
            for (int i = 0; i < sz; i++)
                arr[i] = sc.nextInt();

            int low =0;
            int mid =0;
            int hi = arr.length-1;
            int temp;
            while(mid<=hi)
            {
                if(arr[mid] == 0)
                {
                    temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                    mid++;
                }
                else if(arr[mid] == 1)
                    mid++;
                else if(arr[mid] == 2)
                {
                    temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else
        {
            System.out.println("Invalid array size!! Code terminates");
        }

    }
}
