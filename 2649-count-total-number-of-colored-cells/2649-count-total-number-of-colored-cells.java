class Solution {
    public long coloredCells(int n) {
        long first = 2*n-1;
        long sum=first;
        for(int i=n-1;i>=1;i--){
            sum+=(2*((2*i)-1));
        }
        return sum;
    }
}