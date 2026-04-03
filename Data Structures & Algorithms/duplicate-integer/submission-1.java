class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> nonDuplicates = new HashSet();

        for(int i = 0; i<=nums.length -1 ; i++){
            if(nonDuplicates.contains(nums[i])){
                return true;
            }
            nonDuplicates.add(nums[i]);
        }
        return false;
    }
}