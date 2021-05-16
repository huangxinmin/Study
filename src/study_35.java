public class study_35 {
    class Solution {
        public void reverseString(char[] s) {
            int n = s.length;
            for (int left = 0, right = n - 1; left < right; ++ left , -- right) {
                char temp = '1';
                temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }
        }
    }
}
