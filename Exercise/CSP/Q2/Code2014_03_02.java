import java.util.Scanner;
import java.util.Stack;

public class Code2014_03_02 {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Window {
        Point p1, p2;
        int num;

        public Window(Point p1, Point p2, int num) {
            this.p1 = p1;
            this.p2 = p2;
            this.num = num;
        }

        public boolean containsPoint(Point p) {
            return p.x >= p1.x && p.x <= p2.x && p.y >= p1.y && p.y <= p2.y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int x, y;
        Stack<Window> windowsStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            Point p1 = new Point(x, y);
            x = sc.nextInt();
            y = sc.nextInt();
            Point p2 = new Point(x, y);
            Window window = new Window(p1, p2, i + 1);
            windowsStack.push(window);
        }

        Stack<Window> windwosTempStack = new Stack<>();

        for (int i = 0; i < m; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            Point p = new Point(x, y);
            Window window;
            boolean isOn = false;
            while (!windowsStack.isEmpty()) {
                window = windowsStack.pop();
                windwosTempStack.push(window);
                if (window.containsPoint(p)) {
                    isOn = true;
                    System.out.println(window.num);
                    while (!windwosTempStack.isEmpty()) {
                        windowsStack.push(windwosTempStack.pop());
                    }
                    windowsStack.push(window);
                    break;
                }
            }
            if (!isOn) {
                System.out.println("IGNORED");
                while (!windwosTempStack.isEmpty()) {
                    windowsStack.push(windwosTempStack.pop());
                }
            }

        }

        sc.close();
    }
}
