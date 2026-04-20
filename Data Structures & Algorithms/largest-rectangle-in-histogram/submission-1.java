class Solution {
    public int largestRectangleArea(int[] heights) {


        Stack<Integer> stack = new Stack<>();
        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<= heights.length; i++){

            while(!stack.isEmpty() && 
            
            (i== heights.length || heights[stack.peek()] >= heights[i])){
                int index = stack.pop();
                int pop = heights[index];
                int area = pop * (stack.isEmpty() ? i : (i-stack.peek()-1));
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }


        return maxArea;
        
    }
}
