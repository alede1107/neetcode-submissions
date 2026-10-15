class Solution:
    def numBusesToDestination(self, routes: List[List[int]], source: int, target: int) -> int:
        if source == target:
            return 0

        stop_to_routes = defaultdict(list)

        for idx, route in enumerate(routes):
            for stop in route:
                stop_to_routes[stop].append(idx)
        
        q = deque([(source, 0)])
        visited_stops = {source}
        visited_routes = set()

        while q:
            stop, buses = q.popleft()
            
            for route in stop_to_routes[stop]:
                if route in visited_routes:
                    continue
                
                visited_routes.add(route)
                
                for new_stop in routes[route]:
                    if new_stop == target:
                        return buses + 1
                    
                    if new_stop not in visited_stops:
                        visited_stops.add(new_stop)
                        q.append((new_stop, buses+1))
        return -1