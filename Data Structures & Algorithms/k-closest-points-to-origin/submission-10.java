class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue(
            Comparator.comparing((int[] a) -> a[1]).reversed()
        );

        for(int i = 0; i< points.length; i++){
            
            int distance = (points[i][0]* points[i][0])
            + (points[i][1]* points[i][1]);
            minHeap.offer(new int[]{i, distance});
            if(minHeap.size() > k){
            minHeap.poll();
        }
        }

        int [][] result = new int[k][2];
        int i = 0;
        while(!minHeap.isEmpty()){
            int[] dataPoint = minHeap.poll();
            int index = (int) dataPoint[0];
            
            result[i++] = points[index];
        }
        return result;

    }
}
