import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1012 {

    /**
     * Java String 为值传递
     */
    static class MyComp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int diff = Math.abs(o1.length() - o2.length());
            String offStr = "";
            while (diff-- > 0) {
                offStr += "0";
            }
            if (o1.length() < o2.length()) {
                o1 += offStr;
            } else {
                o2 += offStr;
            }

            for (int i = 0; i < o1.length(); i++) {
                if (o1.charAt(i) != o2.charAt(i)) {
                    return o2.charAt(i) - o1.charAt(i);
                }
            }
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] numStrs = new String[n];
        for (int i = 0; i < n; i++) {
            numStrs[i] = sc.next();
        }
        Arrays.sort(numStrs, new MyComp());
        for (String numStr : numStrs) {
            System.out.print(numStr);
        }
        System.out.println();
        sc.close();
    }
}