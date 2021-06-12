import java.util.Arrays;

public class study_60 {
    class Solution {
        public int thirdMax(int[] nums) {
            //升序排列
            Arrays.sort(nums);
            int res = 0;
            //倒序遍历
            for (int i = nums.length - 1;i > 0;i--) {
                //如果相邻的两个元素不相等 指针+1
                if (nums[i] != nums[i - 1]) {
                    res++;
                }
                //找到第三大的数
                if (res == 2) {
                    return nums[i - 1];
                }
            }
            return nums[nums.length - 1];
        }
    }
}
