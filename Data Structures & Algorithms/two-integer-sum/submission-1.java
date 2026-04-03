class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numbers = new HashMap();

        for(int i=0; i<nums.length;i++){
            int numberToFind = target-nums[i];
            if(numbers.containsKey(target-nums[i])){
                return new int[]{numbers.get(target-nums[i]), i};
            }
        numbers.put(nums[i], i);
        }
    return new int[]{};
        
    }
}
