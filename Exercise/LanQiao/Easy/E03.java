import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int minX = Math.min(x1, x3);
        int maxX = Math.max(x2, x4);
        int minY = Math.min(y1, y3);
        int maxY = Math.max(y2, y4);
        boolean[][] s = new boolean[maxX][maxY];
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                s[i][j] = true;
            }
        }
        for (int i = x3; i < x4; i++) {
            for (int j = y3; j < y4; j++) {
                s[i][j] = true;
            }
        }
        int sum = 0;
        for (int i = minX; i < maxX; i++) {
            for (int j = minY; j < maxY; j++) {
                if (s[i][j]) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}