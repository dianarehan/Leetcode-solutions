class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> dp = new HashMap<>();
        return dfs(nums,0,0,dp,target);
    }
    
    private int dfs(int []nums,int index, int total,HashMap<String, Integer>dp, int target){
        if(index==nums.length)
            return (total==target)?  1: 0;
        String key = index+" "+total;
        if(dp.containsKey(key))
            return dp.get(key);
        
        int add = dfs(nums, index + 1, total + nums[index], dp, target);
        int subtract = dfs(nums, index + 1, total - nums[index], dp, target);

        dp.put(key,add+subtract);
        return dp.get(key);
    }
}
