public class study_8 {
    class Solution {
        public int maxProfit(int[] arr) {
            if (arr == null || arr.length <= 1)
                return 0;
            int ans =0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i-1]) {
                    ans += (arr[i] - arr[i-1]);
                }
            }
            return ans;
        }
    }
}
