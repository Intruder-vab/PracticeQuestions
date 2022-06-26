import java.util.HashMap;
import java.util.Scanner;

public class LongSubsWoRepChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stx;
        stx = sc.next();

        int result = LengthOfLongestSubstring(stx);

        System.out.println("The length of longest substring without repeating characters is: " + result);
    }

    private static int LengthOfLongestSubstring(String st)
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        int left=0;
        int right=0;
        int len=0;
        int n=st.length();

        while(right<n)
        {
            if(mp.containsKey(st.charAt(right)))
                left = Math.max(mp.get(st.charAt(right))+1, left);

            mp.put(st.charAt(right), right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}
