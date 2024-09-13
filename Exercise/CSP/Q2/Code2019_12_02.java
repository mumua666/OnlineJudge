import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Code2019_12_02 {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int result = 0;
            result += result * 31 + Integer.valueOf(x).hashCode();
            result += result * 31 + Integer.valueOf(y).hashCode();
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (o == null || !(o instanceof Point)) {
                return false;
            } else {
                Point obj = (Point) o;
                return obj.x == x && obj.y == y;
            }
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x, y;
        Map<Point, Integer> pointMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            Point p = new Point(x, y);
            pointMap.put(p, -1);
        }

        pointMap.forEach((k, v) -> {
            Point top = new Point(k.x, k.y + 1);
            Point bottom = new Point(k.x, k.y - 1);
            Point left = new Point(k.x - 1, k.y);
            Point right = new Point(k.x + 1, k.y);

            boolean isTrashPoint = pointMap.containsKey(top) && pointMap.containsKey(bottom)
                    && pointMap.containsKey(left) && pointMap.containsKey(right);
            if (isTrashPoint) {
                int type = 0;
                Point topLeft = new Point(k.x - 1, k.y + 1);
                Point topRight = new Point(k.x + 1, k.y + 1);
                Point bottomLeft = new Point(k.x - 1, k.y - 1);
                Point bottomRight = new Point(k.x + 1, k.y - 1);

                if (pointMap.containsKey(topLeft)) {
                    type++;
                }
                if (pointMap.containsKey(topRight)) {
                    type++;
                }
                if (pointMap.containsKey(bottomLeft)) {
                    type++;
                }
                if (pointMap.containsKey(bottomRight)) {
                    type++;
                }
                pointMap.put(k, type);
            }
        });

        // pointMap.forEach((k, v) -> {
        // System.out.println(k + "-->" + v);
        // });

        Map<Integer, Long> countMap = pointMap.values().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // countMap.forEach((k, v) -> {
        // System.out.println(k + "-->" + v);
        // });

        List<Integer> countList = Arrays.asList(0, 1, 2, 3, 4);

        for (Integer key : countList) {
            long count = countMap.get(key) != null ? countMap.get(key) : 0;
            System.out.println(count);
        }

        sc.close();
    }

}