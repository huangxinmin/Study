public class study_67 {
    class Solution {
        public int fib(int n) {
            if (n < 2) {
                return n;
            }
            //滚动数组，斐波那契数列每项的和都等于前两项的和
            int p = 0, q = 0, temp = 1;
            for (int i = 2; i <= n; i++) {
                p = q;
                q = temp;
                temp = q + p;
                continue;
            }
            return temp;
        }
    }
}
