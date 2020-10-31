# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root:
            children = (root.left, root.right)
            max_depth = max(map(self.maxDepth, children))
            return 1 + max_depth
        else:
            return 0
