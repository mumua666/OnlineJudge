import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum - (m - 1) * n);
        sc.close();
    }
}