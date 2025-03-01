/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* applyOperations(int* nums, int numsSize, int* returnSize) {
    *returnSize=numsSize;
    for(int i=1;i<numsSize;i++){
        if(nums[i-1]==nums[i]){
            nums[i-1]*=2;
            nums[i]=0;
    }
}
int nonzero=0;
for(int i=0;i<numsSize;i++){
    if(nums[i]!=0){
        int temp=nums[i];
        nums[i]=nums[nonzero];
        nums[nonzero]=temp;
        nonzero++;
    }
}
    return nums;
}