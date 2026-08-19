
import collections
from typing import List

class Solution:
    def maxNumberOfFamilies(self, n: int, reservedSeats: List[List[int]]) -> int:
        row_seats=collections.defaultdict(set)
        for row,seat in reservedSeats:
            row_seats[row].add(seat)

        total_groups=n*2

        for row,reserved in row_seats.items():
            left_available = not any(seat in reserved for seat in (2, 3, 4, 5))
            right_available = not any(seat in reserved for seat in (6, 7, 8, 9))
            middle_available = not any(seat in reserved for seat in (4, 5, 6, 7))

            # If both left and right blocks are available, we keep both groups (no change)
            if left_available and right_available:
                continue

            # If we can't fit 2 groups, check if we can fit exactly 1 group
            # (either in the left, right, or middle block)
            elif left_available or right_available or middle_available:
                total_groups -= 1

            # If no blocks are available, we lose both potential groups for this row
            else:
                total_groups -= 2

        return total_groups
        