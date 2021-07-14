import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class study_78 {
    class Solution {
        public boolean isValid(String s) {
            int n = s.length();
            if (n % 2 == 1) {
                return false;
            }
            //哈希表的键=左括号
            //哈希表的值=右括号
            Map<Character, Character> pair = new HashMap<Character, Character>() {{
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }};
            //存放左括号的栈
            Deque<Character> stack = new LinkedList<Character>();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                //判断取出的字符是否包含指定的键名
                if (pair.containsKey(ch)) {
                    //空栈说明右括号在左括号前面
                    //判断栈顶元素与当前字符是否相匹配
                    if (stack.isEmpty() || stack.peek() != pair.get(ch)) {
                        return false;
                    }
                    //将栈顶元素弹出
                    stack.pop();
                } else {
                    //将元素推入栈
                    stack.push(ch);
                }
            }
            return stack.isEmpty();
        }
    }
}
