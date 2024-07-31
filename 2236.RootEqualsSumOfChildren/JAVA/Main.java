package JAVA;
// Definition for a binary tree node.
class TreeNode {
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
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}

public class Main {
    public static void main(String[] args) {
        // Test case 1: [10, 4, 6]
        TreeNode root1 = new TreeNode(10, new TreeNode(4), new TreeNode(6));
        System.out.println(new Solution().checkTree(root1)); // Should print true

        // Test case 2: [5, 3, 1]
        TreeNode root2 = new TreeNode(5, new TreeNode(3), new TreeNode(1));
        System.out.println(new Solution().checkTree(root2)); // Should print false
    }
}
