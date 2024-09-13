import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 2 || b == 1) {
            System.out.println("-");
        } else if (a == 0) {
            System.out.println("biii");
        } else if (a == 1) {
            System.out.println("dudu");
        }

        if (a == 0 || a == 2) {
            System.out.println("stop");
        } else if (a == 1) {
            System.out.println("move");
        }
        sc.close();
    }
}