class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length;
        int[] arr=new int[(len*len)+1];
        for(int[] row:grid){
            for(int col:row){
                arr[col]++;
            }
        }
        int arr0=0,arr1=0;
        for(int i=0;i<=len*len;i++){
            if(arr[i]==2){
                arr0=i;
            }
            if(arr[i]==0){
                arr1=i;
            }
        }
        return new int[] {arr0,arr1};
    }
}