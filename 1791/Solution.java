class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> degrees = new HashMap<>();
        for(int [] edge: edges){
            int u = edge[0];
            int v = edge[1];
            degrees.put(u,degrees.getOrDefault(u,0)+1);
            degrees.put(v,degrees.getOrDefault(v,0)+1);
        }
        int n = degrees.size();
        for (int node : degrees.keySet()) {
            if (degrees.get(node) == n-1) {
                return node;
            }
        }

        return -1;
    }
}
