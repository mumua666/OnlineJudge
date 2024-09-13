package Code_2023_7_26;

import java.util.Scanner;

public class P1320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numStr;
        int count = 0, digit;
        boolean hasShow = false, isOne = false;
        while (sc.hasNextLine()) {
            numStr = sc.nextLine();
            if (!hasShow) {
                System.out.print(numStr.length() + " ");
                hasShow = true;
            }

            for (int i = 0; i < numStr.length(); i++) {
                digit = numStr.charAt(i) - '0';
                if (digit == 1) {
                    if (!isOne) {
                        isOne = true;
                        System.out.print(count + " ");
                        count = 1;
                    } else {
                        count++;
                    }
                } else {
                    if (isOne) {
                        isOne = false;
                        System.out.print(count + " ");
                        count = 1;
                    } else {
                        count++;
                    }
                }
            }
        }
        System.out.print(count + " ");

        sc.close();
    }
}
