class Solution {
    public int twoCitySchedCost(int[][] costs) {

        

        int res = 0;

        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b) {
                return (a[0] - a[1]) - (b[0] - b[1]);
            }
        });

        for (int i = 0; i < costs.length / 2; i++) {
            res += (costs[i][0] + costs[i + costs.length / 2][1]);
        }
        System.out.println(Arrays.deepToString(costs));
        return res;
    }
}
