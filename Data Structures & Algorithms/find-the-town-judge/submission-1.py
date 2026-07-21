class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        '''
        [
            [1, 3],
            [1, 4],
            [2, 3],
            [2, 4],
            [4, 3]
        ]
        '''
        trustees = {}

        for i in range(len(trust)):
            if trust[i][1] not in trustees:
                trustees[trust[i][1]] = set()
            trustees[trust[i][1]].add(trust[i][0])
        '''
        {
            3: [1, 2, 4]
        }
        '''
        compare = set()
        for j in range(len(trust)):
            compare.add(trust[j][0])
        
        for key in trustees:
            if trustees[key] == compare:
                if key not in compare:
                    return key
        return -1
