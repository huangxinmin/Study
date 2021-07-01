public class study_71 {
    class Solution {
        public int findLHS(int[] nums) {
            int res = 0;
            int count;
            for (int i = 0;i < nums.length;i++) {
                count = 0;    //每一次循环需要初始化为0
                boolean flag = false;   //初始化为false
                for (int j=0;j < nums.length;j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        //说明数组中有相差为1的数
                    }else if (nums[i] == nums[j]+1) {
                        count++;
                        flag = true;
                    }
                }
                if (flag) {
                    res = Math.max(res,count);
                }
            }
            return res;
        }
    }
}
