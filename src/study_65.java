import java.lang.reflect.Array;
import java.util.Arrays;

public class study_65 {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            int count = 0;
            //g和s先排序
            Arrays.sort(g);
            Arrays.sort(s);
            int temp= g.length;
            //g和s都从最末位开始遍历也就是最大值开始如果s的值大于g的值以后g从当前位置的前一位开始遍历
            for (int i = s.length - 1; i >= 0; i--) {
                for (int j = temp - 1; j >= 0; j--) {
                    if (s[i] >= g[j]) {
                        count++;
                        temp = j;
                        break;
                    }
                }
            }
            return count;
        }
    }
}

