package Array;

public class P27Pro {
    public int removeElement(int[] nums, int val) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            while (leftIndex <= rightIndex && nums[leftIndex] != val) {
                leftIndex++;
            }

            while (leftIndex <= rightIndex && nums[rightIndex] == val) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                nums[leftIndex++] = nums[rightIndex--];
            }
        }

        return leftIndex;
    }

    public static void main(String[] args) {

    }
}
