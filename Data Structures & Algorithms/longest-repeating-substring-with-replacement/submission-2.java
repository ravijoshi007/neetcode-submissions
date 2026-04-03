class Solution {
    public int characterReplacement(String s, int k) {
        

        Map<Character, Integer> freMap = new HashMap();
        int maxFre = 0;
        int left = 0;
        int res = 0;
        for(int right =0; right <= s.length()-1; right++){

            freMap.put(s.charAt(right), freMap.getOrDefault(s.charAt(right),0)+1);
            maxFre = Math.max(maxFre, freMap.get(s.charAt(right)));

            while((right-left+1) - maxFre > k){
                freMap.put(s.charAt(left), freMap.get(s.charAt(left))-1);
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
