import java.util.Scanner;

public class P013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long cur = 1;
        for (int i = 1; i <= n; i++) {
            cur *= i;
            sum += cur;
        }
        System.out.println(sum);
        sc.close();
    }
}