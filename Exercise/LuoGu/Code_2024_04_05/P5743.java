import java.util.Scanner;

public class P5743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 1;
        while (n-- > 1) {
            res += 1;
            res *= 2;
        }
        System.out.println(res);

        sc.close();
    }
}
