package Code_2023_7_18;

import java.util.Scanner;

public class P1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] line = new int[l + 1];
        int m = sc.nextInt();
        int start, end;
        while (m-- > 0) {
            start = sc.nextInt();
            end = sc.nextInt();
            for (int i = start; i <= end; i++) {
                line[i] = -1;
            }
        }

        int cnt = 0;
        for (int i = 0; i <= l; i++) {
            if (line[i] != -1) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
