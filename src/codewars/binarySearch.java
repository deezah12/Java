package codewars;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int middle;

        while (low <= high) {
            middle = (low + high) / 2;
            if (nums[middle] == target) {
                return middle;}
            if (nums[middle] >= target) {
                    high = middle - 1;
                } else {
                        low = middle + 1;
                    }

            }
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
