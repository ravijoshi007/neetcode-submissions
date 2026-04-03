class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int[] targetMatrix = new int[]{};

        for(int i=0; i<matrix.length; i++){

            int[] currentMatrix = matrix[i];
             //System.out.println(currentMatrix[currentMatrix.length-1] <= target);
            if(currentMatrix[currentMatrix.length-1] >= target){
                targetMatrix = currentMatrix;
                break;
            }
        }

        int left = 0;
        int right = targetMatrix.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(targetMatrix[mid] == target){
                return true;
            }else if(targetMatrix[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return false;
        
    }
}
