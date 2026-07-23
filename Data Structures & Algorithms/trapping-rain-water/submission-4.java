class Solution {
    public int trap(int[] height) {

        int response = 0;

        int left = 0;
        int right = height.length - 1;

        int leftMax = height[0];
        int rightMax = height[height.length-1];

        while(left<right){

            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                response += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                response += rightMax - height[right];
            }
            
        }
        return response;
        
    }
}
