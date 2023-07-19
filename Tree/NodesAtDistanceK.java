/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Main
{
    public static void printNodes(TreeNode root,int k)
    {
        if(root == null || k<0){
            return;
        }
        if(k==0)
        {
            System.out.print(root.val + " ");
            return;
        }
        printNodes(root.left,k-1);
        printNodes(root.right,k-1);
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		int k =2;
		System.out.println("node at distance " + k + ":");
		printNodes(root,k);
		}
}
