import java.util.Scanner;

public class L1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.next();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k != n && k != m) {
            System.out.printf("wang le zhao mai %s de\n", x);
        } else if (k != n) {
            System.out.printf("kan dao le mai %s de\n", x);
        } else {
            System.out.printf("mei you mai %s de\n", x);
        }
        sc.close();
    }
}
