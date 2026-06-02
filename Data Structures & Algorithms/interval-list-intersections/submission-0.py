class Solution:
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        result = []

        i, j = 0, 0

        while i < len(firstList) and j < len(secondList):
            start1, end1 = firstList[i]
            start2, end2 = secondList[j]

            overlapStart = max(start1, start2)
            overlapEnd = min(end1, end2)

            if overlapEnd >= overlapStart:
                result.append([overlapStart, overlapEnd])
            
            if end1 < end2:
                i+=1
            else:
                j +=1
        return result