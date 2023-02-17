package codewars;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int median;
        int fl = nums1.length;
        int sl = nums2.length;
        int n = fl + sl;
        int[] newArr = new int[fl + sl];
        System.arraycopy(nums1, 0, newArr, 0, fl);
        System.arraycopy(nums2, 0, newArr, fl, sl);

        if (n % 2 == 0) {
            median = newArr[n / 2] + newArr[(n / 2) - 1] / 2;
        }
        else {
           median = (int) Math.floor(newArr[n/2]);
        }
        return new int[]{median};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5,6})));
    }
}
