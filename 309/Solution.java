import java.util.HashMap;
class Tuple{
    int i;
    boolean isBuying;

    Tuple(int i, boolean isBuying){
        this.i=i;
        this.isBuying=isBuying;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return i == tuple.i && isBuying == tuple.isBuying;
    }
    @Override
    public int hashCode() {
        return 31 * i + (isBuying ? 1 : 0);
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1) return 0;
        HashMap<Tuple,Integer> hashMap = new HashMap<>();
        return dfs(prices,hashMap, 0,true);
    }

    private int dfs(int [] prices, HashMap<Tuple,Integer> hashMap, int i,boolean isBuying){
        if(i>=prices.length) return 0;
        Tuple key = new Tuple(i, isBuying);
        if(hashMap.containsKey(key)) return hashMap.get(key);

        int reward =0;
        if(isBuying){
            int buy = dfs(prices, hashMap, i+1,false)-prices[i];
            int wait = dfs(prices,hashMap,i+1,true);
            reward = Math.max(buy,wait);
        }
        else{
            int sell =dfs(prices, hashMap, i+2,true)+prices[i];
            int wait = dfs(prices,hashMap,i+1,false);
            reward= Math.max(sell,wait);
        }
        hashMap.put(key, reward);
        return reward;
    }
}
