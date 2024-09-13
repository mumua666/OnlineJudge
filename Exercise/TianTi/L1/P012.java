import java.util.Scanner;

public class P012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("2^%d = %d\n", n, 1 << n);
        sc.close();
    }
}