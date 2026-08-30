class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        findSubsets(nums, 0, subset, result);
        return result;
        
    }

    private void findSubsets(int[] nums, int i,
    List<Integer> subset, List<List<Integer>> result){

        if( i >= nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        findSubsets(nums, i+1, subset, result);
        subset.remove(subset.size() - 1);
        findSubsets(nums, i+1, subset, result);
    }
}
