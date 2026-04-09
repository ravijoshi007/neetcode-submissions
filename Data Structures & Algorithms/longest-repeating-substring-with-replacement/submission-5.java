class Solution {
    public int characterReplacement(String s, int k) {


        int left = 0;
        int maxLength = 0;

        int response = 0;
        Map<Character, Integer> countMap = new HashMap<>();
        for(int right=0; right<s.length(); right++){
            countMap.put(s.charAt(right), countMap.getOrDefault(s.charAt(right), 0) +1);
           maxLength = Math.max(maxLength, countMap.get(s.charAt(right)));

           while((right-left+1) - maxLength > k){
            countMap.put(s.charAt(left), countMap.get(s.charAt(left)) -1);
            left++;
           }
             
            response = Math.max(response, right-left+1);
        } 

        return response;     
    }
}
