import java.util.Scanner;

public class p5461 {
    public static void setLuckyOne(boolean[][] luckyMap, int offSetX, int offSetY, int len) {
        if (len == 0) {
            return;
        }
        for (int x = offSetX; x < offSetX + len; x++) {
            for (int y = offSetY; y < offSetY + len; y++) {
                luckyMap[x][y] = true;
            }
        }
        setLuckyOne(luckyMap, offSetX + len, offSetY, len / 2);
        setLuckyOne(luckyMap, offSetX, offSetY + len, len / 2);
        setLuckyOne(luckyMap, offSetX + len, offSetY + len, len / 2);
    }

    public static void showLuckyMap(boolean[][] luckyMap) {
        int len = luckyMap.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int luck = luckyMap[i][j] ? 0 : 1;
                System.out.print(luck + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = (int) Math.pow(2, n);
        boolean[][] luckyMap = new boolean[len][len];
        setLuckyOne(luckyMap, 0, 0, len / 2);
        showLuckyMap(luckyMap);
        sc.close();
    }
}
