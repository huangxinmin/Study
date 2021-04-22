public class study_17 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int pre = 0, maxANS = nums[0];
            for (int x : nums) {
                pre = Math.max(pre + x, x);
                maxANS = Math.max(maxANS, pre);
            }
            return maxANS;
        }
    }
}
