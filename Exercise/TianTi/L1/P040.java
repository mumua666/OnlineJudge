import java.util.Scanner;

public class P040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String type = sc.next();
            double height = sc.nextDouble();
            if (type.equals("M")) {
                System.out.printf("%.2f\n", height / 1.09);
            } else {
                System.out.printf("%.2f\n", height * 1.09);
            }
        }
        sc.close();
    }
}