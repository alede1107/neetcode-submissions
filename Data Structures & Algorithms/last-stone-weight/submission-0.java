class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones){
            queue.offer(num);
        }
        while (queue.size()>1){
            int curr = queue.poll()-queue.poll();
            if (curr>0){
                queue.offer(curr);
            }
        }
        if (queue.size()==1){
            return queue.poll();
        }
        else return 0;
    }
}
