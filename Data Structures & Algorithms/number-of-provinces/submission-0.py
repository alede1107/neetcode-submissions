class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        visited = set()

        def dfs(city):
            visited.add(city)

            for neighbor in range(len(isConnected)):
                if isConnected[city][neighbor] == 1 and neighbor not in visited:
                    dfs(neighbor)

        provinces = 0

        for city in range(len(isConnected)):
            if city not in visited:
                provinces += 1
                dfs(city)
        return provinces