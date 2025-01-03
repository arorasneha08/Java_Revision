import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
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
    public void preorder(TreeNode root , List<Integer> pre){
        if(root == null){
            return ; 
        }
        pre.add(root.val);
        preorder(root.left, pre);
        preorder(root.right, pre); 
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>(); 
        preorder(root , ans); 
        return ans ; 
    }
}
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>(); 
        if(root == null) return ans;
        Stack<TreeNode> st = new Stack<>(); 
        st.push(root);
        while(!st.isEmpty()){
            TreeNode currNode = st.pop();
            ans.add(currNode.val);
            if(currNode.right != null){
                st.push(currNode.right);
            }
            if(currNode.left != null){
                st.push(currNode.left); 
            }
        }
        return ans; 
    }
}


// leetcode 144 