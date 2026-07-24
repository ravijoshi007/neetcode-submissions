class Solution {
    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack();

        for(int i = 0; i< tokens.length; i++){

            if(tokens[i].equals("+"))
            {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                int numberToBePushed = first + second;
                stack.push(String.valueOf(numberToBePushed));
            }
            else if(tokens[i].equals("-"))
            {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                int numberToBePushed = second - first;
                stack.push(String.valueOf(numberToBePushed));
            }
            else if(tokens[i].equals("*"))
            {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                int numberToBePushed = first * second;
                stack.push(String.valueOf(numberToBePushed));
            }
            else if(tokens[i].equals("/"))
            {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                int numberToBePushed = second / first;
                stack.push(String.valueOf(numberToBePushed));
            }else{
                System.out.println(tokens[i]);
                stack.push(tokens[i]);
            }
            
        }
        return Integer.parseInt(stack.pop());
        
    }
}
