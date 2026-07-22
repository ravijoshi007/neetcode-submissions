class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (seen.contains(third)) {
                    result.add(Arrays.asList(nums[i], third, nums[j]));

                    // Skip duplicate second elements
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    }
                }

                seen.add(nums[j]);
            }
        }

        return result;
    }
}