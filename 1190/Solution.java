import java.util.Stack;
class Solution {
    public String reverseParentheses(String s) {
         Stack<String> stack = new Stack<>();
         String res ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=')') stack.push(c+"");
            else{
                while(!stack.isEmpty() &&!stack.peek().equals("(")){
                  res = stack.pop() + res;

                    
                }
                stack.pop();
                stack.push(new StringBuilder(res).reverse().toString());
                res="";
            }
        }
        res="";
        while(!stack.isEmpty()){
            res = stack.pop() + res;
        }
        return res;
    }
}
