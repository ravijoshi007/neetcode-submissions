class Solution {
    public boolean canJump(int[] nums) {

        int maxLength = 0;
        
        for(int i=0; i<= nums.length-1; i++){

            if(i>maxLength){
                return false;
            }

            int current = i+nums[i];
            maxLength = Math.max(current, maxLength);

            if(maxLength >= nums.length-1){
                return true;
            }
        }
    return false;
        
    }
}
