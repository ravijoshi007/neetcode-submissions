class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int size;

    public KthLargest(int k, int[] nums) {
        size = k;
        minHeap = new PriorityQueue<>();

        for(int i = 0; i< nums.length; i++){
            minHeap.offer(nums[i]);
        }

        while(minHeap.size() > k){
            minHeap.poll();
        }

        minHeap.peek();
        
    }
    
    public int add(int val) {

        minHeap.offer(val);

        if(minHeap.size() > size){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
