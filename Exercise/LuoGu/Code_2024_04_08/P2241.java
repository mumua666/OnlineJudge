import java.util.Scanner;

public class P2241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = Math.min(n, m);
        int max = Math.max(n, m);

        long cnt1 = 0;
        for (int i = 1; i <= min; i++) {
            cnt1 += (min - i + 1) * (max - i + 1);
        }

        long cnt2 = 0;
        for (int i = 1; i <= min; i++) {
            for (int j = 1; j <= max; j++) {
                if (i != j) {
                    cnt2 += (min - i + 1) * (max - j + 1);
                }
            }
        }
        System.out.println(cnt1 + " " + cnt2);

        sc.close();
    }
}