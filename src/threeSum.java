import java.util.*;

public class threeSum {
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

            List<List<Integer>> resList = new ArrayList<>();
            resList = thrsum(arr, sz);
            System.out.println(resList);
        }
        else
            System.out.println("[]");
    }

    public static List<List<Integer>> thrsum(int[] arr, int sz)
    {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<sz-2;i++)
        {
            int j=i+1;
            int k = sz-1;
            while(j<k)
            {
                int sum = arr[j]+arr[k];
                if(sum == -arr[i])
                {
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                }
                else if (sum > -arr[i])
                    k--;
                else if (sum < -arr[i])
                    j++;
            }
        }
        return new ArrayList<>(res);
    }

}
