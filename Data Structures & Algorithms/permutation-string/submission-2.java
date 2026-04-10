class Solution {
    public boolean checkInclusion(String s1, String s2) {


        Map<Character, Integer> countMap = new HashMap<>();
        int count = s1.length();

        for(int i=0; i<s1.length(); i++){
            countMap.put(s1.charAt(i), countMap.getOrDefault(s1.charAt(i), 0)+1);
        }

        int left = 0;

        for(int right=0; right<s2.length(); right++){
            Character key = s2.charAt(right);
            if(countMap.containsKey(key)){
                if(countMap.get(key) > 0){
                     count--;
                }
                countMap.put(key, countMap.get(key)-1);
            }

            if(right-left+1> s1.length()){
                Character key1 = s2.charAt(left);
                if(countMap.containsKey(key1)){
                    if(countMap.get(key1) >= 0){
                     count++;
                }
                    countMap.put(key1, countMap.get(key1)+1);

                }
            left++;
            }
        if(count ==0){
            return true;
        }
    }
    return false;
    }
}
