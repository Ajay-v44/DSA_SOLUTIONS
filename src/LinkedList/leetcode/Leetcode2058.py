
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        if not head or not head.next or not head.next.next:
            return [-1,-1]

        prev_node=head
        curr_node=head.next

        first_cp=-1
        prev_cp=-1
        min_dist=float('inf')

        idx=1
        while curr_node.next:
            next_node=curr_node.next
            is_local_max=curr_node.val>prev_node.val and curr_node.val>next_node.val
            is_local_min=curr_node.val<prev_node.val and curr_node.val<next_node.val

            if is_local_max or is_local_min:
                if first_cp==-1:
                    first_cp=idx
                else:
                    min_dist=min(min_dist,idx-prev_cp)
                prev_cp=idx
            prev_node=curr_node
            curr_node=next_node
            idx+=1
        if first_cp==prev_cp:
            return [-1,-1]
        return [min_dist,prev_cp-first_cp]
