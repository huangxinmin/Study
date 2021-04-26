public class study_21 {
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuffer st =new StringBuffer();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    st.append(Character.toLowerCase(ch));
                }
            }
            StringBuffer st_rev =new StringBuffer(st).reverse();
            return st.toString().equals(st_rev.toString());
        }
    }
}
