public class study_44 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            //记录连续1的个数
            int maxCount = 0;
            //双指针
            int left = 0, right = 0;
            int l = nums.length;
            while (right < l) {
                //若右指针指向的元素为1,
                //则右指针继续向右滑动
                if (nums[right] == 1) {
                    right++;
                } else {
                    //若右指针指向元素为0
                    //则右指针指向后面一个元素
                    //左指针更新为0后面新的起始位置
                    right++;
                    left = right;
                }
                //循环内更新连续1的个数
                //右指针每滑动一次都会进行更新
                maxCount = Math.max(maxCount, right - left);
            }
            return maxCount;
        }
    }
}
