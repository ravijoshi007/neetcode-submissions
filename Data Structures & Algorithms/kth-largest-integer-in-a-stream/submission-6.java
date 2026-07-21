class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int maxSize;

    public KthLargest(int k, int[] nums) {
        
        this.maxSize = k;
        for(int i=0; i< nums.length; i++){
            this.minHeap.offer(nums[i]);
        }

        while(this.minHeap.size() > k){
            this.minHeap.poll();
        }
    }
    
    public int add(int val) {
        
        this.minHeap.offer(val);
        while(this.minHeap.size() > this.maxSize){
            this.minHeap.poll();
        }

        return this.minHeap.peek();
    }
}
