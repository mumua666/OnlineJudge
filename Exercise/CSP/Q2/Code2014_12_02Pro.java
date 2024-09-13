import java.util.Scanner;

public class Code2014_12_02Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAXN = 101;
        boolean[][] map = new boolean[MAXN][MAXN];

        int n = sc.nextInt();
        int x1, y1, x2, y2;
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    map[j][k] = true;
                }
            }
        }

        int square = 0;
        for (int i = 0; i < MAXN; i++) {
            for (int j = 0; j < MAXN; j++) {
                if (map[i][j]) {
                    square++;
                }
            }
        }
        System.out.println(square);

        sc.close();
    }
}
