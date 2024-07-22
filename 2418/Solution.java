import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        HashMap<Integer,String> myMap=new HashMap<>();
        int length = heights.length-1;
        for(int i =0;i<=length;i++){
            myQueue.add(heights[i]);
            myMap.put(heights[i],names[i]);
        }
        
        String[] res = new String[length+1];
        int i=length;
        while(!myQueue.isEmpty()){
            res[i]= myMap.get(myQueue.remove());
            i--;
        }
        return res;
    }
}
