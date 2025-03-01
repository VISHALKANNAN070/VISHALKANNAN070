class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max1 = -1000000, min1 = 1000000;
        int max2 = -1000000, min2 = 1000000;
        int max3 = -1000000, min3 = 1000000;
        int max4 = -1000000, min4 = 1000000;
    int len=arr1.length;
        for (int i = 0; i < len; i++) {
            int v1 = arr1[i] + arr2[i] + i;
            int v2 = arr1[i] - arr2[i] + i;
            int v3 = arr1[i] + arr2[i] - i;
            int v4 = arr1[i] - arr2[i] - i;

            if (v1 > max1)
                max1 = v1;
            if (v1 < min1)
                min1 = v1;
            if (v2 > max2)
                max2 = v2;
            if (v2 < min2)
                min2 = v2;
            if (v3 > max3)
                max3 = v3;
            if (v3 < min3)
                min3 = v3;
            if (v4 > max4)
                max4 = v4;
            if (v4 < min4)
                min4 = v4;
        }
        int ans1 = max1 - min1;
        int ans2 = max2 - min2;
        int ans3 = max3 - min3;
        int ans4 = max4 - min4;
        return Math.max(Math.max(ans1, ans2), Math.max(ans3, ans4));
    }
}
