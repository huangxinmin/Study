public class study_50 {
    class Solution {
        public int findLengthOfLCIS(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int maxlen = 1;
            int count = 1;
            int prenum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > prenum) {
                    // 连续递增时
                    count++;
                } else {
                    if (maxlen < count) {
                        // 记录新的最大值
                        maxlen = count;
                    }
                    // 重新计数
                    count = 1;
                }
                prenum = nums[i];
            }
            if (maxlen < count) {
                // 比较最大值
                maxlen = count;
            }
            return maxlen;
        }
    }
}
