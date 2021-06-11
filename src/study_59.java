public class study_59 {
    class Solution {
        public int longestPalindrome(String s) {
            int[] count = new int[128];
            int length = s.length();
            //遍历，统计出现的字符次数
            for (int i = 0; i < length; ++i) {
                char c = s.charAt(i);
                count[c]++;
            }

            int res = 0;
            //判断数组长度是否为偶数
            for (int x: count) {
                res += x / 2 * 2;
                //出现为奇数次数的字符时，数组长度加1，数组长度变为奇数，且如果出现多个奇数次数的字符，不改变数组长度
                //回文串中只能至多出现一个奇数次数的字符
                if (x % 2 == 1 && res % 2 == 0) {
                    res++;
                }
            }
            return res;
        }
    }
}
