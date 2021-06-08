public class study_56 {
    class Solution {
        //判断是否是元音字母，是返回false，不是返回true
        public boolean isVowel(char c) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return false;
            }
            return true;
        }
        public String reverseVowel(String s) {
            //字符串转换为字符数组
            char [] chars = s.toCharArray();
            //左右指针
            int left = 0;
            int right = chars.length - 1;
            //判断左右指针是否是元音字母
            while (left < right) {
                if (isVowel(chars[left])) {
                    left ++;
                    continue;
                }
                if (isVowel(chars[right])) {
                    right --;
                    continue;
                }
                //元音字母互换
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            return String.valueOf(chars);
        }
    }
}
