package Code_2023_7_26;

import java.util.Scanner;

public class P1319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isOne = false;
        int num, count = 0;
        while (sc.hasNextInt()) {
            num = sc.nextInt();
            if (isOne) {
                isOne = false;
                while (num-- > 0) {
                    System.out.print("1");
                    count++;
                    if (count % n == 0) {
                        System.out.println();
                    }
                }
            } else {
                isOne = true;
                while (num-- > 0) {
                    System.out.print("0");
                    count++;
                    if (count % n == 0) {
                        System.out.println();
                    }
                }
            }
        }
        sc.close();
    }
}
