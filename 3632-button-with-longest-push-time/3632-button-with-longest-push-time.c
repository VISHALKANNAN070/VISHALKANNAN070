int buttonWithLongestTime(int** events, int eventsSize, int* eventsColSize) {
    int max = events[0][1]; 
    int result = events[0][0];  

    for (int i = 1; i < eventsSize; i++) {
        int time = events[i][1] - events[i - 1][1]; 
        
        if (time > max || (time == max && events[i][0] < result)) {
            max = time;
            result = events[i][0]; 
        }
    }

    return result;
}
