package Code_2023_7_21;

import java.util.Scanner;

public class P1150 {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int total = n;
        while (n >= k) {
            total += n / k;
            n = n / k + n - n / k * k;
        }
        System.out.println(total);
        sc.close();
    }
}
