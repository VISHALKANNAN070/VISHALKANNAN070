class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len = nums.length;
        int[] result = new int[len];
        int pivotindex=0;
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] < pivot) {
                small.add(nums[i]);
            }
            if (nums[i] > pivot) {
                big.add(nums[i]);
            }
            if(pivot==nums[i])
                ans.add(nums[i]);
        }
        int index=0;
        for(int i:small){
                result[index++]=i;
            }
            for(int i: ans)
            result[index++]=i;
        for(int i:big){
                result[index++]=i;
            }

return result;
    }
}