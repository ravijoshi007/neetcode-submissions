class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int length = s1.length();
        Map<Character, Integer> freMap = new HashMap<>();
        for(int i = 0; i<length; i++){
            freMap.put(s1.charAt(i), freMap.getOrDefault(s1.charAt(i), 0)+1);
        }   
        int windowStart = 0;
        int need = s1.length();
        int windowSize = s1.length();
        for(int i = 0; i<s2.length(); i++){
                char in = s2.charAt(i);
                if(freMap.containsKey(in)){
                    if(freMap.get(in) > 0){
                        need--;
                    }
                    freMap.put(in, freMap.get(in)-1);
                }
            if(i-windowStart+1 > length){

                char out = s2.charAt(windowStart++);
                if(freMap.containsKey(out)){
                    if(freMap.get(out) >= 0){
                        need++;
                    }
                    freMap.put(out, freMap.getOrDefault(out, 0)+1);  
                    
                }
            }
        if(need==0){
            return true;
        }
                    
        }
        return false;
    }
}
