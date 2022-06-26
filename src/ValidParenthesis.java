import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter parenthesis string");
        str = sc.next();

        boolean result = isValid(str);
        System.out.println(result);
    }

    private static boolean isValid(String str)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                st.push(str.charAt(i));
            else
            {
                if(st.empty())
                    return false;
                char c = st.pop();
                if((str.charAt(i) == ')' && c == '(') || (str.charAt(i) == '}' && c == '{') || (str.charAt(i) == ']' && c == '['))
                    continue;
                else
                    return false;
            }
        }

        if(st.empty())
            return true;
        else
            return false;
    }
}
