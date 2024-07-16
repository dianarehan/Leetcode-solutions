import java.util.HashMap;
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        HashMap <Integer, Integer> diana = new HashMap<>();
         for (int i = 0; i < difficulty.length; i++) {
            if (!diana.containsKey(difficulty[i]) || diana.get(difficulty[i]) < profit[i]) {
                diana.put(difficulty[i], profit[i]);
            }
        }
        Arrays.sort(difficulty);
        Arrays.sort(worker);
        int i =0;
        int j =0;
        int maxSoFar=0;
        int res=0;
        while(i!=worker.length){
            while(j < difficulty.length && worker[i] >= difficulty[j]){
                int curr= diana.get(difficulty[j++]);
                if(maxSoFar<=curr)
                    maxSoFar=curr;
               
            }

        //j=0;
        res+=maxSoFar;
        i++;
        }
    return res;
    }
}
