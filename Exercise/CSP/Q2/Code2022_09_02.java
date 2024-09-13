import java.util.Scanner;

public class Code2022_09_02 {

    static int[] price;
    static int minPrice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        minPrice = sc.nextInt();
        price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        sc.close();
    }
}
