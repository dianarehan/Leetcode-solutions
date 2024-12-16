import java.util.PriorityQueue;

class Solution {
    class Pair implements Comparable<Pair> {
        int value;
        int index;

    public Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Pair other) {
        //if both values are equal we have to keep index in mind
        if (this.value == other.value) 
                return this.index - other.index;
            return this.value - other.value;
    }
}
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq = fill(nums);
        while(k-->0){
            Pair myPair = pq.poll();
            myPair.value *=multiplier;
            pq.add(myPair);
        }
        return translate(pq);
    }

    private PriorityQueue<Pair> fill(int[]a){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i =0;i<a.length;i++){
            pq.add(new Pair(a[i],i));
        }
        return pq;
    }

    private int[] translate(PriorityQueue<Pair> pq){
        int a[] = new int[pq.size()];
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int index = p.index;
            a[index]=p.value;
        }
        return a;
    }
}
