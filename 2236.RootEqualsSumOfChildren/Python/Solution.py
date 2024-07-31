# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def checkTree(self, root):
        return root.val == root.left.val + root.right.val

# Helper function to create a tree from a list
def create_tree_from_list(lst):
    if not lst:
        return None
    root = TreeNode(lst[0])
    if len(lst) > 1:
        root.left = TreeNode(lst[1])
    if len(lst) > 2:
        root.right = TreeNode(lst[2])
    return root

# Test cases
test_cases = [
    [10, 4, 6],
    [5, 3, 1],
]

# Testing the solution
for i, tree_list in enumerate(test_cases):
    root = create_tree_from_list(tree_list)
    sol = Solution()
    result = sol.checkTree(root)
    print(f"Test case {i+1}: {'true' if result else 'false'}")
