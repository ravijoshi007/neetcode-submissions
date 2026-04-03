class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<=nums.length-1; i++){
            minHeap.add(nums[i]);

            if(minHeap.size() > k){
                int num = minHeap.peek();
                if(minHeap.peek() <= nums[i]){
                    minHeap.remove(num); 
                    //minHeap.add(nums[i]);
                }
            }
        }

        return minHeap.peek();
        
    }
}
