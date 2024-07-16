class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i =0;
        int j =0;
        while(i!=word1.length()&&j!=word2.length()){
            res+=word1.charAt(i++);
            res+=word2.charAt(j++);
            }

        if(i==word1.length()&&j!=word2.length())
            res+=word2.substring(j,word2.length());
        else 
            if(j==word2.length()&&i!=word1.length())
                res+=word1.substring(i,word1.length());
        return res;
    }
}
