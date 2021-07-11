public class study_75 {
    class Solution {
        public  int calPoints(String[] ops) {
            //长度为1直接返回
            if (ops.length == 1) {
                return Integer.parseInt(ops[0]);
            }
            //定义一个新数组
            int[] arr = new int[ops.length];
            int top = 0;
            for (int i = 0; i < ops.length; i++) {
                switch (ops[i]) {
                    case "C":
                        arr[top - 1] = 0;
                        --top;
                        break;
                    case "D":
                        arr[top] = arr[top - 1] + arr[top - 1];
                        ++top;
                        break;
                    case "+":
                        arr[top] = arr[top - 1] + arr[top - 2];
                        ++top;
                        break;
                    default:
                        arr[top] = Integer.parseInt(ops[i]);
                        ++top;
                }
            }
            int num = 0;
            for (int i : arr) {
                num += i;
            }
            return num;
        }
    }
}
