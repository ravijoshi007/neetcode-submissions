class Solution {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            countMap.put(s1.charAt(i), countMap.getOrDefault(s1.charAt(i), 0)+1);
        }

        int count = s1.length();
        int left = 0;

        for(int right = 0; right < s2.length(); right++){

            if(countMap.containsKey(s2.charAt(right))){
                if(countMap.get(s2.charAt(right)) > 0){
count--;
                }
                
                countMap.put(s2.charAt(right), countMap.get(s2.charAt(right))-1);
            }

            while(right-left+1 > s1.length()){

                char leftChar = s2.charAt(left);

                if(countMap.containsKey(leftChar)){
                    countMap.put(leftChar, countMap.get(leftChar) + 1);
                    if(countMap.get(leftChar) > 0){
                    count++;
                }
                }
    left++;
            }

        if(count == 0){
            return true;
        }
    }
    return false;
        
    }
}
