import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> factorList = new ArrayList<>();
        int factor = 2;
        while (n != 1) {
            if (n % factor == 0) {
                n /= factor;
                factorList.add(factor);
            } else {
                factor++;
            }
        }
        System.out.println(factorList);
        sc.close();
    }
}