import java.util.Scanner;

public class P2089 {

    public static long combine(int n, int k) {
        long res = 1;
        for (int i = n, j = 1; j <= k; i--, j++) {
            res *= i;
            res /= j;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 10 || n > 30) {
            System.out.println(0);
        } else {
            long cnt = 0;
            for (int i = n - 10, j = 0; i >= 1; i -= 2, j++) {
                cnt += combine(10, i);
                if (j != 0) {
                    cnt += combine(10 - i, j);
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}