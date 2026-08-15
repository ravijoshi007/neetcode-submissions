class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push(i);
            }else if(s.charAt(i) == '*'){
                star.push(i);
            }else{
                if(stack.isEmpty() && star.isEmpty()){
                    return false;
                }
                else if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    star.pop();
                }
            }
        }
    while(!stack.isEmpty() && !star.isEmpty()){
        if(stack.pop() > star.pop()){
            return false;
        }
    }
    return stack.isEmpty();
    
    }
}
