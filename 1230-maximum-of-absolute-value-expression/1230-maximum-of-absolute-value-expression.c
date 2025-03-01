#include <stdio.h>
#include <stdlib.h>

int maxAbsValExpr(int* arr1, int arr1Size, int* arr2, int arr2Size) {
    int max1 = -1000000, min1 = 1000000;
    int max2 = -1000000, min2 = 1000000;
    int max3 = -1000000, min3 = 1000000;
    int max4 = -1000000, min4 = 1000000;

    for (int i = 0; i < arr1Size; i++) {
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

    return (ans1 > ans2 ? (ans1 > ans3 ? (ans1 > ans4 ? ans1 : ans4)
                                       : (ans3 > ans4 ? ans3 : ans4))
                        : (ans2 > ans3 ? (ans2 > ans4 ? ans2 : ans4)
                                       : (ans3 > ans4 ? ans3 : ans4)));
}
