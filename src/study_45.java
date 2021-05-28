public class study_45 {
    class Solution {
        public boolean detectCapitalUse(String word) {
            //用charAt函数计算字符串中大写字母的个数
            int count = 0;
            for (int i = 0;i <word.length();i++) {
                if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                    count ++;
                }
            }
            //如果count=0，则全是小写字母
            if (count == 0) {
                return true;
            }
            //若count=字符串的长度，则全是大写字母
            else if (count == word.length()){
                return true;
            }
            //若charAt（0）只出现一次且在首位
            else if ('A' <= word.charAt(0) && word.charAt(0) <= 'Z' && count == 1) {
                return true;
            }else{
                return false;
            }
        }
    }
}
