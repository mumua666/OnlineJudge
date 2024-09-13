package Code_2023_7_18;

import java.util.Scanner;

public class P1035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        double sum = 0;
        int cnt = 0;
        while (sum <= k) {
            cnt++;
            sum += 1.0 / cnt;
        }

        System.out.println(cnt);

        sc.close();
    }
}