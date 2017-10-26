package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle on 2017/4/12.
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();

        for (Interval interval : intervals) {
            if (newInterval == null || interval.end < newInterval.start) {
                result.add(interval);
            } else if (interval.start > newInterval.end) {
                result.add(newInterval);
                result.add(interval);
                newInterval = null;
            } else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }
        if (newInterval != null) {
            result.add(newInterval);
        }
        return result;
    }

    @Test
    public void test() {
        List<Interval> intervals = new ArrayList<>();
        Interval a = new Interval(1, 2);
        Interval b = new Interval(3, 5);
        Interval c = new Interval(6, 7);
        Interval d = new Interval(8, 10);
        Interval e = new Interval(12, 16);

        intervals.add(a);
        intervals.add(b);
        intervals.add(c);
        intervals.add(d);
        intervals.add(e);

        List<Interval> merge = insert(intervals, new Interval(4,9));
        System.out.println();
    }

    class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
