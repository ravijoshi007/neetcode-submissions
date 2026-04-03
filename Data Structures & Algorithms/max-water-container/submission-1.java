public class Solution {
    public int maxArea(int[] heights) {

     int left = 0;
     int right = heights.length -1;
     int maxWater = 0;

    while(left < right){
        maxWater = Math.max(maxWater, (right-left) * Math.min(heights[right], heights[left]));
        
        if(heights[left] < heights[right]){
            left++;
        }else{
            right--;
        }
    }
     return maxWater;  

    }    
}