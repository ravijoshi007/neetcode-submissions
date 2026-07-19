class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zeroCount = 0;
        int product = 1;
        for(int i = 0; i< nums.length; i++){

            if(nums[i]==0){
                zeroCount++;
            }else{
                product *= nums[i];
            }
            if(zeroCount > 1){
                return new int[nums.length];
            }
        }

        int[] result = new int[nums.length];

        for(int i = 0; i< nums.length; i++){

            if(nums[i] == 0){
                result[i] = product;
            }else if (zeroCount == 1){
                result[i] = 0;
            }else{
                result[i] = product/nums[i];
            }
        }

        return result;
        
    }
}  
