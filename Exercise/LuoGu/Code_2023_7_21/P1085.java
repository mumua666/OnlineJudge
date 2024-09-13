package Code_2023_7_21;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7, classHours, outClassHours, maxIndex = 0;
        int[] arrSum = new int[n];

        for (int i = 0; i < n; i++) {
            classHours = sc.nextInt();
            outClassHours = sc.nextInt();
            arrSum[i] = classHours + outClassHours;
            maxIndex = arrSum[i] > arrSum[maxIndex] ? i : maxIndex;
        }

        if (arrSum[maxIndex] > 8) {
            System.out.println(maxIndex + 1);
        } else {
            System.out.println(0);
        }

        sc.close();

    }
}