class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> charIndices = new ArrayList<Integer>();
        int result [] = new int [s.length()];
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==c){
                charIndices.add(i);
            }
        }
        int[] charIndicesArr = charIndices.stream().mapToInt(i -> i).toArray();
        //Integer [] charIndicesArr = charIndices.toArray();
        for(int i = 0; i<s.length();i++){
            
            int minSoFar= Math.abs(i-charIndicesArr[0]);
            for(int j=1;j<charIndicesArr.length;j++){
                if(Math.abs(i-charIndicesArr[j])<minSoFar)
                    minSoFar = Math.abs(i-charIndicesArr[j]);
            }
            result[i]= minSoFar;
        }

return result;
    }
}
