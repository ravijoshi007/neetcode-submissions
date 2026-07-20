class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length()-1;

        while(left<right){
            
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
           

            while(left < right && !isCharOrNumber(leftChar)){
                left++;
                leftChar = s.charAt(left);
            }
            while(left< right && !isCharOrNumber(rightChar)){
                right--;
                rightChar = s.charAt(right);
            }
            System.out.println(leftChar+ " "+rightChar);
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            left++;
            right--;

        }

        return true;
        
    }


    private boolean isCharOrNumber(char c){
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
