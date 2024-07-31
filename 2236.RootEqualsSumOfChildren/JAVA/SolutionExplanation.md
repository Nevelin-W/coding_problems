# Binary Tree Node Sum Checker

This document explains the Java implementation for a solution to check if the value of a root node in a binary tree is equal to the sum of its left and right child nodes.

## TreeNode Class

The `TreeNode` class is a standard definition for a node in a binary tree. It has three fields:
- `int val` - the value of the node.
- `TreeNode left` - the left child node.
- `TreeNode right` - the right child node.

The class has three constructors:
1. A no-argument constructor that initializes a node without any value.
    ```java
    TreeNode() {}
    ```
2. A constructor that initializes a node with a given value and no children.
    ```java
    TreeNode(int val) { this.val = val; }
    ```
3. A constructor that initializes a node with a given value and specified left and right children.
    ```java
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    ```

## Solution Class

The `Solution` class contains the method `checkTree(TreeNode root)`:
- This method checks if the value of the root node is equal to the sum of the values of its left and right child nodes.
- If `root.val` equals `root.left.val + root.right.val`, it returns `true`; otherwise, it returns `false`.

### Method Implementation
```java
class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}
