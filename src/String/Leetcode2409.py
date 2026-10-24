class Solution:
    def countDaysTogether(self, arriveAlice: str, leaveAlice: str, arriveBob: str, leaveBob: str) -> int:
        days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

        def date_to_day(date: str) -> int:
            month, day = map(int, date.split("-"))
            return sum(days_in_month[:month - 1]) + day

        alice_start = date_to_day(arriveAlice)
        alice_end = date_to_day(leaveAlice)
        bob_start = date_to_day(arriveBob)
        bob_end = date_to_day(leaveBob)

        start_overlap = max(alice_start, bob_start)
        end_overlap = min(alice_end, bob_end)

        return max(0, end_overlap - start_overlap + 1)