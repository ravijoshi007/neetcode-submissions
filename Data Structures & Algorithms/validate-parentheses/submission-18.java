class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                System.out.println("inside");
                stack.push(getChar(s.charAt(i)));
                System.out.println(stack.size());
            }else{
                 System.out.println("inside 2");
                if(!stack.isEmpty()){
                    char popped = stack.pop();
                System.out.println(popped + " "+s.charAt(i));
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
