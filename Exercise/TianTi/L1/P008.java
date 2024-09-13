import java.util.Scanner;

public class P008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
            cnt++;
            System.out.printf("%5d", i);
            if (cnt % 5 == 0) {
                System.out.println();
            }
        }
        if (cnt % 5 != 0) {
            System.out.println();
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}