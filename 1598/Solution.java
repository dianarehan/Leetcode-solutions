class Solution {
    public int minOperations(String[] logs) {
        Stack<String> folders = new Stack<String>();
        folders.push("main");
        for(int i = 0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(!(folders.peek().equals("main"))){
                    folders.pop();
                }
                }
                else if((!logs[i].equals("./"))&&logs[i].contains("/")){
                    folders.push(logs[i]);
                }
                
            
        }
        return folders.size()-1;
    }
}
