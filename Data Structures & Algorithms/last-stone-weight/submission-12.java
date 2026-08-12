class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(
            (a,b) -> b-a
        );

    for(int i = 0; i< stones.length; i++){
        queue.offer(stones[i]);
    }

    while(queue.size() > 1){
        int first = queue.poll();
        int second  = queue.poll();

        if(first != second){
            queue.offer(first-second);
        }
    }

    return queue.size() == 1 ? queue.poll(): 0;
        
    }
}
