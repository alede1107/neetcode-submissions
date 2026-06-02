class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if not intervals and not newInterval:
            return[]
        elif not intervals:
            return [newInterval]
        
        intervals.append(newInterval)
        intervals.sort()

        ret = [intervals[0]]

        for i in range(1, len(intervals)):
            start = intervals[i][0]
            end = intervals[i][1]

            if start <= ret[-1][1]:
                if end > ret[-1][1]:
                    ret[-1] = [ret[-1][0], end]
            else:
                ret.append([start, end])
        return ret