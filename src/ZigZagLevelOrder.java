import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ZigZagLevelOrder extends SimpleBinaryTree {

    public ZigZagLevelOrder(int data) {
        super(data);
    }

    public static List<List<Integer>> ZZLevelOrder(SimpleBinaryTree root)
    {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<SimpleBinaryTree> s1 = new Stack<>();     //left to right
        Stack<SimpleBinaryTree> s2 = new Stack<>();     //right to left

        s1.push(root);
        List<Integer> list = new ArrayList<>();

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                SimpleBinaryTree n = s1.pop();
                list.add(n.data);
                if(n.left != null)
                    s2.push(n.left);
                if(n.right != null)
                    s2.push(n.right);
            }
            if(!list.isEmpty())
                res.add(new ArrayList<>(list));
            list.clear();

            while(!s2.isEmpty())
            {
                SimpleBinaryTree n = s2.pop();
                list.add(n.data);
                if(n.right != null)
                    s1.push(n.right);
                if(n.left != null)
                    s1.push(n.left);
            }
            if(!list.isEmpty())
                res.add(new ArrayList<>(list));
            list.clear();
        }
        return res;
    }

    public static void main(String[] args) {
        /*SimpleBinaryTree root = new SimpleBinaryTree(3);
        root.left = new SimpleBinaryTree(9);
        root.right = new SimpleBinaryTree(20);
        root.right.left = new SimpleBinaryTree(15);
        root.right.right = new SimpleBinaryTree(17); */

        SimpleBinaryTree root = new SimpleBinaryTree(1);
        root.left = new SimpleBinaryTree(2);
        root.right = new SimpleBinaryTree(3);
        root.left.left = new SimpleBinaryTree(4);
        root.left.right = new SimpleBinaryTree(5);
        root.right.left = new SimpleBinaryTree(6);
        root.right.right = new SimpleBinaryTree(7);


        System.out.println(ZZLevelOrder(root));


    }
}
