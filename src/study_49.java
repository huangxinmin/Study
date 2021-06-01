public class study_49 {
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            //结果数组
            int n = A.length;
            int[] res = new int[n];
            //遍历数组把偶数放在res[0] res[2]中
            int o = 0;
            for (int x : A) {
                if (x % 2 == 0) {
                    res[o] = x;
                    o += 2;
                }
            }
            //遍历数组把奇数放在res[1] res[3]中
            int j = 1;
            for (int x : A) {
                if (x % 2 == 1) {
                    res[j] = x;
                    j += 2;
                }
            }
            return res;
        }
    }
}
