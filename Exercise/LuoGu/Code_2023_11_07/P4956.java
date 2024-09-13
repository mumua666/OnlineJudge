import java.util.Scanner;

public class P4956 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int times = (365 - 1) / 7;
        int timesX = 7;
        int timesK = (1 + 6) * 6 / 2;

        int k, x;
        int sum = 0;
        boolean isFind = false;
        for (k = 1;; k++) {
            for (x = 1; x <= 100; x++) {
                sum = times * (timesX * x + timesK * k);
                if (sum == n) {
                    isFind = true;
                }
                if (sum >= n) {
                    break;
                }
            }
            if (isFind) {
                System.out.printf("%d\n%d\n", x, k);
                break;
            }
        }

        sc.close();
    }
}
