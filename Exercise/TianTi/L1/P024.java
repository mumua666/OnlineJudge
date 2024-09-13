import java.util.Scanner;

public class P024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n += 2;
        while (n > 7) {
            n -= 7;
        }
        System.out.println(n);
        sc.close();
    }
}