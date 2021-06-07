import java.util.ArrayList;
import java.util.List;

public class study_55 {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            //i初始指向第1个区间的起始位置
            List<String> res = new ArrayList<>();
            int i = 0;
            //j向后遍历直到不满足连续递增,即nums[j] + 1 != nums[j + 1]
            //或者j向后遍历直到数组最后一个元素,则当前连续递增区间[i, j]遍历完毕并输出结果列表。
            for (int j = 0; j < nums.length; j++) {
                if (j + 1 == nums.length || nums[j] + 1 != nums[j + 1]) {
                    // 将当前区间 [i, j] 写入结果列表
                    StringBuffer temp = new StringBuffer();
                    temp.append(nums[i]);
                    if (i != j) {
                        temp.append("->").append(nums[j]);
                    }
                    res.add(temp.toString());
                    //更新下一个区间的起始点
                    i = j + 1;
                }
            }
            return res;
        }
    }
}
