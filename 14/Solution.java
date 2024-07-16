class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        int index=-1;
        String out="";
        
        boolean yesSoFar=true;
        for(int i =0;i<strs.length;i++){
            if(minLength>strs[i].length()){
                minLength =strs[i].length();
                index =i;
            }    
        }
        if(minLength==0){
            return out;
        }
        for(int i=0;i<minLength;i++){
            char checkWith = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(checkWith != strs[j].charAt(i))
                    yesSoFar=false;
            }
            if(!yesSoFar)
                return out;
            out+=checkWith;
        }
        return out;
    }
}
