class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Set<Integer> numbers = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            numbers.add(nums[i]);
        }

        int maxCount = 1;
        int currentCount = 1;
        for(int i=0; i< nums.length; i++){
            // only check for sequence start
            if(!numbers.contains(nums[i]-1)){
            while(numbers.contains(nums[i]+currentCount)){
                currentCount++;
            }
            maxCount = Math.max(currentCount, maxCount);
            currentCount = 1;
        }
        }

    return maxCount;
        
    }
}
