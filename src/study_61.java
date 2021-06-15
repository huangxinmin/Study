import java.util.ArrayList;
import java.util.List;

public class study_61 {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> res = new ArrayList<>();
            //遍历1到n
            for (int i = 1; i <= n; i++) {
                //如果能同时被3和5整除，在结果中添加FizzBuzz
                if (i % 15 == 0) {
                    res.add("FizzBuzz");
                    //如果能被3整除，在结果中添加Fizz
                } else if (i % 3 == 0) {
                    res.add("Fizz");
                    //如果能被5整除，在结果中添加Buzz
                } else if (i % 5 == 0) {
                    res.add("Buzz");
                    //其它情况则在结果中添加当前数字i
                } else {
                    res.add(String.valueOf(i));
                }
            }
            return res;
        }
    }
}
