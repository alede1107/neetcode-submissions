# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q:
            return True
        if not p or not q:
            return False
        
        a = deque([p])
        b = deque([q])


        
        while a and b:
            for i in range(len(a)):
                node1 = a.popleft()
                node2 = b.popleft()
                
                if node1 is None and node2 is None:
                    continue

                if node1 is None or node2 is None or node1.val != node2.val:
                    return False
                
                a.append(node1.left)
                a.append(node1.right)
                b.append(node2.left)
                b.append(node2.right)
        
        return True
            
            




