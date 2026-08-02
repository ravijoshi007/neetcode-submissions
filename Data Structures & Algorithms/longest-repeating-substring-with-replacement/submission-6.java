class Solution {
    public int characterReplacement(String s, int k) {


        int left = 0;
        int result = 0;
        int maxF = 0;

        Map<Character, Integer> count = new HashMap<>();

        for(int i=0; i< s.length(); i++){

            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) +1);
            maxF = Math.max(maxF, count.get(s.charAt(i)));

            while((i-left+1)-maxF > k){
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }

        result = Math.max(result, i-left+1);

        }

        
        
    return result;
    }
}
