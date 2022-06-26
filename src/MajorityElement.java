import java.util.Scanner;

public class MajorityElement {

    public static int majorityElement(int[] arr, int size)      //Moore's Algorithm
    {
        int res = arr[0];
        int count = 1;

        for(int i=0;i<size;i++)
        {
            if(res == arr[i])
                count++;
            else
                count--;

            if(count == 0)
            {
                res = arr[i];
                count = 1;
            }
        }
        return res;
    }

    public static int majorityElementHashMap(int[] arr, int size)
    {

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array:");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Majority Element in the array is:" + majorityElement(arr,size));
        //System.out.println();
    }
}
