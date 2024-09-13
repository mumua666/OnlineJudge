import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E05 {

    public static Map<Integer, Integer> labelMap(int[][] map) {
        Map<Integer, Integer> labeledMap = new HashMap<>();
        int cnt = 2;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    labeledMap.put(cnt, label(map, i, j, cnt++));
                }
            }
        }
        return labeledMap;
    }

    public static int label(int[][] map, int x, int y, int num) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length || map[x][y] != 1) {
            return 0;
        }
        map[x][y] = num;
        return 1 +
                label(map, x - 1, y, num) +
                label(map, x, y - 1, num) +
                label(map, x + 1, y, num) +
                label(map, x, y + 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map2[i][j] = sc.nextInt();
            }
        }

        Map<Integer, Integer> labeledMap1 = labelMap(map1);
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    int cnt = labeledMap1.getOrDefault(map1[i][j], 0);
                    max1 = max1 > cnt ? max1 : cnt;
                }
            }
        }

        Map<Integer, Integer> labeledMap2 = labelMap(map2);
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    int cnt = labeledMap2.getOrDefault(map2[i][j], 0);
                    max2 = max2 > cnt ? max2 : cnt;
                }
            }
        }

        System.out.println(max1 + max2);

        sc.close();
    }
}