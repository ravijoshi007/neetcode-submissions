class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for(int i=0; i<= tasks.length-1;i++){
            freq[tasks[i] - 'A']++;
        }

        int maxFre = Arrays.stream(freq).max().getAsInt();

        int maxCount = 0;

        for(int i: freq){
            if(i == maxFre){
                maxCount++;
            }
        }
        int result = (maxFre - 1) * ( n+1) + maxCount;

        return Math.max(tasks.length, result);

        
    }
}
