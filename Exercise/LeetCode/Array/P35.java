package Array;

public class P35 {

    // public int searchInsert(int[] nums, int target) {
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] >= target) {
    // return i;
    // }
    // }
    // return nums.length;
    // }

    // public int searchInsert(int[] nums, int target) {
    // int left, right, middle;
    // left = 0;
    // right = nums.length - 1;
    // while (left <= right) {
    // middle = left + (right - left) / 2;
    // if (nums[middle] > target) {
    // right = middle - 1;
    // } else if (nums[middle] < target) {
    // left = middle + 1;
    // } else {
    // return middle;
    // }
    // }
    // return right + 1;
    // }

    public int searchInsert(int[] nums, int target) {
        int left, right, middle;
        left = 0;
        right = nums.length;
        while (left < right) {
            middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right;
    }
}
