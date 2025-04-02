class Solution {
    public int buttonWithLongestTime(int[][] events) {
            int max = events[0][1]; 
    int result = events[0][0];  
    int len=events.length;

    for (int i = 1; i < len; i++) {
        int time = events[i][1] - events[i - 1][1]; 
        
        if (time > max || (time == max && events[i][0] < result)) {
            max = time;
            result = events[i][0]; 
        }
    }

    return result;
    }
}