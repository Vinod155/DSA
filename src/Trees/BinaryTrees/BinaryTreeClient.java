package Trees.BinaryTrees;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeClient {

    public static ArrayList<Integer> res=new ArrayList<>();
    public static  Stack<Node> st=new Stack<>();
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.root=new Node(10);
        bt.root.left=new Node(20);
        bt.root.right=new Node(30);
        bt.root.right.left=new Node(50);
        bt.root.right.left.right=new Node(60);

        bt.root.left.left=new Node(40);


//        inorder(bt.root);
//        System.out.println("**********");
//        preorder(bt.root);
//        System.out.println("**********");
//        postorder(bt.root);

        path(bt.root,60);
        for(Node i:st)
        {
            System.out.println(i.data);
        }
    }

    public static boolean path(Node root,int target)
    {
        if(root==null)return false;
        st.push(root);
        if(root.data==target)
        {
           return true;
        }
        if(path(root.left,target)|| path(root.right,target))
        {
            return true;
        }
        st.pop();
        return false;

    }
    public static void inorder(Node root)
    {
        if(root==null)return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void preorder(Node root)
    {
        if(root==null)return;
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }

    public static void postorder(Node root)
    {
        if(root==null)return;
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.data);
    }

    public static  boolean find(Node root,int val)
    {
        if(root==null)return false;
        if(root.data==val)
        {
            return true;
        }
        return find(root.left,val) || find(root.right,val);
    }

    public static  int Height(Node root)
    {
        if(root==null)return -1;

       int lh= Height(root.left);
       int rh=Height(root.right);

       return Math.max(lh,rh)+1;

    }
}
