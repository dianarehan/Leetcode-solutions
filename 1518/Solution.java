class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res= numBottles;
        int mid = numBottles;
        while(mid>0){
            mid-=numExchange;
            mid++;
            res++;
        }

        res--;
        return res;
    }
}
