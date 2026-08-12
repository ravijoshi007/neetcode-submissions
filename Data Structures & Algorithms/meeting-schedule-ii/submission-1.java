/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        int answer = 0;
        Collections.sort(intervals, (a,b) -> Integer.compare(a.start,b.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i<intervals.size(); i++){
            Interval interval = intervals.get(i);
            if(!minHeap.isEmpty() && minHeap.peek() <= interval.start){
                minHeap.poll();
            }else{
                answer++;
            }
            minHeap.offer(interval.end);
        }

        return answer;


    }
}
