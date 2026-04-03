class Solution {
    public boolean isValid(String s) {

        Stack<Character> bucket = new Stack();

        if(s.length() % 2 != 0){
            return false;
        }
        
        for(int i=0; i<=s.length()-1; i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                bucket.push(getElementToAdd(s.charAt(i)));
            }else{
               if(bucket.isEmpty()){
                return false;
               }
               if(bucket.pop() != s.charAt(i)){
                   return false;
               }
            }

        }

        if(!bucket.isEmpty()){
                return false;
        }
        return true;
        
    }

    Character getElementToAdd(Character c){

        switch(c){
                    case '(': return ')';
                    case '{': return '}';
                    default: return ']';
                }
}

}
