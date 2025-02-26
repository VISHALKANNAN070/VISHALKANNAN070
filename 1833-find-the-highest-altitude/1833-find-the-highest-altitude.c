int largestAltitude(int* gain, int gainSize) {
    int result=0;
    int max=0;
    for(int i=0;i<gainSize;i++){
        result+=gain[i];
        if(result>max)
        max=result;
    }
    return max;
}