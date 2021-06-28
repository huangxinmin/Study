import java.util.Arrays;

public class study_69 {
     class Solution {
        public int[] findErrorNums(int[] nums) {
            Arrays.sort(nums);
            int dup = 0, missing = 1;
            for (int i = 1; i < nums.length; i++) {
                //排序后重复的数字会连续出现
                if (nums[i] == nums[i - 1])
                    dup = nums[i];
                else if (nums[i] > nums[i - 1] + 1)
                    missing = nums[i - 1] + 1;
            }
            //当数组长度为2且由重复的数字时丢失的数字等于重复的数字
            //在返回的数组中添加一个布尔表达式判断数组长度
            return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
        }
    }
}
