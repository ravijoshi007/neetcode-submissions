class Solution {
    public int maxArea(int[] heights) {

        int maxWater = Integer.MIN_VALUE;


        int left = 0;
        int right = heights.length-1;

        while(left<right){

            int currentWater = Math.min(heights[left], heights[right])* (right-left);
            maxWater = Math.max(currentWater, maxWater);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxWater;
        
    }
}
