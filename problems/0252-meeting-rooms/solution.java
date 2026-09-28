class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Comparator comp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                int res = Integer.compare(a[1], b[1]);
                if (res != 0) return res;
                return Integer.compare(a[0], b[0]);
            }
        };

        Arrays.sort(intervals, comp);

        int start = 0;
        
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) return false;
        }
        System.out.println(Arrays.deepToString(intervals));
        return true;
    }
}
