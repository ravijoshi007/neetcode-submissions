class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Arrays.stream(piles).max().getAsInt();

        int result = Integer.MAX_VALUE;

        int left = 1;
        int right = max;

        while(left <= right){

            int mid = left + (right - left)/2;
             //System.out.println(possibleHours[mid]);

            int currentMin = 0;
            for(int i = 0; i< piles.length; i++){
                //System.out.println((int)Math.ceil((double)piles[i]/possibleHours[mid]));
                currentMin += (int)Math.ceil((double)piles[i]/mid);
            }

            if(currentMin <= h){
                right = mid-1;
                result = Math.min(result, mid);
                //System.out.println("inside "+result);
            }else{
                //System.out.println("inside");

                left = mid+1;
            }
        }

        return result;
        
    }
}
