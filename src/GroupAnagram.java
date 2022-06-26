import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(gpAna(st));
    }
    static private List<List<String>> gpAna (String[] st)
    {
        Map<String,List<String>> mp = new HashMap<>();
        for(String s:st)
        {
            // Sorting the alphabets of the string to make it as a key for map
            char chArr[] = s.toCharArray();
            Arrays.sort(chArr);
            String sorted = new String(chArr);

            if(!mp.containsKey(sorted))
                mp.put(sorted, new LinkedList<String>());
            mp.get(sorted).add(s);

        }
        return new LinkedList<>(mp.values());
    }
}
