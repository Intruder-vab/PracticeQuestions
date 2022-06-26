import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimpleBinaryTree {
    public int data;
    public SimpleBinaryTree left,right;

    public SimpleBinaryTree(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    public int getData()
    {
        return data;
    }

    public void preOrder(SimpleBinaryTree root)  //PreOrder traversal Recursive
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public ArrayList<Integer> preOrderIterative(SimpleBinaryTree root)  //PreOrder traversal Iterative
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<SimpleBinaryTree> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty())
        {
            SimpleBinaryTree temp = st.pop();
            res.add(temp.data);

            if(temp.right != null)
                st.push(temp.right);
            if(temp.left != null)
                st.push(temp.left);
        }
        return res;
    }
    public void inOrder(SimpleBinaryTree root)  //InOrder traversal Recursive
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public ArrayList<Integer> inOrderIterative(SimpleBinaryTree root)   //Inorder traversal Iterative
    {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<SimpleBinaryTree> st = new Stack<>();

        SimpleBinaryTree curr = root;
        boolean done = false;
        while(!done)
        {
            if(curr != null)
            {
                st.push(curr);
                curr = curr.left;
            }else
            {
                if(st.isEmpty())
                    done = true;
                else
                {
                    curr = st.pop();
                    res.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return res;
    }

    public void postOrder(SimpleBinaryTree root)
    {
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public List<Integer> postOrderIterative(SimpleBinaryTree root)
    {
        SimpleBinaryTree cur = root;
        Stack<SimpleBinaryTree> st = new Stack<>();
        SimpleBinaryTree temp = null;
        List<Integer> res = new ArrayList<>();

        while(cur != null || !st.isEmpty())
        {
            if(cur != null)
            {
                st.push(cur);
                cur = cur.left;
            }
            else
            {
                temp = st.peek().right;
                if(temp == null)
                {
                    temp = st.pop();
                    res.add(temp.data);
                    while(!st.isEmpty() && temp==st.peek().right)
                    {
                        temp = st.pop();
                        res.add(temp.data);
                    }
                }
                else
                    cur = temp;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        SimpleBinaryTree root = new SimpleBinaryTree(1);
        root.left = new SimpleBinaryTree(2);
        root.right = new SimpleBinaryTree(3);
        root.left.left = new SimpleBinaryTree(4);
        root.left.right = new SimpleBinaryTree(5);
        root.right.left = new SimpleBinaryTree(6);
        root.right.right = new SimpleBinaryTree(7);


        System.out.println("PreOrder traversal :-");        //PreOrder Recursive and Iterative
        root.preOrder(root);
        System.out.println();
        System.out.println(root.preOrderIterative(root));

        System.out.println("InOrder traversal :-");         //Inorder Recursive and Iterative
        root.inOrder(root);
        System.out.println();
        System.out.println(root.inOrderIterative(root));

        System.out.println("PostOrder traversal :-");       //PostOrder Recursive and Iterative
        root.postOrder(root);
        System.out.println();
        System.out.println(root.postOrderIterative(root));
    }

}
