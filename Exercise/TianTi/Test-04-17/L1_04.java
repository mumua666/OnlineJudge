import java.util.Scanner;

public class L1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a * b == c) {
                System.out.println("Lv Yan");
            } else if (a + b == c) {
                System.out.println("Tu Dou");
            } else {
                System.out.println("zhe du shi sha ya!");
            }
        }

        sc.close();
    }
}
