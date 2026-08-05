class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            Comparator.comparingInt((int[] a) -> a[0]).reversed());

        int[] result = new int[nums.length-k+1];
        int left = 0;
        int index = 0;
        for(int right = 0; right < nums.length; right++){

            maxHeap.add(new int[]{nums[right], right});

            if(right-left+1 > k-1){
                while(maxHeap.peek()[1] <= right - k){
                    maxHeap.poll();
                    left++;
                }
                result[index++] = maxHeap.peek()[0];
            }
        }
        
        return result;
        
    }
}
