# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = res = ListNode()

        num1, num2 = 0, 0
        x10 = 1

        while l1:
            num1 += l1.val * x10
            x10 *= 10
            l1 = l1.next

        x10 = 1

        while l2:
            num2 += l2.val * x10
            x10 *= 10
            l2 = l2.next
        
        resInt = num1 + num2

        # resInt = 975
        # result = [5, 7, 9]

        resStr = str(resInt)

        # "975"

        i = len(resStr) - 1

        while i >= 0:
            res.next = ListNode(int(resStr[i]))
            res = res.next
            i -= 1
        return dummy.next
