import java.util.*;
public class PreInPostOrderTraversal {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    };
    
    public class Solution {
        public static class Pair{
            TreeNode node ;
            int state ;
            Pair(TreeNode node , int state){
                this.node = node;
                this.state = state ;
            }
        }
        public static List<List<Integer>> getTreeTraversal(TreeNode root) {
            List<Integer> preOrder = new ArrayList<>();
            List<Integer> inOrder = new ArrayList<>();
            List<Integer> postOrder = new ArrayList<>();
            Stack<Pair> st = new Stack<>(); 
            st.push(new Pair(root, 1)); 
    
            if (root == null) {
                return Arrays.asList(inOrder, preOrder, postOrder);
            }
    
            while(!st.isEmpty()){
                Pair top = st.peek();  
                if(top.state == 1){
                    preOrder.add(top.node.data);
                    top.state++; 
                    if(top.node.left != null){
                        st.push(new Pair(top.node.left, 1));
                    }
                }
                else if(top.state == 2){
                    inOrder.add(top.node.data);
                    top.state ++ ; 
                    if(top.node.right != null){
                        st.push(new Pair(top.node.right, 1));
                    }
                }
                else{
                    postOrder.add(top.node.data);
                    st.pop(); 
                }
            }
            return Arrays.asList(inOrder, preOrder, postOrder);
        }
    }
}

// code 360 , striver 