import java.util.ArrayList;
import java.util.List;

public class study_64 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            List<Integer> ret = new ArrayList<>();
            for(int num: nums){
                // 确保出现过的元素均放置到正确的位置上
                while(nums[num-1] != num){
                    num = nums[num-1] + (nums[num-1] = num) *0;// 交换
                }
            }
            // 扫一遍，出现过和重复元素均已占位，其余元素即为没出现过的数字
            for(int i = 0; i < n; ++i){
                if(nums[i] != i+1){
                    ret.add(i + 1);
                }
            }
            return ret;
        }
    }
}