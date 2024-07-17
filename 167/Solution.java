class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //HashSet<Integer> i was going to use hashset approach however we know that they are sorted and he said Your solution must use only constant extra space
        int res[]=new int[2];
        int left = 0;
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                res[0]=left+1;
                res[1]=right+1;
                return res;
            }
            if(numbers[left]+numbers[right]<target) left++;
            if(numbers[left]+numbers[right]>target) right--;
        }
        return res;
    }
}
