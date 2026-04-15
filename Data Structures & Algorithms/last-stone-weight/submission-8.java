class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for(int i=0; i<stones.length; i++){
            maxHeap.offer(stones[i]);
        }

        while(maxHeap.size() > 1){

            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if(first == second){
                continue;
            }else {
                int newInt = first-second;
                maxHeap.offer(newInt);
            }

        }
        return maxHeap.size() != 0 ? maxHeap.poll() : 0;

    }
}
