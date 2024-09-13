package Array;

public class P977 {
    // public int[] sortedSquares(int[] nums) {
    // int i = 0, j = nums.length - 1;
    // int[] new_nums = new int[nums.length];
    // int index = 0;
    // while (nums[i] < nums[j]) {
    // i++;
    // j--;
    // }
    // int left, right;
    // while (i < nums.length && j >= 0) {
    // left = nums[j] * nums[j];
    // right = nums[i] * nums[i];
    // if (left < right) {
    // new_nums[index++] = left;
    // j--;
    // } else {
    // new_nums[index++] = right;
    // if (i == j) {
    // j--;
    // }
    // i++;
    // }
    // }
    // while (i < nums.length) {
    // new_nums[index++] = nums[i] * nums[i++];
    // }
    // while (j >= 0) {
    // new_nums[index++] = nums[j] * nums[j--];
    // }
    // return new_nums;
    // }

    public int[] sortedSquares(int[] nums) {
        int[] new_nums = new int[nums.length];
        int left, right;
        for (int i = 0, j = nums.length - 1, index = nums.length - 1; i <= j;) {
            left = nums[i] * nums[i];
            right = nums[j] * nums[j];
            if (left > right) {
                new_nums[index--] = left;
                i++;
            } else {
                new_nums[index--] = right;
                j--;
            }
        }
        return new_nums;
    }

    public static void main(String[] args) {
        int[] arr = { -5, -3, -2, -1 };
        for (Integer integer : new P977().sortedSquares(arr)) {
            System.out.println(integer);
        }
    }
}
