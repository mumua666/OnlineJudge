import java.util.Scanner;

public class P022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cntOdd = 0, cntEven = 0;
        while (n-- > 0) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                cntEven++;
            } else {
                cntOdd++;
            }
        }
        System.out.println(cntOdd + " " + cntEven);

        sc.close();
    }
}