class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(getChar(s.charAt(i)));
            }else{
                if(!stack.isEmpty()){
                char popped = stack.pop();
                if(popped != s.charAt(i)){
                    return false;
                }
                }else{
                    return false;
                }
                
            }
        }
        return stack.isEmpty() ? true: false;
        
    }


    char getChar(char c){
        switch(c){
            case '(':{
                return ')'; 
            }
            case '{':{
                return '}'; 
            }
            default:
                return ']'; 
        }
    }
}
