package Code_2023_7_23;

import java.util.Scanner;

public class P1307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0;

        while (n != 0) {
            num *= 10;
            num += n % 10;
            n /= 10;
        }
        System.out.println(num);
        sc.close();
    }
}