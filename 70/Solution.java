class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        return dfs(dp,n,0);
    }

    private int dfs(HashMap<Integer, Integer> dp,int n,int step){
        if(step==n) return 1;
        if(step>n) return 0;
        if(dp.containsKey(step))
            return dp.get(step);
        int twoStep= dfs(dp,n,step+2);
        int oneStep=dfs(dp,n,step+1);
        dp.put(step,twoStep+oneStep);
        return dp.get(step);
    }
}
