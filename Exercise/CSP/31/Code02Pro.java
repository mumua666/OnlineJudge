import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code02Pro {

    static class Operation {
        int type;
        double operation;

        public Operation(int type, double operation) {
            this.type = type;
            this.operation = operation;
        }
    }

    static class Point {

        int start, end;
        double x, y;

        public Point(int start, int end, double x, double y) {
            this.start = start;
            this.end = end;
            this.x = x;
            this.y = y;
        }

        public void operationAll(List<Operation> opList) {
            double linearOp = 1;
            double nonLinearOp = 0;
            for (int i = start; i <= end; i++) {
                Operation op = opList.get(i - 1);
                if (op.type == 1) {
                    linearOp *= op.operation;
                } else {
                    nonLinearOp += op.operation;
                }
            }
            this.x *= linearOp;
            this.y *= linearOp;

            double x = this.x;
            double y = this.y;
            double o = nonLinearOp;
            this.x = x * Math.cos(o) - y * Math.sin(o);
            this.y = x * Math.sin(o) + y * Math.cos(o);

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

        List<Operation> opList = new ArrayList<>();
        List<Point> points = new ArrayList<>();
        int type;
        double operation;
        for (int i = 0; i < n; i++) {
            type = sc.nextInt();
            operation = sc.nextDouble();
            Operation op = new Operation(type, operation);
            opList.add(op);
        }

        int start, end;
        double x, y;
        for (int i = 0; i < m; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p = new Point(start, end, x, y);
            points.add(p);
        }

        for (Point p : points) {
            p.operationAll(opList);
            System.out.println(p);
        }

        sc.close();
    }
}
