//same solution with optimized space complexity
class Solution {
    public int maxArea(int[] heights) {
        /*
            what is the question asking?
            
            what should constitute the bars that form a container?
            why can't 1 be a container in the first example?

            how does the output = 36?
            all of the numbers added up only = 35

            the bars at the end represent 1 bar total

            multiply that by the height to get the result
            how do we know a bar is sufficient to be used as a bar?
            if we chose 1, the area would've been 7

            and if we stopped at the second 7, the answer would've been 24

            Required:
            bars (end, stop)
            bars that are optimized for maximum output (area)

            maybe checking?
                - we start at each bar
                - we multiply the length (-1) by the largest num in array
                - doesn't work, what if the last bar doesn't stop at the end?

            two pointer technique
                - we start at the ends
                - keep moving forwards
                - how will we know a good bar from a bad one?
                - store an array for each output value
                - could we make them go simultaneously?
                - too complex
                - 


        */
        int output = 0;
        int length = heights.length-1;
        
        int l = 0, r = length;
        
        // we need the max height
        // correction: we need the max bar
        int res = 0;
        while (l<r){
            int bar = 0;
            if (heights[l] < heights[r]) bar = heights[l];
            else bar = heights[r];
            output = bar * length;
            
            
            // tricky part
            // how do we know if we're at a valid end?
            if (heights[l] < heights[r]){
                l++;
            }
            else r--;
            length--;
            if (output > res) res = output;
        }
        
        return res;

    }
}
