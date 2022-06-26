public class SecondLargest {

    public static void print2ndLargest(int arr[])
    {
        if(arr.length<2)
        {
            System.out.println("No 2nd largest element");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }

            if(arr[i] != largest && arr[i] > secondLargest)
                secondLargest=arr[i];
        }
        if(secondLargest==Integer.MIN_VALUE)
            System.out.println("No 2nd largest found");
        else
            System.out.println("The second largest element is " + secondLargest);
    }

    public static void main(String[] args) {
        int arr[] = {-1,70,10,34,18,78};
        print2ndLargest(arr);
    }
}
