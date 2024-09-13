import java.util.Scanner;

public class P037 {

    public static String getNumStr(int num) {
        return num > 0 ? "" + num : "(" + num + ")";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b == 0) {
            System.out.printf("%d/0=Error\n", a);
        } else {
            System.out.printf("%d/%s=%.2f\n", a, getNumStr(b), a * 1.0 / b);
        }

        sc.close();
    }
}