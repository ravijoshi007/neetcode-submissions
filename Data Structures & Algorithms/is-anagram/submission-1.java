class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] first = new int[26];

        for(int i=0; i<s.length(); i++){
            first[s.charAt(i) - 'a']++;
            first[t.charAt(i) - 'a']--;
        }

        for(int i=0; i< first.length; i++){
            if(first[i] !=0){
                return false;
            }
        }
    return true;
    }
}
