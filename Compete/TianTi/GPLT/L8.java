import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class L8 {

    public static boolean isMeetRow(int[][] map) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            numSet.clear();
            for (int j = 0; j < 9; j++) {
                if (numSet.contains(map[i][j])) {
                    return false;
                }
                numSet.add(map[i][j]);
            }
        }
        return true;
    }

    public static boolean isMeetCol(int[][] map) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            numSet.clear();
            for (int j = 0; j < 9; j++) {
                if (numSet.contains(map[j][i])) {
                    return false;
                }
                numSet.add(map[j][i]);
            }
        }
        return true;
    }

    public static boolean isMeetMap(int[][] map, int x, int y) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(map[x - 1][y - 1]);
        numSet.add(map[x - 1][y]);
        numSet.add(map[x - 1][y + 1]);

        numSet.add(map[x][y - 1]);
        numSet.add(map[x][y]);
        numSet.add(map[x][y + 1]);

        numSet.add(map[x + 1][y - 1]);
        numSet.add(map[x + 1][y]);
        numSet.add(map[x + 1][y + 1]);
        return numSet.size() == 9;
    }

    public static boolean isMeetAll(int[][] map) {
        if (!isMeetRow(map)) {
            return false;
        }
        if (!isMeetCol(map)) {
            return false;
        }
        for (int i = 1; i < 9; i += 3) {
            for (int j = 1; j < 9; j += 3) {
                if (!isMeetMap(map, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[9][9];
        while (n-- > 0) {
            boolean isMeet = true;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                    if (map[i][j] < 1 || map[i][j] > 9) {
                        isMeet = false;
                    }
                }
            }
            int res = isMeet && isMeetAll(map) ? 1 : 0;
            System.out.println(res);
        }
        sc.close();
    }
}