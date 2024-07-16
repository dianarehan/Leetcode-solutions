class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter =0;
        int marker =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                counter++;
            }
            if(counter>0){
                marker++;
            }
            if(marker>counter && counter!=3){
                counter=0;
                marker=0;
            }
            if(counter==3)
                return true;
        }
       return false; 
    }
}
