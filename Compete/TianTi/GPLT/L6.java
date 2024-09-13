import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }
        int[] nums = new int[n];
        double total = 0;
        while (sc.hasNext()) {
            int type = sc.nextInt();
            int num = sc.nextInt();
            if (type == 0) {
                break;
            }
            nums[type - 1] += num;
            total += prices[type - 1] * num;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
        System.out.printf("%.2f\n", total);
        sc.close();
    }
}