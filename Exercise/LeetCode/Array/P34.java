package Array;

public class P34 {
    public int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);
        int[] arr = { -1, -1 };

        if (leftBorder == -2 || rightBorder == -2) {
            return arr;
        }

        if (rightBorder - leftBorder > 1) {
            int[] arrNew = { leftBorder + 1, rightBorder - 1 };
            return arrNew;
        }
        return arr;
    }

    public int getLeftBorder(int[] nums, int target) {
        int left, right, middle;
        left = 0;
        right = nums.length - 1;
        int leftBorder = -2;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] >= target) {
                right = middle - 1;
                leftBorder = right;
            } else {
                left = middle + 1;
            }
        }
        return leftBorder;
    }

    public int getRightBorder(int[] nums, int target) {
        int left, right, middle;
        left = 0;
        right = nums.length - 1;
        int rightBorder = -2;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] <= target) {
                left = middle + 1;
                rightBorder = left;
            } else {
                right = middle - 1;
            }
        }
        return rightBorder;
    }
}
