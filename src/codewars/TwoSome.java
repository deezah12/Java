package codewars;

import java.util.Arrays;

public class TwoSome {
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,5,11,10}, 10)));
    }
}
