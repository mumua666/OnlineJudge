import java.util.Scanner;

public class Code2016_04_02 {

    public static boolean canMerge(byte[][] part1, byte[][] part2) {
        for (int i = 0; i < part1.length; i++) {
            for (int j = 0; j < part1[0].length; j++) {
                if (part1[i][j] * part2[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ROW = 15, COL = 10;
        int P_ROW = 4, P_COL = 4;
        byte[][] map = new byte[ROW][COL];
        byte[][] part = new byte[P_ROW][P_COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                map[i][j] = sc.nextByte();
            }
        }

        for (int i = 0; i < P_ROW; i++) {
            for (int j = 0; j < P_COL; j++) {
                part[i][j] = sc.nextByte();
            }
        }

        boolean isBlankRow = part[3][0] == 0 && part[3][1] == 0 && part[3][2] == 0 && part[3][3] == 0;
        while (isBlankRow) {
            for (int i = P_ROW - 1; i > 0; i--) {
                for (int j = 0; j < P_COL; j++) {
                    part[i][j] = part[i - 1][j];
                }
            }
            part[0][0] = 0;
            part[0][1] = 0;
            part[0][2] = 0;
            part[0][3] = 0;
            isBlankRow = part[3][0] == 0 && part[3][1] == 0 && part[3][2] == 0 && part[3][3] == 0;
        }
        int index = sc.nextInt();
        index--;
        byte[][] temp = new byte[P_ROW][P_COL];
        boolean isDown = false;
        for (int i = 3; i < ROW; i++) {
            for (int j = index; j < index + 4; j++) {
                temp[3][j - index] = map[i][j];
                temp[2][j - index] = map[i - 1][j];
                temp[1][j - index] = map[i - 2][j];
                temp[0][j - index] = map[i - 3][j];
            }
            if (!canMerge(part, temp)) {
                isDown = true;
                for (int j = index; j < index + 4; j++) {
                    map[i - 1][j] += part[3][j - index];
                    map[i - 2][j] += part[2][j - index];
                    map[i - 3][j] += part[1][j - index];
                    map[i - 4][j] += part[0][j - index];
                }
                break;
            }
        }
        if (!isDown) {
            for (int j = index; j < index + 4; j++) {
                map[ROW - 1][j] += part[3][j - index];
                map[ROW - 2][j] += part[2][j - index];
                map[ROW - 3][j] += part[1][j - index];
                map[ROW - 4][j] += part[0][j - index];
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
