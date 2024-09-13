package Code_2023_7_23;

import java.util.Scanner;

public class P1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        int num, count = 0, lowDigit;

        for (int i = l; i <= r; i++) {
            num = i;
            while (num > 0) {
                lowDigit = num % 10;
                num /= 10;
                if (lowDigit == 2) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
