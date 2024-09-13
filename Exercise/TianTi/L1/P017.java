import java.util.Scanner;

public class P017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        boolean isMinusNum = false;
        if (numStr.charAt(0) == '-') {
            isMinusNum = true;
            numStr = numStr.substring(1);
        }
        boolean isEvenNum = false;
        int lastNum = numStr.charAt(numStr.length() - 1) - '0';
        if (lastNum % 2 == 0) {
            isEvenNum = true;
        }
        int cnt2 = 0;
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '2') {
                cnt2++;
            }
        }
        double factor = cnt2 * 1.0 / numStr.length();
        if (isMinusNum) {
            factor *= 1.5;
        }
        if (isEvenNum) {
            factor *= 2;
        }
        System.out.printf("%.2f%%\n", factor * 100);
        sc.close();
    }
}