import java.util.Scanner;

public class P1177Pro {

    public static void mergeSort(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }
        sort(nums, 0, nums.length - 1);
    }

    public static void sort(int[] nums, int start, int end) {
        if (end <= start) {
            return;
        }
        int medium = start + ((end - start) >> 1);
        sort(nums, start, medium);
        sort(nums, medium + 1, end);
        merge(nums, start, medium, end);
    }

    public static void merge(int[] nums, int start, int medium, int end) {
        int i = start, j = medium + 1;
        int[] tempNums = new int[end - start + 1];
        int index = 0;
        while (i <= medium && j <= end) {
            tempNums[index++] = nums[i] < nums[j] ? nums[i++] : nums[j++];
        }
        while (i <= medium) {
            tempNums[index++] = nums[i++];
        }
        while (j <= end) {
            tempNums[index++] = nums[j++];
        }
        for (int k = 0; k < tempNums.length; k++) {
            nums[start + k] = tempNums[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        mergeSort(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}