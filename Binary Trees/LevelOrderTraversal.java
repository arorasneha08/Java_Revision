import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;
        
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int levelSize = q.size();
                List<Integer> currentLevel = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currNode = q.poll();
                    currentLevel.add(currNode.val);
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
                result.add(currentLevel);
            }
            return result;
        }
    }
}

// leetcode 102 