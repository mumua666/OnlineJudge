import java.util.Scanner;

public class P028 {

    public static String isPrime(int num) {
        if (num == 1) {
            return "No";
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(isPrime(sc.nextInt()));
        }
        sc.close();
    }
}