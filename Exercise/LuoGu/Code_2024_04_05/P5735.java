import java.util.Scanner;

public class P5735 {

    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Point p) {
            double dx = this.x - p.x;
            double dy = this.y - p.y;
            double distanceSqr = dx * dx + dy * dy;
            return Math.sqrt(distanceSqr);
        }
    }

    static class Triangle {
        Point p1, p2, p3;

        public Triangle(Point[] ps) {
            this.p1 = ps[0];
            this.p2 = ps[1];
            this.p3 = ps[2];
        }

        public double getCircle() {
            return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 3;
        double x, y;
        Point[] ps = new Point[times];
        while (times-- > 0) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            ps[times] = new Point(x, y);
        }
        Triangle triangle = new Triangle(ps);
        double circle = triangle.getCircle();
        System.out.printf("%.2f\n", circle);
        sc.close();
    }
}
