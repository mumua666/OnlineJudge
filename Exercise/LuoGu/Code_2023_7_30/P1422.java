package Code_2023_7_30;

import java.util.Scanner;

public class P1422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double price = 0;
        if (n <= 150) {
            price = n * 0.4463;
        } else if (n <= 400) {
            price = 150 * 0.4463 + (n - 150) * 0.4663;
        } else {
            price = 150 * 0.4463 + 250 * 0.4663 + (n - 400) * 0.5663;
        }
        System.out.printf("%.1f\n", price);

        sc.close();
    }
}
