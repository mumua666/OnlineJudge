import java.util.Scanner;

public class P2670 {

    public static void count(char[][] maps, char[][] cntMaps, int i, int j) {
        int startX = Math.max(0, i - 1);
        int startY = Math.max(0, j - 1);
        int endX = Math.min(maps.length - 1, i + 1);
        int endY = Math.min(maps[0].length - 1, j + 1);

        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
                if (maps[x][y] == '*') {
                    cntMaps[i][j]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maps = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                maps[i][j] = line.charAt(j);
            }
        }
        char[][] cntMaps = maps.clone();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i][j] != '*') {
                    cntMaps[i][j] = 0;
                    count(maps, cntMaps, i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char ch = cntMaps[i][j] == '*' ? (char) '*' : (char) ('0' + cntMaps[i][j]);
                System.out.print(ch);
            }
            System.out.println();
        }

        sc.close();
    }
}
