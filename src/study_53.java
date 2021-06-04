public class study_53 {
    class Solution {
        public boolean checkPossibility(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                //数组中超过一个地方呈递减数列则数组不成立
                if (nums[i] > nums[i + 1]) {
                    count++;
                    if (count > 1) {
                        return false;
                    }
                    //保证数组成立需要确保i-1<i<=i+1
                    if (i > 0 && nums[i + 1] < nums[i - 1]) {
                        nums[i + 1] = nums[i];
                    }
                }
            }
            return true;
        }
    }
}

