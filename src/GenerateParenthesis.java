import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the pair number for parenthesis generation");
        n = sc.nextInt();

        System.out.println(genPar(n));
    }

    private static List<String> genPar(int n)
    {
        List<String> result = new ArrayList<>();
        findAll("(",1,0,result,n);
        return result;
    }

    static void findAll(String curr, int open, int close, List<String> result, int n)
    {
        if(curr.length() == 2*n)
        {
            result.add(curr);
            return;
        }
        if(open < n)
        {
            findAll(curr + "(", open+1, close, result, n);
        }

        if(close < open)
        {
            findAll(curr + ")", open, close+1, result, n);
        }
    }
}
