public class study_58 {
    class Solution {
        public char findTheDifference(String s,String t) {
            int [] character = new int[26];
            //遍历字符串s，统计s中出现的字符的频率
            for (int i = 0;i < s.length();i++) {
                char ch = s.charAt(i);
                character [s.charAt(i) - 'a']++;
            }
            //遍历字符串他，对其中每个出现的字符频率减1，当频率为<0时，则该字符是被添加的字母
            for (int i = 0;i < t.length();i++) {
                char ch = t.charAt(i);
                character [t.charAt(i) - 'a']--;
                if (character[ch - 'a'] < 0) {
                    return ch;
                }
            }
            return ' ';
        }
    }
}
