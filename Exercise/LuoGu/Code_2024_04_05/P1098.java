import java.util.Scanner;

public class P1098 {

    static int p1;
    static int p2;
    static int p3;

    public static String getStr(String startStr, String endStr) {
        char startCh = startStr.charAt(startStr.length() - 1);
        char endCh = endStr.charAt(0);
        if (startCh + 1 == endCh) {
            return startStr;
        } else if (startCh >= endCh) {
            return startStr + "-";
        } else {
            String gapStr = "";
            for (char ch = (char) (startCh + 1); ch < endCh; ch++) {
                for (int i = 0; i < p2; i++) {
                    gapStr += p1 == 3 ? "*" : ch;
                }
            }
            if (!(startCh >= '0' && startCh <= '9')) {
                if (p1 == 1) {
                    gapStr = gapStr.toLowerCase();
                } else if (p1 == 2) {
                    gapStr = gapStr.toUpperCase();
                }
            }
            if (p3 == 2) {
                String gapStrNew = "";
                for (int i = gapStr.length() - 1; i >= 0; i--) {
                    gapStrNew += gapStr.charAt(i);
                }
                return startStr + gapStrNew;
            }
            return startStr + gapStr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        p1 = sc.nextInt();
        p2 = sc.nextInt();
        p3 = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] strs = line.split("-");
        String newLine = "";
        String curStr = "";
        String nextStr = "";
        for (int i = 0; i < strs.length - 1; i++) {
            curStr = strs[i];
            nextStr = strs[i + 1];
            newLine += getStr(curStr, nextStr);
        }
        newLine += nextStr;
        System.out.println(newLine);
        sc.close();
    }
}
