import java.util.Scanner;

public class Code2020_06_01 {

    static class Point {
        int x, y;
        String type;

        public Point(int x, int y, String type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }
    }

    static class Line {
        int b0, x0, y0;

        public Line(int b0, int x0, int y0) {
            this.b0 = b0;
            this.x0 = x0;
            this.y0 = y0;
        }

        public boolean canSegement(Point[] points) {
            String typeA = "a", typeB = "b";
            int x, y, result;
            for (Point p : points) {
                x = p.x;
                y = p.y;
                result = b0 + x0 * x + y0 * y;
                if (result < 0) {
                    typeA = p.type;
                } else if (result > 0) {
                    typeB = p.type;
                } else {
                    typeA = typeB;
                }
                if (typeA.equals(typeB)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] points = new Point[n];
        boolean[] canSegement = new boolean[m];

        int x, y;
        String type;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            type = sc.nextLine();
            points[i] = new Point(x, y, type);
        }

        int b0, x0, y0;
        for (int i = 0; i < m; i++) {
            b0 = sc.nextInt();
            x0 = sc.nextInt();
            y0 = sc.nextInt();
            Line line = new Line(b0, x0, y0);
            canSegement[i] = line.canSegement(points);
        }

        for (int i = 0; i < m; i++) {
            if (canSegement[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}