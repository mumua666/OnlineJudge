import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code01 {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void operation(Point p) {
            this.x += p.x;
            this.y += p.y;
        }

        @Override
        public String toString() {
            return this.x + " " + this.y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Point> operationPoints = new ArrayList<>();
        List<Point> points = new ArrayList<>();
        int x, y;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            Point p = new Point(x, y);
            operationPoints.add(p);
        }

        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            Point p = new Point(x, y);
            points.add(p);
        }

        for (Point p : points) {
            for (Point op : operationPoints) {
                p.operation(op);
            }
            System.out.println(p);
        }

        sc.close();
    }
}
