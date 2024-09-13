import java.util.Scanner;

public class P007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strList = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu" };
        String numStr = sc.next();
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (ch == '-') {
                System.out.print("fu ");
            } else {
                System.out.print(strList[ch - '0']);
                if (i != numStr.length() - 1) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
}