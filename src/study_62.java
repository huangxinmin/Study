public class study_62 {
    class Solution {
        public int countSegments (String s) {
            if (s == null && s.length() == 0) {
                return 0;
            }
            int count = 0; //单词计数
            int wordcount = 0; //字母计数
            //遍历字符串
            for (int i = 0;i < s.length();i++) {
                char c =s.charAt(i);
                //当遍历不是空格时，字母计数+1
                if (c != ' ') {
                    wordcount ++;
                }
                //遍历到最后一个不是空格的字符时，单词计数+1
                if (i == s.length() - 1) {
                    count ++;
                    //当遍历到空格并且字母计数大于0，说明遍历完了一个单词，重新开始字母计数
                }else if (c == ' ' && wordcount > 0) {
                    count ++;
                    wordcount = 0 ;
                }
            }
            return count;
        }
    }
}
