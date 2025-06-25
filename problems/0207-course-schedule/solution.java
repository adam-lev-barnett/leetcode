class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        boolean[] onStack = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!DFS(i, adj, onStack, visited)) return false;
        }
        return true;
    }

    private boolean DFS(int n, ArrayList<ArrayList<Integer>> adj, boolean[] onStack, boolean[] visited) {
        if (onStack[n]) return false;
        visited[n] = true;
        onStack[n] = true;
        for (int neigh : adj.get(n)) {
            if (onStack[neigh]) return false;
            if (!visited[neigh]) {
                if (!DFS(neigh, adj, onStack, visited)) return false;
            }
        }
        onStack[n] = false;
        return true;
    }
}
