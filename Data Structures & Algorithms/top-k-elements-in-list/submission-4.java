
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freMap= new HashMap();
        for(int num: nums){

            freMap.put(num, freMap.getOrDefault(num, 0)+1);
            
        }
        List<Integer>[] result = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry: freMap.entrySet()){
                int frequency = entry.getValue();
                if (result[frequency] == null) {
                    result[frequency] = new ArrayList<>();
                }
                result[frequency].add(entry.getKey());
        }

        int[] finalResult = new int[k];
        int j=0;
        for(int i=result.length -1; i>=0; i--){
            if(result[i]!=null){
                for (int val : result[i]) {
                    finalResult[j++]=val;
                    if(j == k) return finalResult;
                }
            }
        }
     return finalResult;
    
    }
}
