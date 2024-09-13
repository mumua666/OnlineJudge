package Code_2023_7_30;

import java.util.Scanner;

public class P1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pre, next;
        pre = sc.nextInt();
        int max = 1, curMax = 1;
        while (n-- > 1) {
            next = sc.nextInt();
            if (next - pre == 1) {
                curMax++;
            } else {
                max = max > curMax ? max : curMax;
                curMax = 1;
            }
            pre = next;
        }
        max = max > curMax ? max : curMax;
        System.out.println(max);
        sc.close();
    }
}
