package Code_2023_7_23;

import java.util.Scanner;

public class P1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int MAX_SIZE = 2000001;
        boolean[] isOn = new boolean[MAX_SIZE];

        double a;
        int t;
        int index;

        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                index = (int) (j * a);
                isOn[index] = !isOn[index];
            }
        }

        for (int i = 1; i < MAX_SIZE; i++) {
            if (isOn[i]) {
                System.out.println(i);
                break;
            }
        }

        sc.close();

    }
}