/******************************************************************************

Write a Java program to convert an array of sorted items into a binary search tree. 
Maintain the minimal height of the tree.

Input:
6
1 2 3 4 5 6

Output:
2
1
4
6
5
3

*******************************************************************************/
import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

public class Main
{
    public static TreeNode binaryTree(int[] a){
        if(a.length==0) return null;
        return generate(a,0,a.length-1);
    }
    
    public static TreeNode generate(int[] a,int s,int e){
        TreeNode node=new TreeNode(0);
        if(s==e-1){
            node=new TreeNode(a[s]);
            node.right=new TreeNode(a[e]);
        }else if(s==e) return new TreeNode(a[s]);
        else{
            int m=(s+e)/2;
            node.val=a[m];
            node.left=generate(a,s,m-1);
            node.right=generate(a,m+1,e);
        }
        return node;
    }
    
    public static void traverse(TreeNode root){
        if(root!=null){
            traverse(root.left);
            traverse(root.right);
            System.out.println(root.val);
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	TreeNode head=binaryTree(a);
	traverse(head);
	}
}
