import java.util.HashSet;
import java.util.Set;

public class study_24 {
    class Solution {
        private int getNext(int n) {
            int totalSun = 0;
            while (n > 0) {
                int d = n % 10;
                n = n / 10;
                totalSun += d * d;
            }
            return totalSun;
        }
        public boolean isHappy(int n) {
            Set<Integer> seen = new HashSet<>();
            while (n != 1 && !seen.contains(n)) {
                seen.add(n);
                n = getNext(n);
            }
            return n == 1;
        }
    }
}
