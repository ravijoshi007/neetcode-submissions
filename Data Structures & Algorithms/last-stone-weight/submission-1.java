class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<=stones.length-1; i++){
            minHeap.offer(stones[i]);
        }
        
        while(minHeap.size() > 1){
            int first = minHeap.poll();
            int second = minHeap.poll();

            if(first > second) {
                minHeap.add(first-second);
            }
        }
        minHeap.add(0);

        return minHeap.peek();
    }
}
