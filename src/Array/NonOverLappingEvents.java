package Array;

public class NonOverLappingEvents {
    public int maxTwoEvents(int[][] events) {
        int maxValue = 0;
        int n = events.length;
        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, events[i][2]);
        }
        for (int i = 0; i < n; i++) {
            int start = events[i][0];
            int end = events[i][1];
            int value = events[i][2];
            for (int j = i + 1; j < n; j++) {
                int start1 = events[j][0];
                int end1 = events[j][1];
                int value1 = events[j][2];
                if (end < start1 || end1 < start) {
                    maxValue = Math.max(maxValue, value1 + value);
                }
            }
        }
        return maxValue;
    }

    static void main() {
        NonOverLappingEvents ob = new NonOverLappingEvents();
        int[][] events = {{1,2,1},{3,4,1},{5,6,3},{7,8,4}};
        System.out.println(ob.maxTwoEvents(events));
    }
}
