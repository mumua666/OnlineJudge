import java.util.Scanner;

/**
 * 70 runtimeError
 */
public class Code2022_06_02 {
    static int[][] greenMap;
    static int[][] treasureMap;
    static int n, L, S;

    static boolean isSame(int x, int y) {
        for (int i = 0; i <= S; i++) {
            for (int j = 0; j <= S; j++) {
                if (greenMap[x + i][y + j] != treasureMap[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        L = sc.nextInt();
        S = sc.nextInt();
        greenMap = new int[L + 1][L + 1];
        treasureMap = new int[S + 1][S + 1];

        int x, y;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            greenMap[x][y] = 1;
        }
        for (int i = S; i >= 0; i--) {
            for (int j = 0; j <= S; j++) {
                treasureMap[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i + S <= L; i++) {
            for (int j = 0; j + S <= L; j++) {
                if (isSame(i, j)) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}