package Code_2023_7_21;

import java.util.Scanner;

public class P1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 12;
        int totalSave = 0, save, balance = 0, plan, remainder;
        boolean isRisk = false;
        int minRiskMonth = 0;
        for (int i = 0; i < n; i++) {
            plan = sc.nextInt();
            if (isRisk) {
                continue;
            }
            remainder = balance + 300 - plan;
            if (remainder < 0) {
                isRisk = true;
                minRiskMonth = i + 1;
            }
            save = remainder / 100 * 100;
            totalSave += save;
            balance = remainder - save;
        }

        if (isRisk) {
            System.out.println(-minRiskMonth);
        } else {
            System.out.println((int) (totalSave * 1.2 + balance));
        }

        sc.close();
    }
}