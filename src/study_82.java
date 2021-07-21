public class study_82 {
    class Solution {
        public boolean canConstruct (String ransomNote, String magazine) {
            //记录杂志字符串出现的次数
            int[] arr = new int[26];
            int temp = 0;
            for (int i = 0; i < magazine.length(); i++) {
                temp = magazine.charAt(i) - 'a';
                arr[temp]++;
            }
            //在数组中查找赎金信中的每一个字符
            //找到相应的字符则减一，找不到则返回false
            for (int j = 0; j < ransomNote.length(); j++) {
                temp = ransomNote.charAt(j) - 'a';
                arr[temp]--;
                if (arr[temp] > 0) {
                    arr[temp]--;
            } else {
                return false;
                }
            }
            return true;
        }
    }
}
