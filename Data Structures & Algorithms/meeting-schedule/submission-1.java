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
    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));
        int lastEnd = -1;

        for(int i = 0; i< intervals.size(); i++){
            Interval interval = intervals.get(i);
            if(lastEnd > interval.start){
                return false;
            }
            lastEnd = interval.end;
        }
        return true;

    }
}
