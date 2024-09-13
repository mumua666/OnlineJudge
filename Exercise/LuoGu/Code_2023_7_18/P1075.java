package Code_2023_7_18;

import java.util.Scanner;

public class P1075 {

    public static boolean isPrime(int n) {
        int factor_min = (int) Math.sqrt(n);
        for (int i = 2; i <= factor_min; i++) {
            if (n / i * i == n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factor_min = (int) Math.sqrt(n);
        int[] prime_arr = new int[factor_min];
        int index = 0;

        for (int i = 2; i <= factor_min; i++) {
            if (isPrime(i)) {
                prime_arr[index++] = i;
            }
        }
        for (int i = 0; i < index; i++) {
            if (n / prime_arr[i] * prime_arr[i] == n) {
                System.out.println(n / prime_arr[i]);
                break;
            }
        }
        sc.close();
    }
}
