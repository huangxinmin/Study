import java.util.Arrays;

public class study_79 {
    class Solution {
        public int distributeCandies (int[] candies) {
            Arrays.sort(candies);
            int count = 1;
            //平分糖果，分到最少种类的情况
            for (int i = 1; i < candies.length; i++) {
                if (candies[i] > candies[i - 1])
                count++;
            }
            return Math.min(count,candies.length / 2);
        }
    }
}
