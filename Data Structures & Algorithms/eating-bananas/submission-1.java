class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        //Arrays.sort(piles);
        int left = 0;
        int right = Arrays.stream(piles).max().getAsInt();
        int response = Integer.MAX_VALUE;

        while(left<=right){

            int mid = left+(right-left)/2;
            int totalTime = 0;

            for(int p: piles){
                totalTime += Math.ceil((double) p/mid);
            } 

            System.out.println(totalTime);

            if(totalTime <= h){
                response = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return response;
        
    }
}
