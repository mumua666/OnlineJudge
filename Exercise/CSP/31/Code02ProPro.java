import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code02ProPro {

    static class Operation {
        int type;
        double linearOp, nonLinearOp;

        public Operation(int type, double linearOp, double nonLinearOp) {
            this.type = type;
            this.linearOp = linearOp;
            this.nonLinearOp = nonLinearOp;
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

            Operation endOp = opList.get(end - 1);

            Operation startOp;
            if (start == 1) {
                startOp = new Operation(1, 1, 0);
            } else {
                startOp = opList.get(start - 2);
            }
            double linearOp = endOp.linearOp / startOp.linearOp;
            double nonLinearOp = endOp.nonLinearOp - startOp.nonLinearOp;

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
        double linearOp = 1;
        double nonLinearOp = 0;
        for (int i = 0; i < n; i++) {
            type = sc.nextInt();
            operation = sc.nextDouble();
            if (type == 1) {
                linearOp *= operation;
            } else {
                nonLinearOp += operation;
            }
            Operation op = new Operation(type, linearOp, nonLinearOp);
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
