import java.util.HashSet;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] res = new int[2];
        HashSet<Integer> myMap= new HashSet<>();

        for(int i =0;i<nums.length;i++){
            if(!myMap.add(nums[i])){
                res[0]=nums[i];
            }  
        }
        
        for(int i =1;i<=nums.length;i++){
            if(!myMap.contains(i)){
                res[1]=i;
                break;
            }
        
        }
        return res;
    }
}
