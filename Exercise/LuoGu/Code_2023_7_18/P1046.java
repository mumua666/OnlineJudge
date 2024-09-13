package Code_2023_7_18;

import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] apple = new int[10];
        int height;

        for (int i = 0; i < 10; i++) {
            apple[i] = sc.nextInt();
        }
        height = sc.nextInt();
        height += 30;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            if (apple[i] <= height) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
