public class study_47 {
    class Solution {
        public boolean isMonotonic(int[] A) {
            //设置两个布尔值
            boolean inc = true;
            boolean dec = true;
            //遍历
            for (int i = 1; i < A.length; ++i) {
                //inc标记数组是否上升，如果下降则设置为 false
                if (A[i] < A[i - 1])
                    inc = false;
                //dec标记数组是否下降，如果上升则设置为 false
                if (A[i] > A[i - 1])
                    dec = false;
                //如果数组中同时存在上升和下降则不是单调数组，返回false
                if (!inc && !dec)
                    return false;
            }
            return true;
        }
    }
}
