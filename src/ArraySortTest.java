import java.util.Arrays;

public class ArraySortTest {
    public static void main(String[] args) {
        int [][] arr = {{8,10},{15,18},{2,6},{1,3}};
        Arrays.sort(arr,(a,b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(arr));
    }
}
