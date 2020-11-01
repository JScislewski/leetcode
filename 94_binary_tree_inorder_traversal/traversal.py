# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        result = []
        self.traversalHelper(root, result)
        return result

    def traversalHelper(self, root, result):
        if root:
            self.traversalHelper(root.left, result)
            result.append(root.val)
            self.traversalHelper(root.right, result)
