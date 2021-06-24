public class study_66 {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            // 对字符串S遍历
            for (int i = 1; i * 2 <= n; ++i) {
                //用matches函数检测字符串是否匹配给定的表达式
                if (n % i == 0) {
                    boolean matches = true;
                    for (int j = i; j < n; ++j) {
                        //如果相邻的两个字符串不相等，那字符串S一定不是由多个重复子字符串构成
                        if (s.charAt(j) != s.charAt(j - i)) {
                            matches = false;
                        }
                    } if (matches) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
