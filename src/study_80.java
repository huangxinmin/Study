public class study_80 {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            for(int i = 0; i < flowerbed.length; i++) {
                if(n <= 0) {
                    return true;
                }
                //只有i==0时可以种花
                if(flowerbed[i] == 1) {
                    continue;
                }
                // 当不是第一盆花时如果上一个格子已经种过花了，则当前这格不能种花
                if(i > 0 && flowerbed[i - 1] == 1) {
                    continue;
                }
                //当真最后一盆花时如果下一个格子已经种过花了，则当前这格不能种花
                if(i < flowerbed.length - 1 && flowerbed[i + 1] == 1) {
                    continue;
                }
                //种花并记录
                flowerbed[i] = 1;
                n--;
            }
            return n <= 0;
        }
    }
}
