import java.util.Scanner;

public class P5736 {

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num / i * i == num) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (!isPrime(nums[i])) {
                nums[i] = -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != -1) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
