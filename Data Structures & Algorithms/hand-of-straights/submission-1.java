class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        int length = hand.length;
        if(length % groupSize != 0){
            return false;
        }

        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i< hand.length; i++){
            count.put(hand[i], count.getOrDefault(hand[i], 0)+1);
        }

        Arrays.sort(hand);

        for(int num: hand){


            if(count.get(num) == 0){
                continue;
            }

            for(int next = num; next< num+ groupSize; next++){
                if(count.getOrDefault(next, 0) == 0){
                    return false;
                }
                count.put(next, count.get(next)-1);
            }
        }

    return true;
    }
}
