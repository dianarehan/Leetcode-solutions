class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        String word ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }
            else if(s.charAt(i)==' '){
                if(word!=""){
                    arr.add(word);
                }
                word="";
            }
            if(i==s.length()-1&&word!="")
                arr.add(word);
            
        }
        System.out.print(arr.size());
        String res [] = arr.toArray(new String[arr.size()]);
        String result ="";
        for(int i=0;i<res.length;i++){
            result = " "+res[i]+result ;
        }
        return result.substring(1,result.length());
    }
    
}
