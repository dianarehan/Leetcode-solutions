class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxArea=0;

        for(int i =0; i<height.length;i++){
            maxArea =Math.max(maxArea,getArea(height,left,right));
            if(height[left]>height[right]) right--; else left++;
        }
        return maxArea;
    }
    private int getArea(int [] height, int left, int right){
        return Math.min(height[left],height[right])*(right-left);
    }
        
    
}
