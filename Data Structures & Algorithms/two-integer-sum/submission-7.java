class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sum = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int number = target - nums[i];
            if(sum.containsKey(number)){
                return new int[]{sum.get(number), i};
            }
            sum.put(nums[i], i);
        }
    return new int[]{};
    }
}
