class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int i=0; i<stones.length; i++){
            minHeap.offer(stones[i]);
        }

        while(minHeap.size() >= 2){

            int first = minHeap.poll();
            int second = minHeap.poll();
            if(first == second){
                continue;
            }else {
                int newInt = first-second;
                minHeap.offer(newInt);
            }

        }
        return minHeap.size() != 0 ? minHeap.poll() : 0;

    }
}
