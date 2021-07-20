public class study_81 {
    class Solution {
        public boolean checkRecord (String s) {
            int a = 0, l = 1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    a++;
                }
                if (i > 0 && s.charAt(i - 1) == 'L' && s.charAt(i) == 'L') {
                    l++;
                }else {
                    l = 1;
                }
                if (a > 1 || l > 2) {
                    return false;
                }
            }
            return true;
        }
    }
}
