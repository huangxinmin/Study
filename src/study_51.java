public class study_51 {
    class Solution {
        public boolean judgeCircle(String moves) {
            int x = 0, y = 0;
            int length = moves.length();
            //遍历所有move指令
            for (int i = 0; i < length; i++) {
                char move = moves.charAt(i);
                if (move == 'U') {
                    y--;
                } else if (move == 'D') {
                    y++;
                } else if (move == 'L') {
                    x--;
                } else if (move == 'R') {
                    x++;
                }
            }
            //判断坐标是否为（0，0）
            return x == 0 && y == 0;
        }
    }
}
