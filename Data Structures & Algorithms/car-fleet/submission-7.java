class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] merged = new int[position.length][2];

        for(int i=0; i< position.length; i++){
            merged[i][0] = position[i];
            merged[i][1] = speed[i];
        }

        Arrays.sort(merged, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int i=0; i< merged.length; i++){
            stack.push((double)(target - merged[i][0])/merged[i][1]);

            while(stack.size() >= 2 && stack.peek() <= stack.get(stack.size()-2))
            {
                stack.pop();
            }
        }

        return stack.size();
        
    }
}
