import java.util.Scanner;

public class P1720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double f0 = Math.sqrt(5);
        double f1 = Math.pow((1 + f0) / 2.0, n);
        double f2 = Math.pow((1 - f0) / 2.0, n);
        double F = (f1 - f2) / f0;

        System.out.printf("%.2f\n", F);

        sc.close();
    }
}