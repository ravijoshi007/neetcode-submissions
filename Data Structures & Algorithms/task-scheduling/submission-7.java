class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        for(int i=0; i< tasks.length; i++){
            count[tasks[i] - 'A']++;
        }

        int maxFre = Arrays.stream(count).max().getAsInt();

        int totalMaxFre = 0;

        for(int i=0; i <count.length; i++){
            if(count[i] == maxFre){
                totalMaxFre++;
            }
        }

        int minCpuCycle = (maxFre - 1) * (n+1) + totalMaxFre;
        return Math.max(minCpuCycle, tasks.length);
        
    }
}
