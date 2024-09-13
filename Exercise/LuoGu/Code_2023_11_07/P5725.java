import java.util.Scanner;

public class P5725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n * n; i++) {
            System.out.printf("%02d", i);
            if (i % n == 0) {
                System.out.println();
            }
        }

        System.out.println();

        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d", cnt++);
            }
            System.out.println();
        }

        sc.close();
    }
}
