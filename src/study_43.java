public class study_43 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int len1 = nums1.length;
            int len2 = nums2.length;
            for (int i = 0; i < len1; i++) {
                int j = 0;
                //找到num1中元素在nums2中对应的位置
                while (nums1[i] != nums2[j]) {
                    j++;
                }
                //在nums2中向右查找大于该元素的值
                for (j++; j < len2; j++) {
                    if (nums1[i] < nums2[j]) {
                        nums1[i] = nums2[j];
                        break;
                    }
                }
                //当num1中元素在num2中对应的位置是数组在最后一位时，返回-1
                if (j == len2) {
                    nums1[i] = -1;
                }
            }
            return nums1;
        }
    }
}
