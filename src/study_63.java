public class study_63 {
    class Solution {
        public int arrangeCoins (int n) {
            //计算结果超出int类型的使用范围使用long
            long left = 0;
            long right = n;
            while (left < right) {
                long mid = left + (right - left) / 2;
                long res = mid * (mid + 1) / 2;
                if (res == n) {
                    return (int)mid;
                    //res<n说明硬币还有剩余，还能在排一行
                }else if (res < n) {
                    left = mid + 1;
                    //res>n说明硬币已经超出，应减少一行
                }else {
                    right = mid - 1;
                }
            }
            return (int)right;
        }
    }
}
