package Code_2023_7_30;

import java.util.Scanner;

public class P1321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String boyStart = "", girlStart = "";
        int boyCnt = 0, girlCnt = 0;
        String BOY = "boy", GIRL = "girl";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '.') {
                if (BOY.contains("" + ch)) {
                    girlStart = "";
                    if (BOY.contains(boyStart + ch)) {
                        if (boyStart.length() == 0) {
                            boyCnt++;
                        }
                        boyStart += ch;
                    } else {
                        boyCnt++;
                        boyStart = "" + ch;
                    }
                } else {
                    boyStart = "";
                    if (GIRL.contains(girlStart + ch)) {
                        if (girlStart.length() == 0) {
                            girlCnt++;
                        }
                        girlStart += ch;
                    } else {
                        girlCnt++;
                        girlStart = "" + ch;
                    }
                }
            }
        }
        System.out.printf("%d\n%d\n", boyCnt, girlCnt);
        sc.close();
    }
}
