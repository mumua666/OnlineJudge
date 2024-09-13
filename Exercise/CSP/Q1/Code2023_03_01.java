import java.util.Scanner;

public class Code2023_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x1, y1, x2, y2;
        int square = 0;
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            x1 = x1 > 0 ? x1 : 0;
            y1 = y1 > 0 ? y1 : 0;

            x2 = x2 < a ? x2 : a;
            y2 = y2 < b ? y2 : b;

            int w = x2 - x1;
            w = w > 0 ? w : 0;
            int h = y2 - y1;
            h = h > 0 ? h : 0;
            square += w * h;
        }
        System.out.println(square);

        sc.close();
    }
}
