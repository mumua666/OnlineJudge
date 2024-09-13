import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 70 Time Limit Error
 */
public class Code2022_06_02Pro {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int result = 0;
            result = 31 * result + Integer.valueOf(x).hashCode();
            result = 31 * result + Integer.valueOf(y).hashCode();
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Point)) {
                return false;
            } else {
                Point obj = (Point) o;
                return obj.x == x && obj.y == y;
            }
        }
    }

    static Set<Point> greenMap = new HashSet<>();
    static Set<Point> treasureMap = new HashSet<>();
    static int n, L, S;

    static boolean isSame(int x, int y) {
        for (int i = 0; i <= S; i++) {
            for (int j = 0; j <= S; j++) {
                Point greenMapPoint = new Point(i + x, j + y);
                Point treasureMapPoint = new Point(i, j);
                boolean isNotSame = greenMap.contains(greenMapPoint) ^ treasureMap.contains(treasureMapPoint);
                if (isNotSame) {
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
        greenMap = new HashSet<>();
        treasureMap = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point p = new Point(x, y);
            greenMap.add(p);
        }
        for (int i = S; i >= 0; i--) {
            for (int j = 0; j <= S; j++) {
                int value = sc.nextInt();
                if (value == 1) {
                    Point p = new Point(i, j);
                    treasureMap.add(p);
                }
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