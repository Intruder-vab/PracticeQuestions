import java.util.Stack;

public class MinEleInStack {
    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> stMax = new Stack<>();

    public void push(int data)
    {
        int min = data;
        if(!stMax.isEmpty() && min>stMax.peek())
            min=stMax.peek();
        st.push(data);
        stMax.push(min);
    }

    public void pop()
    {
        st.pop();
        stMax.pop();
    }

    public int getMin()
    {
        return stMax.peek();
    }

    public static void main(String[] args) {
        MinEleInStack mes = new MinEleInStack();
        mes.push(4);
        mes.push(3);
        mes.push(9);
        mes.push(2);
        mes.push(8);
        System.out.println(mes.getMin());
        mes.pop();
        mes.pop();
        mes.pop();
        System.out.println(mes.getMin());
    }
}
