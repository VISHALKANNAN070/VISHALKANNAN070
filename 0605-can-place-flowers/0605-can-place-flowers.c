bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {
    int count=0;
        for(int i=0;i<flowerbedSize&&n>0;i++){
         if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbedSize-1||flowerbed[i+1]==0)){
            count++;
            flowerbed[i]=1;
            n--;
         } 
        }
        if(n<=0)
        return true;
        else
        return false;
    }
