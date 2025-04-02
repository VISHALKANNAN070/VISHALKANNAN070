long long maximumTripletValue(int* nums, int numsSize) {
    long long max = 0;
    for (int i = 0; i < numsSize - 2; i++) {
        for (int j = i+1; j < numsSize - 1; j++) {
            long long part1=nums[i]-nums[j];
            for (int k = j+1; k < numsSize; k++) {
                long long sum=part1*nums[k];
                if (sum > max) {
                    max = sum;
                }
            }
        }
    }
    return max;
}