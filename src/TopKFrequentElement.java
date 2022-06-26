import java.util.*;

public class TopKFrequentElement {

    public static int[] topKFreq(int[] nums,int k)
    {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0) + 1);
        }

        for(int key : hm.keySet())
        {
            int freq = hm.get(key);
            if(bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int ans[] =new int[k];
        int count = 0;
        for(int i=bucket.length -1;i>=0;i--)
        {
            if(bucket[i] != null)
            {
                for(int j=0;j<bucket[i].size();j++)
                    ans[count++] = bucket[i].get(j);
            }
            if(count == k)
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz,k;
        System.out.println("Enter the size of the array");
        sz = sc.nextInt();
        int[] arr = new int[sz];
        System.out.println("Enter the numbers");
        for(int i=0;i<sz;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the k value ");
        k = sc.nextInt();
        System.out.println(Arrays.toString(topKFreq(arr,k)));
    }
}
