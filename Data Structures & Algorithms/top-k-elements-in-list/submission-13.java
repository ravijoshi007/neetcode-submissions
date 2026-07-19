class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap= new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            myMap.put(nums[i], myMap.getOrDefault(nums[i],0)+1);
        }

        minHeap.addAll(myMap.entrySet());

        while(minHeap.size() > k){
            minHeap.poll();
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i]= minHeap.poll().getKey();
        }
        

        return result;

        
    }
}
