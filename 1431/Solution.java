class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> res = new ArrayList<>();
            int max = getMax(candies);
            for(int i =0;i<candies.length;i++){
                if(candies[i]+extraCandies>= max)
                    res.add(i,true);
                else res.add(i,false);
            }

           return res;
    }
    private int getMax(int [] candies){
        int maxCandies=-1;
        for(int i=0;i<candies.length;i++){
            maxCandies= (maxCandies<candies[i])? candies[i]: maxCandies;
        }
        return maxCandies;
    }
}
