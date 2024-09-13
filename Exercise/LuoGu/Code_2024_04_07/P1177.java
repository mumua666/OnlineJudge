import java.util.Scanner;

public class P1177 {
    // TLE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 1 && nums[j - 1] > nums[j]; j--) {
                nums[j - 1] ^= nums[j];
                nums[j] ^= nums[j - 1];
                nums[j - 1] ^= nums[j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}