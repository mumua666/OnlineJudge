import java.util.Scanner;

public class P031 {

    public static String getRes(int height, int weight) {
        double res = (height - 100) * 0.9 * 2;
        double diff = weight - res;
        if (Math.abs(diff) < res * 0.1) {
            return "You are wan mei!";
        }
        return diff > 0 ? "You are tai pang le!" : "You are tai shou le!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            System.out.println(getRes(height, weight));
        }
        sc.close();
    }
}