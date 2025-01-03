import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PostOrderTraversal {
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
    public void postorder(TreeNode root, List<Integer> post){
        if(root == null){
            return ; 
        }
        postorder(root.left , post);
        postorder(root.right , post);
        post.add(root.val); 
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        postorder(root, postOrder);
        return postOrder;
    }
}
}

// leetcode 145 

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
    public void postorder(TreeNode root, List<Integer> post){
        if(root == null){
            return ; 
        }
        postorder(root.left , post);
        postorder(root.right , post);
        post.add(root.val); 
    }
    public List<Integer> postorderTraversal(TreeNode root) {

        // iterative approach 1 :- 

        // List<Integer> ans = new ArrayList<>();
        // Stack<TreeNode> st = new Stack<>();
        // if(root == null){
        //     return ans ;
        // }
        // st.add(root);
        // while(!st.isEmpty()){
        //     TreeNode currNode = st.pop();
        //     ans.add(currNode.val);
        //     if(currNode.left != null){
        //         st.push(currNode.left); 
        //     }
        //     if(currNode.right != null){
        //         st.push(currNode.right);
        //     }
        // }
        // Collections.reverse(ans);
        // return ans ;

        // iterative approach 2 :- 
        
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root ;
        Stack<TreeNode> st = new Stack<>(); 

        while(curr != null || !st.isEmpty()){
            if(curr != null){
                st.push(curr);
                curr = curr.left; 
            }
            else{
                TreeNode temp = st.peek().right ;
                if(temp == null){
                    temp = st.pop();
                    ans.add(temp.val); 
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.pop();
                        ans.add(temp.val);
                    }
                } 
                else{
                    curr = temp; 
                }
            }
        }
        return ans ; 
    }
}