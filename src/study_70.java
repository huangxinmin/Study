public class study_70 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            if (k > nums.length || nums.length == 0) {
                return 0;
            }
            double maxsum = 0;
            double sum = 0;
            //滑动窗口第一个窗口的和
            for (int i = 0; i < k; ++i) {
                sum += nums[i];
            }
            maxsum = sum;
            //求出最大和
            for (int j = k; j < nums.length; ++j) {
                sum = sum + nums[j] - nums[j-k];
                maxsum = Math.max(maxsum,sum);
            }
            return maxsum / k;
        }
    }
}
