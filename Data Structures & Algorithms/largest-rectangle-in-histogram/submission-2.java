class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i= 0; i<= heights.length; i++){

            while(!stack.isEmpty() && (i ==heights.length ||
            heights[stack.peek()] >= heights[i])){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i-stack.peek() - 1;

                result = Math.max(result, height*width);
            }
            stack.push(i);
        }

    return result;
}
}
