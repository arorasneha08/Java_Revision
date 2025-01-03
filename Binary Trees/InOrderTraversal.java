import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
    public void inorder(TreeNode root, List<Integer> in){
        if(root == null){
            return ; 
        }
        inorder(root.left , in);
        in.add(root.val); 
        inorder(root.right , in);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        inorder(root, inOrder);
        return inOrder;
    }
}
}

// iterative approach :- 


class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root; 
        while(true){
            if(node != null){
                st.push(node);
                node = node.left; 
            }
            else{
                if(st.isEmpty()) break ; 
                node = st.pop();
                ans.add(node.val);
                node = node.right; 
            }
        }
        return ans; 
    }
}
// leetcode 94 