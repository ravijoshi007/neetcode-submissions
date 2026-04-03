class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] zeroIndexes = new int[nums.length];
        int totalProduct = 1; 
        int totalZeroCount = 0;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] !=0){
                totalProduct *= nums[i];
            }else{
                zeroIndexes[i] = 1;
                totalZeroCount++;
            }
        }
        int[] finalResult = new int[nums.length];

        if(totalZeroCount > 1){
            return finalResult;
        }

        for(int i=0; i<=nums.length-1; i++){
            if(totalZeroCount >0 && zeroIndexes[i] == 1){
                finalResult[i] = totalProduct;
            }else if(totalZeroCount == 0){
                finalResult[i] = totalProduct/nums[i];
            }else{
                finalResult[i] = 0;
            }

        }
        return finalResult;
    }
}  
