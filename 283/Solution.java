class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1||nums.length==0){
            return;
        }
        int savePos=0;
        
        for(int num:nums){
            if(num !=0)    
                nums[savePos++]=num;
        }
        while(savePos<nums.length){
            nums[savePos++]=0;
        }
    }
}
