import java.util.Scanner;

public class P019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limitA = sc.nextInt();
        int limitB = sc.nextInt();
        int n = sc.nextInt();
        boolean isEnd = false;
        int cntA = 0, cntB = 0;
        while (n-- > 0) {
            int aHan = sc.nextInt();
            int aHua = sc.nextInt();
            int bHan = sc.nextInt();
            int bHua = sc.nextInt();
            if (isEnd) {
                continue;
            }
            int sum = aHan + bHan;
            if (aHua == sum && bHua == sum || aHua != sum && bHua != sum) {
                continue;
            } else if (aHua == sum) {
                cntA++;
            } else if (bHua == sum) {
                cntB++;
            }
            if (cntA > limitA) {
                System.out.println("A");
                System.out.println(cntB);
                isEnd = true;
            } else if (cntB > limitB) {
                System.out.println("B");
                System.out.println(cntA);
            }
        }

        sc.close();
    }
}