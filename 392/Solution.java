class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex=0;
        int tIndex=0;
        if(s.length()==0)   
            return true;
        while(tIndex<t.length()){
            if(t.charAt(tIndex)==s.charAt(sIndex)){
                sIndex++;
                if(sIndex==s.length())
                    return true;
            }
            tIndex++;
        }
        return false;
    }
}
