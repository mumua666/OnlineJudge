import java.util.Scanner;

public class Code2017_09_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        cnt += n / 50 * 7;
        n -= n / 50 * 50;
        cnt += n / 30 * 4;
        n -= n / 30 * 30;
        cnt += n / 10;
        System.out.println(cnt);
        sc.close();
    }
}
