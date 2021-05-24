public class study_42 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            //设置两个指针，一个指向数组头部，一个指向数组尾部
            int left = 0, right = numbers.length - 1;
            //循环条件
            while (left < right) {
                //找到目标值后返回元素下标（下标从1开始）
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left + 1,right + 1};
                    //若两个元素相加小于目标值则左指针向右移动，反之右指针向左移动
                } else if (numbers[left] + numbers[right] < target) {
                    ++left;
                } else {
                    --right;
                }
            }
            //防止编译报错
            return new int[0];
        }
    }
}
