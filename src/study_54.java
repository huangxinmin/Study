public class study_54 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            //将字符串存在哈希表中
            int [] character = new int[26];
            //遍历字符串s并统计字母出现的频次
            for (int i = 0; i < s.length(); i++) {
                character[s.charAt(i) - 'a']++;
            }
            //遍历字符串t并统计字母出现的频次，并减去character中出现的频次，
            //如果出现character[i]<0，则说明字符串t包含s字符串中不存在的字符
            for (int i = 0; i <t.length(); i++) {
                character[t.charAt(i) - 'a']--;
                if (character[t.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
