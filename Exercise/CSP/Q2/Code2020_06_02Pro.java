import java.util.Scanner;

public class Code2020_06_02Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] indexA = new int[a];
        int[] valueA = new int[a];

        int[] indexB = new int[b];
        int[] valueB = new int[b];

        for (int i = 0; i < a; i++) {
            indexA[i] = sc.nextInt();
            valueA[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            indexB[i] = sc.nextInt();
            valueB[i] = sc.nextInt();
        }

        int i = 0, j = 0;
        long sum = 0;
        while (true) {
            if (i == a && j == b) {
                break;
            }
            if (i < a && j < b) {
                if (indexA[i] < indexB[j]) {
                    i++;
                } else if (indexA[i] > indexB[j]) {
                    j++;
                } else {
                    sum += valueA[i] * valueB[j];
                    if (i < a) {
                        i++;
                    }
                    if (j < b) {
                        j++;
                    }
                }
            } else if (i == a) {
                j++;
            } else if (j == b) {
                i++;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}