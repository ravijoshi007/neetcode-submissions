class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        
        for(int i = 0; i< temperatures.length; i++){

            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]){

                int index = stack.pop()[1];
                result[index] = i-index; 
            }
            stack.push(new int[]{temp, i});
        }

        return result;
        
    }
}
