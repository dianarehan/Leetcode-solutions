class Solution {
    public String removeStars(String s) {
        //String res ="";
        StringBuilder str = new StringBuilder();
        Stack<Character> mid = new Stack<>();
        for(int i =0; i<s.length();i++){
            char c =s.charAt(i);
            if(c!='*')
                mid.push(c);
            else 
                mid.pop();
        }
        while(!mid.isEmpty()){
            str.append(mid.pop());
        }
    return str.reverse().toString();
    }
}
