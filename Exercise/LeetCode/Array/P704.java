package Array;

class P704 {

    // public int search(int[] nums, int target) {
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
    // return -1;
    // }

    public int search(int[] nums, int target) {
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
        return -1;
    }

}