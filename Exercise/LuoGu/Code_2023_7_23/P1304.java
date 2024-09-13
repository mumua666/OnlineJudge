package Code_2023_7_23;

import java.util.Scanner;

public class P1304 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n / i * i == n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 4; i <= n; i += 2) {
            for (int j = 2; j <= i / 2; j++) {
                if (isPrime(j) && isPrime(i - j)) {
                    System.out.printf("%d=%d+%d\n", i, j, i - j);
                    break;
                }
            }
        }

        sc.close();
    }
}
