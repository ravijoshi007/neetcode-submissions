class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for(int i= 0; i< tasks.length; i++){
            freq[tasks[i] - 'A']++;
        }

        int maxF = Arrays.stream(freq).max().getAsInt();

        int maxCount = 0;

        for(int i=0; i< freq.length; i++){
            if(freq[i] == maxF){
                maxCount++;
            }
        }

        return Math.max(tasks.length, (maxF - 1) * (n+1) + maxCount);

        
    }
}
