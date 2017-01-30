import java.io.*;
import java.util.*;
import java.lang.Math.*;

class node
{
    int val;
    node left,right;

    public node()
    {
        left=null;
        right=null;
        val=-1;
    }
    public node(int x)
    {
        left=null;
        right=null;
        val=x;
    }
    public void setLeft(node x)
    {
        left=x;
    }
    public void setRight(node x)
    {
        right=x;
    }
    public node getLeft()
    {
        return left;
    }
    public node getRight()
    {
        return right;
    }
    public void setData(int x)
    {
        val=x;
    }
    public int getData()
    {
        return val;
    }

}//class node

class node_operations
{
    node root;

    public node_operations()
    {
        root=null;
    }

    public void insert(int x)
    {
        root=insertion(root,x);
    }

    public node insertion(node n, int x)
    {
        if(n==null)
        {
            n = new node(x);
        }

        else
        {
            if(n.getLeft()==null)
                n.setLeft(insertion(n.left,x));
            else
                n.setRight(insertion(n.right,x));
        }
        return n;
    }

    public void inorder_traversal()
    {
        inorder(root);
    }

    public void inorder(node x)
    {
        if(x==null)
            return;
        inorder(x.getLeft());
        System.out.println(x.getData());
        inorder(x.getRight());
    }

    public void count()
    {
        System.out.println(max_depth(root));
    }

    public int max_depth(node x)
    {
        

        if(x==null)
            return 0;

        int ldepth=0,rdepth=0;
        ldepth=max_depth(x.getLeft());
        rdepth=max_depth(x.getRight());
        
        if(ldepth>rdepth)
            return ldepth+1;
        else
            return rdepth+1;
        

    }

}//class node_operations

public class tree
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        node_operations temp = new node_operations();
        int num;
        int a[]=new int[50];
        System.out.println("Enter number of nodes in the Binary Tree: ");
        num=in.nextInt();
        System.out.println("Enter tree elements: ");
        for(int i=0;i<num;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            temp.insert(a[i]);
        }

        temp.inorder_traversal();
        temp.count();

    }
}