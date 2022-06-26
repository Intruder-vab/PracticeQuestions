import java.util.Stack;

public class MaxEleInStack {

    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> stMax = new Stack<>();

    public void push(int data)
    {
        int max = data;
        if(!stMax.isEmpty() && max<stMax.peek())
            max=stMax.peek();
        st.push(data);
        stMax.push(max);
    }

    public void pop()
    {
        st.pop();
        stMax.pop();
    }

    public int getMax()
    {
        return stMax.peek();
    }

    public static void main(String[] args) {
        MaxEleInStack mes = new MaxEleInStack();
        mes.push(4);
        mes.push(3);
        mes.push(9);
        mes.push(2);
        mes.push(8);
        System.out.println(mes.getMax());
        mes.pop();
        mes.pop();
        mes.pop();
        System.out.println(mes.getMax());
    }
}
