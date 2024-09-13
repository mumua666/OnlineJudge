import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Code02ProProPro {

    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        StreamTokenizer sc = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        sc.nextToken();
        int n = (int) sc.nval;
        sc.nextToken();
        int m = (int) sc.nval;

        double[] linearOpArr = new double[n];
        double[] nonLinearOpArr = new double[n];
        int type;
        double operation;
        double linearOp = 1;
        double nonLinearOp = 0;
        for (int i = 0; i < n; i++) {
            sc.nextToken();
            type = (int) sc.nval;
            sc.nextToken();
            operation = sc.nval;
            if (type == 1) {
                linearOp *= operation;
            } else {
                nonLinearOp += operation;
            }
            linearOpArr[i] = linearOp;
            nonLinearOpArr[i] = nonLinearOp;
        }

        int start, end;
        double x, y;
        // double[] pointXArr = new double[m];
        // double[] pointYArr = new double[m];
        for (int i = 0; i < m; i++) {
            sc.nextToken();
            start = (int) sc.nval;
            sc.nextToken();
            end = (int) sc.nval;
            sc.nextToken();
            x = sc.nval;
            sc.nextToken();
            y = sc.nval;
            if (start == 1) {
                linearOp = linearOpArr[end - 1];
                nonLinearOp = nonLinearOpArr[end - 1];
            } else {
                linearOp = linearOpArr[end - 1] / linearOpArr[start - 2];
                nonLinearOp = nonLinearOpArr[end - 1] - nonLinearOpArr[start - 2];
                nonLinearOp = nonLinearOp % (Math.PI * 2);
            }
            x *= linearOp;
            y *= linearOp;
            double tempX = x;
            double tempY = y;
            x = tempX * Math.cos(nonLinearOp) - tempY * Math.sin(nonLinearOp);
            y = tempX * Math.sin(nonLinearOp) + tempY * Math.cos(nonLinearOp);
            System.out.println(x + " " + y);
        }

        // for (int i = 0; i < m; i++) {
        // System.out.printf("%.3f %.3f\n", pointXArr[i], pointYArr[i]);
        // }

        // sc.close();
    }
}
