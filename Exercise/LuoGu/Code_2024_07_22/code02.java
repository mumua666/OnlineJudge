import java.util.Scanner;

public class code02 {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getDis2(Point p) {
            int diffX = p.x - x;
            int diffY = p.y - y;
            return diffX * diffX + diffY * diffY;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o == null || !(o instanceof Point)) {
                return false;
            }
            Point op = (Point) o;
            return op.x == x && op.y == y;
        }

        @Override
        public int hashCode() {
            int res = 0;
            res += res * 31 + Integer.hashCode(x);
            res += res * 31 + Integer.hashCode(y);
            return res;
        }
    }

    public int maximumDetonation(int[][] bombs) {

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}