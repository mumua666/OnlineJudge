import java.util.Scanner;

public class P1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        while (sc.hasNextLine()) {
            line += sc.nextLine();
        }
        int indexOfE = line.indexOf("E");
        String validStr = line.substring(0, indexOfE);

        // 11
        int cntA = 0, cntB = 0;
        for (int i = 0; i < validStr.length(); i++) {
            if (validStr.charAt(i) == 'W') {
                cntA++;
            } else {
                cntB++;
            }
            boolean isEnd = (cntA >= 11 || cntB >= 11) && Math.abs(cntA - cntB) >= 2;
            if (isEnd) {
                System.out.println(cntA + ":" + cntB);
                cntA = 0;
                cntB = 0;
            }
        }
        System.out.println(cntA + ":" + cntB);
        System.out.println();

        // 21
        cntA = 0;
        cntB = 0;
        for (int i = 0; i < validStr.length(); i++) {
            if (validStr.charAt(i) == 'W') {
                cntA++;
            } else {
                cntB++;
            }
            boolean isEnd = (cntA >= 21 || cntB >= 21) && Math.abs(cntA - cntB) >= 2;
            if (isEnd) {
                System.out.println(cntA + ":" + cntB);
                cntA = 0;
                cntB = 0;
            }
        }
        System.out.println(cntA + ":" + cntB);

        sc.close();
    }
}
