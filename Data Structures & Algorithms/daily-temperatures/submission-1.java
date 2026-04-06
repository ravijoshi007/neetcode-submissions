class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

     int length = temperatures.length;
     Stack<int[]> stack = new Stack<>();
     int[] result = new int[length];
    
     for(int i=0; i<temperatures.length; i++){
        int temperature = temperatures[i];
        while(!stack.isEmpty() && temperature > stack.peek()[0] ){
            int[] pop = stack.pop();
            int number = i - pop[1];
            result[pop[1]]=number;
        }
        stack.push(new int[]{temperature, i});
     }
     return result;   
    }  
}
