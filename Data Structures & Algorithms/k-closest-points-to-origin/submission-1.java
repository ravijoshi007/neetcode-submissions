class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0]-b[0]);

        for(int i = 0; i <= points.length-1; i++){
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            minHeap.add(new int[]{distance, points[i][0], points[i][1]});

        }

        int[][] result = new int[k][2]; 
        for(int i=0; i<k; i++){
            int[] point = minHeap.poll();
            result[i] = new int[]{point[1], point[2]};
        }

        return result;
        

    }
}
