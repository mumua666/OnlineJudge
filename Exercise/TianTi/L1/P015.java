import java.util.Scanner;

public class P015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int col = n % 2 == 0 ? n / 2 : n / 2 + 1;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
        sc.close();
    }
}