import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1518 {

    static char[][] maps;
    static Map<String, Point> directionMap = new HashMap<>();

    static class Point {
        int x, y;
        int hashCode;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof Point)) {
                return false;
            }
            Point objPoint = (Point) obj;
            if (objPoint.x == x && objPoint.y == y) {
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (hashCode == 0) {
                hashCode = Integer.valueOf(x).hashCode();
                hashCode = 31 * hashCode + Integer.valueOf(y).hashCode();
            }
            return hashCode;
        }
    }

    static class Move {

        Point pos;
        String direction;

        public Move() {
        }

        public Move(Point pos) {
            this.pos = pos;
            direction = "up";
        }

        public void move(Point pos) {
            this.pos = new Point(pos.x + this.pos.x, pos.y + this.pos.y);
        }

        public void moveOrRotate() {
            Point movePoint = directionMap.get(direction);
            if (checkMove(movePoint)) {
                move(movePoint);
            } else {
                rorate();
            }
        }

        public String getNextDirection() {
            switch (direction) {
                case "up":
                    return "right";
                case "right":
                    return "down";
                case "down":
                    return "left";
                case "left":
                    return "up";
                default:
                    return "";
            }
        }

        public void rorate() {
            this.direction = getNextDirection();
        }

        public boolean checkMove(Point movePoint) {
            int x = pos.x + movePoint.x;
            int y = pos.y + movePoint.y;
            if (x < 0 || x >= 10 || y < 0 || y >= 10 || maps[x][y] == '*') {
                return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        maps = new char[10][10];
        // Set<Point> peopleMovedPoints = new HashSet<>();
        // Set<Point> cattleMovedPoints = new HashSet<>();
        Move people = new Move();
        Move cattle = new Move();
        for (int i = 0; i < 10; i++) {
            line = sc.nextLine();
            for (int j = 0; j < 10; j++) {
                char ch = line.charAt(j);
                if (ch == 'C') {
                    cattle = new Move(new Point(i, j));
                    // cattleMovedPoints.add(cattle.pos);
                } else if (ch == 'F') {
                    people = new Move(new Point(i, j));
                    // peopleMovedPoints.add(people.pos);
                }
                maps[i][j] = ch == '*' ? '*' : '.';
            }
        }

        directionMap.put("up", new Point(-1, 0));
        directionMap.put("right", new Point(0, 1));
        directionMap.put("down", new Point(1, 0));
        directionMap.put("left", new Point(0, -1));
        int cnt = 0;
        while (true) {
            people.moveOrRotate();
            cattle.moveOrRotate();
            cnt++;
            if (people.pos.equals(cattle.pos)) {
                break;
            }
            if (cnt > 10000) {
                cnt = -1;
                break;
            }
            // peopleMovedPoints.add(people.pos);
            // cattleMovedPoints.add(cattle.pos);
        }

        cnt = cnt < 0 ? 0 : cnt;
        System.out.println(cnt);

        sc.close();
    }
}
