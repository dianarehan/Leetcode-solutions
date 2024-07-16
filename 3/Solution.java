import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> seen = new HashMap<>();
        
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLen = 0;
        int start = 0;
        
        for (int i =0;i<s.length();i++){
            char x = s.charAt(i);
            if (seen.containsKey(x)) {
                start = Math.max(start, seen.get(x) + 1);
            }
            
            seen.put(x, i);
            maxLen = Math.max(maxLen, i - start + 1); 
            
        }
       return maxLen;
    }
}
