class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if not intervals:
            return []
        if len(intervals) == 1:
            return [intervals[0]]
        intervals.sort()
        ret = []
        count = 0

        for i in range(len(intervals)):
            if not ret:
                ret.append(intervals[i])
            else:
                start = intervals[i][0]
                end = intervals[i][1]

                if start <= ret[count][1]:
                    if end > ret[count][1]:
                        ret[count][1] = end
                else:
                    ret.append([start, end])
                    count +=1
        return ret