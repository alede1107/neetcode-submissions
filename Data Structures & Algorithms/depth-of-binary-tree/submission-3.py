# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        stack = []

        if root:
            stack.append((1, root))
        
        depth = 0

        while stack:
            current_depth, root = stack.pop()
            if root:
                if root.left:
                    stack.append((current_depth + 1, root.left))
                if root.right:
                    stack.append((current_depth + 1, root.right))
            depth = max(depth, current_depth)
        return depth