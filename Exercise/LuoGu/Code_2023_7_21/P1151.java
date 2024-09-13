package Code_2023_7_21;

import java.util.Scanner;

public class P1151 {
    public static void main(String[] args) {
        int start = (int) 1e4, end = (int) 3e4;
        Scanner sc = new Scanner(System.in);
        int k;
        k = sc.nextInt();
        boolean hasSolution = false;

        int sub1, sub2, sub3;

        for (int i = start; i <= end; i++) {
            sub1 = i / 100;
            sub2 = i % 10000 / 10;
            sub3 = i % 1000;

            if (sub1 % k == 0 && sub2 % k == 0 && sub3 % k == 0) {
                hasSolution = true;
                System.out.println(i);
            }
        }

        if (!hasSolution) {
            System.out.println("No");
        }

        sc.close();
    }
}
