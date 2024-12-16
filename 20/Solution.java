import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<String> d = new Stack<>();
        for(int i=0;i<s.length();i++){
            char x =s.charAt(i);
            if(isOpenParen(x)){
                d.push(x+"");
            }
            else{
                if(x=='}'){
                    if(d.isEmpty()) return false;
                    if(d.peek().equals("{")){
                        d.pop();
                    }else return false;
                }else if(x==']'){
                    if(d.isEmpty()) return false;
                    if(d.peek().equals("[")){
                        d.pop();
                    }else return false;
                }else if(x==')'){
                    if(d.isEmpty()) return false;
                    if(d.peek().equals("(")){
                        d.pop();
                    }else return false;
                }
            }
        }
        if(d.isEmpty()) return true;
        return false;
    }

    private boolean isOpenParen(char x){
        return (x=='('||x=='{'||x=='[')? true:false;
    }
}
