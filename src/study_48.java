public class study_48 {
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            //结果数组
            int[] res = new int[A.length];
            int count = 0;
            //先循环取偶数，插入数组
            for (int i = 0; i < A.length; ++i) {
                if (A[i] % 2 == 0) {
                    res[count] = A[i];
                    count++;
                }
            }
            //再循环取奇数，插入数组
            for (int i = 0; i < A.length; ++i) {
                if (A[i] % 2 != 0) {
                    res[count] = A[i];
                    count++;
                }
            }
            return  res;
        }
    }
}
