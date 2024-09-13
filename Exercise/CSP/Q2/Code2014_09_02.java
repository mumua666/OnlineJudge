import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code2014_09_02 {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Rectangle {
        Point p1, p2;
        Rectangle paddingRectangle;

        public Rectangle(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public void addPadding(int x1, int y1, int x2, int y2) {
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            this.paddingRectangle = new Rectangle(p1, p2);
        }

        public int calculateSquare(Rectangle r) {

            Point p;

            p = r.p1;
            int x1 = p1.x > p.x ? p1.x : p.x;
            int y1 = p1.y > p.y ? p1.y : p.y;

            p = r.p2;
            int x2 = p2.x < p.x ? p2.x : p.x;
            int y2 = p2.y < p.y ? p2.y : p.y;

            int w = x2 - x1;
            w = w > 0 ? w : 0;
            int h = y2 - y1;
            h = h > 0 ? h : 0;

            int paddingSquare = w * h;
            if (paddingSquare != 0) {
                addPadding(x1, y1, x2, y2);
            }

            return paddingSquare;
        }

        public int calculateSquareAll(List<Rectangle> list) {
            int square = (p2.x - p1.x) * (p2.y - p1.y);
            for (Rectangle r : list) {
                square -= calculateSquare(r);
                if (r.paddingRectangle != null) {
                    square += calculateSquare(r.paddingRectangle);
                }
            }
            return square;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Rectangle> rectangleList = new ArrayList<>();

        int x1, y1, x2, y2;
        int square = 0;
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Rectangle rectangle = new Rectangle(p1, p2);
            square += rectangle.calculateSquareAll(rectangleList);
            rectangleList.add(rectangle);
        }

        System.out.println(square);
        sc.close();
    }
}