public class study_28 {
    class Solution {
        public int mySqrt(int x) {
            int a = 0, b = x, ans = -1;
            while (a <= b) {
                int mid = a + (b - a) / 2;
                if ((long) mid * mid <= x) {
                    ans = mid;
                    a = mid + 1;
                }else{
                    b = mid - 1;
                }
            }
            return ans;
        }
    }
}
