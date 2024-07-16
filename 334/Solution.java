class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small= Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        small=nums[0];
        for(int i=1;i<nums.length;i++){
            int currNum = nums[i];
            if(small>currNum){
                small=currNum;
            }
            else if(small<currNum && mid>currNum){
                mid=currNum;
            }
            else if(currNum>mid)
                return true;
        }
        return false;
    }
}
