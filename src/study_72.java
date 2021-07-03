import java.util.Arrays;

public class study_72 {
    class Solution {
        public int maximumProduct(int[] nums) {
            // 先从小到大排序
            Arrays.sort(nums);
            // 都是正数
            if (nums[0] > 0) {
                return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
            }
            // 都是负数
            if (nums[nums.length - 1] < 0) {
                return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
            }
            // 正负数混合
            if (nums[1] > 0) {
                // 只有一个负数
                return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
            } else {
                // 两个及以上负数
                return nums[nums.length - 1] * Math.max(nums[nums.length - 2] * nums[nums.length - 3],
                        nums[0] * nums[1]);
            }
        }
    }
}
