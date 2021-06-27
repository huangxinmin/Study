public class study_68 {
    class Solution {
        public boolean checkPerfectNumber(int num) {
            //由完美数的定义可知1一定不是完美数
            if(num == 1) {
                return false;
            }
            //正整数一定会有一个1，同时不用考虑自身，所以单独处理
            int sum = 1;
            int i = 2;
            double sqrt = Math.sqrt(num);
            for(;i < sqrt;i++) {
                if(num % i == 0) {
                    sum += i;
                    sum += num / i;
                }
            }
            //只需要加1次i值，如果在循环中会加2次
            if(i * i == num) {
                sum += i;
            }
            return sum == num;
        }
    }
}
