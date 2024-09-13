import java.util.Scanner;

public class Code2022_09_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] c = new int[n + 1];
        c[0] = 1;
        for (int i = 1; i <= n; i++) {
            c[i] = 1;
            for (int j = 0; j < i; j++) {
                c[i] *= a[j];
            }
        }

        int cur, pre = 0;
        for (int i = 0; i < n; i++) {
            cur = m % c[i + 1];
            int b = (cur - pre) / c[i];
            System.out.print(b + " ");
            pre = cur;
        }
        System.out.println();
        sc.close();

    }
}
