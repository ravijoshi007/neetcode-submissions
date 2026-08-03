class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> count = new HashMap<>();

        for(int i = 0; i<t.length(); i++){
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0)+1);
        }

        int left = 0;
        
        int[][] result = new int[1][2];
        int length = Integer.MAX_VALUE;
        int need = t.length();

        for (int right = 0; right < s.length(); right++) {

    char c = s.charAt(right);

    if (count.containsKey(c)) {
        if (count.get(c) > 0)
            need--;

        count.put(c, count.get(c) - 1);
    }

    while (need == 0) {

        // Update answer BEFORE shrinking
        if (right - left + 1 < length) {
            length = right - left + 1;
            result[0][0] = left;
            result[0][1] = right;
        }

        char leftChar = s.charAt(left);

        if (count.containsKey(leftChar)) {
            count.put(leftChar, count.get(leftChar) + 1);

            if (count.get(leftChar) > 0)
                need++;
        }

        left++;
    }


}
    if (length == Integer.MAX_VALUE)
    return "";

return s.substring(result[0][0], result[0][1] + 1);
    }
}



        
        
    

