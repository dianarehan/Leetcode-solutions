import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String countOfAtoms(String formula) {
        Deque<HashMap<String,Integer>> stack = new ArrayDeque<>();
        stack.push(new HashMap<>());
        int i =0;
        int n = formula.length();
        while(i<n){
            //we either hit a new bracket so we create a new hashmap to distribute the number in the end to all the instances inside this bracket 
            if(formula.charAt(i)=='('){
                i++;
              stack.push(new HashMap<>());  
            } 
            //if we hit a closing bracket  we merge with the outer stack element
            else if(formula.charAt(i)==')'){
                i++;
                int start = i;
                while(i<n&&Character.isDigit(formula.charAt(i))) i++;
                int value = start<i? Integer.parseInt(formula.substring(start,i)):1;
                HashMap<String,Integer> temp = stack.pop();
                for(String key:temp.keySet()){
                    stack.peek().put(key,stack.peek().getOrDefault(key,0)+temp.get(key)*value);
                }
            }
            //or we collecting the element name itself and its occureneces
            else{
                int start = i;
                i++;
                while(i<n&&Character.isLowerCase(formula.charAt(i))) i++;
                String chemElem = formula.substring(start,i);
                start=i;
                while(i<n&&Character.isDigit(formula.charAt(i))) i++;
                int value = i>start? Integer.parseInt(formula.substring(start,i)):1;
                stack.peek().put(chemElem,stack.peek().getOrDefault(chemElem,0)+value);
            }
        }

        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> res = stack.pop();
        ArrayList<String> list = new ArrayList<>(res.keySet());
        Collections.sort(list);
        for(String s: list){
            sb.append(s);
            int finalVal = res.get(s);
            if(finalVal>1) sb.append(finalVal);
        }
        return sb.toString();
    }

    }
