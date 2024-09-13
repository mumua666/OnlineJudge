import java.util.Scanner;

public class L1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b - 16);
        System.out.println(a + b - 3);
        System.out.println(a + b - 1);
        System.out.println(a + b);
        sc.close();
    }
}