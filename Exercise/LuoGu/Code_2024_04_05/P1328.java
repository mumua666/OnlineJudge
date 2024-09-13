import java.util.Scanner;

public class P1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int na = sc.nextInt();
        int nb = sc.nextInt();

        int[] aArr = new int[na];
        for (int i = 0; i < na; i++) {
            aArr[i] = sc.nextInt();
        }

        int[] bArr = new int[nb];
        for (int i = 0; i < nb; i++) {
            bArr[i] = sc.nextInt();
        }
        boolean[][] isWin = new boolean[5][5];
        isWin[0][2] = true;
        isWin[0][3] = true;
        isWin[1][3] = true;
        isWin[2][4] = true;
        isWin[3][4] = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                isWin[i][j] = !isWin[j][i];
            }
        }

        int cnta = 0, cntb = 0;
        for (int i = 0; i < n; i++) {
            int x = aArr[i % na];
            int y = bArr[i % nb];
            if (isWin[x][y]) {
                cnta++;
            }
            if (isWin[y][x]) {
                cntb++;
            }
        }

        System.out.println(cnta + " " + cntb);

        sc.close();
    }
}
