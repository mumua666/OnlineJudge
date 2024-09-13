package Code_2023_7_30;

import java.util.Scanner;

public class P1423 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double sumDistance = 0, step = 2;
        int stepCnt = 0;

        while (sumDistance < distance) {
            stepCnt++;
            sumDistance += step;
            step *= 0.98;
        }

        System.out.println(stepCnt);

        sc.close();
    }
}
