import java.util.Scanner;

public class P029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        System.out.printf("%.1f\n", (h - 100) * 0.9 * 2);
        sc.close();
    }
}