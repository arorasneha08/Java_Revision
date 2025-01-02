public class SumOfBT {
    class Node{
    int data;
    Node left, right;

    Node(int item){
        data = item;
        left = right = null;
    }
}
    class Solution {
    static int sumBT(Node root) {
        if(root == null){
            return 0; 
        }
        int left = sumBT(root.left);
        int right = sumBT(root.right);
        return root.data + left + right ; 
    }
}
}

// sum of all elem of binary tree 