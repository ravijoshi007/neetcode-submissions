class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            int[] current = matrix[mid];

            if(current[0] <= target && current[current.length-1] >= target){
                return findNumber(current, target);
            }else if(current[0] > target){
                System.out.println("inside " + current[0] + " "+ target);
                right = mid - 1;
            }else{
                System.out.println("inside2 " + current[0] + " "+ target);
                left = mid + 1;
            }
        }
        return false;
        
    }

    private boolean findNumber(int[] numbers, int target){

        int left = 0;
        int right = numbers.length - 1;
        

        System.out.println("inside");

        while(left <= right){
            int mid = left + (right - left)/2;
            if(numbers[mid] == target){
            return true;
            }else if(numbers[mid] < target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }    
    return false;
    }
}
