import java.util.Arrays;
import java.util.Scanner;

public class P5143 {

    static class Point implements Comparable<Point> {
        int x, y, z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance(Point p) {
            int diffX = (x - p.x) * (x - p.x);
            int diffY = (y - p.y) * (y - p.y);
            int diffZ = (z - p.z) * (z - p.z);
            return Math.sqrt(diffX + diffY + diffZ);
        }

        @Override
        public int compareTo(Point o) {
            return z - o.z;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            points[i] = new Point(x, y, z);
        }
        Arrays.sort(points);
        double distance = 0;
        Point cur = points[0];
        for (int i = 1; i < points.length; i++) {
            if (cur.z != points[i].z) {
                distance += cur.distance(points[i]);
                cur = points[i];
            }
        }
        System.out.printf("%.3f\n", distance);
        sc.close();
    }
}