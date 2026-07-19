class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap= new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            myMap.put(nums[i], myMap.getOrDefault(nums[i],0)+1);
        }

        maxHeap.addAll(myMap.entrySet());

        while(maxHeap.size() > k){
            maxHeap.poll();
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i]= maxHeap.poll().getKey();
        }
        

        return result;

        
    }
}
