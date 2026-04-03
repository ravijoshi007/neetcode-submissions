class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int length = temperatures.length;
        int[] result = new int[length];
        Stack<Integer> stack  = new Stack<>();
        Arrays.fill(result, 0);


        for(int i = 0; i< length; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int pop = stack.pop();
                result[pop] = i - pop;
            }
            stack.push(i);
        }

        return result;
        
    }
}
