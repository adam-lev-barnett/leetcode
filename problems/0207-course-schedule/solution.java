class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<HashSet<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new HashSet<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; i++) {
            boolean res = DFS(new boolean[numCourses], new boolean[numCourses], adj, i);
            if (!res) return false;
        }
        return true;
    }

    private boolean DFS(boolean[] onStack, boolean[] visited, ArrayList<HashSet<Integer>> adj, int v) {
        if (onStack[v]) return false;
        visited[v] = true;
        onStack[v] = true;
        for (int vAdj : adj.get(v)) {
            if (onStack[vAdj]) return false;
            if (!visited[vAdj]) {
                if(!DFS(onStack, visited, adj, vAdj)) return false;
            }
        }
        onStack[v] = false;
        return true;
    }
}
