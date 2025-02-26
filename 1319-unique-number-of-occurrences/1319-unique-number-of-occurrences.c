bool uniqueOccurrences(int* arr, int arrSize) {
    int result[1000], k = 0;
    for (int i = 0; i < arrSize; i++) {
        if (arr[i] != 1001) {
            int count = 1;
            for (int j = i + 1; j < arrSize; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 1001;
                    count++;
                }
            }
            result[k++] = count;
        }
    }
    for (int i = 0; i < k - 1; i++) {
        for (int j = i + 1; j < k; j++) {
            if (result[i] == result[j]) {
                return false;
            }
        }
    }
    return true;
}