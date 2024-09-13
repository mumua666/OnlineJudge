import java.util.Scanner;

public class P025 {

    public static boolean isMeet(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        int num = Integer.parseInt(str);
        if (!Integer.toString(num).equals(str)) {
            return false;
        }
        return num >= 1 && num <= 1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numStrs = line.split(" ");
        boolean isMeetA = isMeet(numStrs[0]);
        boolean isMeetB = isMeet(numStrs[1]);
        if (isMeetA && isMeetB) {
            int num1 = Integer.parseInt(numStrs[0]);
            int num2 = Integer.parseInt(numStrs[1]);
            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        } else if (isMeetA) {
            int num1 = Integer.parseInt(numStrs[0]);
            System.out.printf("%d + ? = ?\n", num1);
        } else if (isMeetB) {
            int num2 = Integer.parseInt(numStrs[1]);
            System.out.printf("? + %d = ?\n", num2);
        } else {
            System.out.printf("? + ? = ?\n");
        }
        sc.close();
    }
}