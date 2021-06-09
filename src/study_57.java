public class study_57 {
    /**
     * *Forward declaration of guess API.
     *@param  num   your guess
     *@return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     *int guess(int num);
     */


    public class Solution {
        public int guessNumber(int n) {
            int left = 1;
            int right = n;
            //从中间的数字开始，将数字传递到guess函数里。如果返回-1,说明中间数字比答案大，就查找更小的那一半
            //如果返回1，说明中间数字比答案小，查找更大的一半
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (guess(mid) == 0) {
                    return mid;
                } else if (guess(mid) == -1) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return -1;
        }
    }
}