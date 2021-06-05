public class study_53 {
    class Solution {
        public boolean isUgly(int n) {
            //0和负数一定不能被2，3，5分解
            if (n <= 0) {
                return false;
            }
            //循环到不能被2，3，5整除为止
            while(n >= 2) {
                if(n % 2 == 0) {
                    n /= 2;
                    continue;
                }
                if(n % 3 == 0) {
                    n /= 3;
                    continue;
                }
                if(n % 5 == 0) {
                    n /= 5;
                    continue;
                }
                break;
            }
            return n == 1;
        }
    }
}
