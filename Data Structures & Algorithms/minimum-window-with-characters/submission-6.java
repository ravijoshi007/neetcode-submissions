class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty()){
            return "";
        }

        int have = 0;

        int [] result = {-1, -1};
        int minLength = Integer.MAX_VALUE;

        Map<Character, Integer> needCount = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(int i=0; i< t.length(); i++){
            needCount.put(t.charAt(i), needCount.getOrDefault(t.charAt(i), 0)+1);
        }

        int need = needCount.size();
        int left = 0;
        for(int right=0; right<s.length(); right++){
            char in = s.charAt(right);
            window.put(in, window.getOrDefault(in, 0)+1);
            if(needCount.containsKey(in)
                && needCount.get(in).equals(window.get(in)))
            {
                have++;
            }

            while(need == have){
                if( right-left+1 < minLength){
                    minLength = right-left+1;
                    result[0]=left;
                    result[1]=right;
                }

            char leftChar = s.charAt(left);
            window.put(leftChar, window.get(leftChar)-1);

            if(needCount.containsKey(leftChar) && window.get(leftChar)
            < needCount.get(leftChar)){
                have--;
            }
            left++;
        
            }

        }
    return minLength == Integer.MAX_VALUE ? "" : 
        s.substring(result[0], result[1] + 1);
        
    }
}
