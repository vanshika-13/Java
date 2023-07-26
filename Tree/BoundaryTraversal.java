import java.util.*;

class Node{
    int data;
    Node left,right;
    
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Main{
    
    
    static boolean isLeaf(Node root){
        return (root.left == null) && (root.right == null);
    }
    
    static void addLeftBoundry(Node root, ArrayList<Integer> ans){
        if (root == null || (root.left == null && root.right == null)) {
			return;
		}

		ans.add(root.data);

		if (root.left != null) {
			addLeftBoundry(root.left, ans);
		} 
        
        else {
			addLeftBoundry(root.right, ans);
		}
    }
    
    static void addLeaves(Node root, ArrayList<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        if(root.left != null) addLeaves(root.left,ans);
        if(root.right!=null) addLeaves(root.right,ans);
    }
    
    static void addRightBoundry(Node root, ArrayList<Integer> ans){
       if (root == null || (root.left == null && root.right == null)) {
			return;
		}

		if (root.right != null) {
			addRightBoundry(root.right, ans);
		} 
        
        else {
			addRightBoundry(root.left, ans);
		}

		ans.add(root.data);
    }
    
    
    static ArrayList<Integer> printBoundry(Node root){
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        if(isLeaf(root) == false) ans.add(root.data);
        addLeftBoundry(root.left,ans);
        addLeaves(root,ans);
        addRightBoundry(root.right,ans);
        return ans;
    }

	public static void main(String[] args) {
		
		Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);
        
        ArrayList<Integer> btraversal;
        btraversal = printBoundry(root);
        
        System.out.println("The boundary traversal is: ");
        for(int i=0;i<btraversal.size();i++){
            System.out.print(btraversal.get(i) + " ");
        }
	}
}
