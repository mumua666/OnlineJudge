import java.util.Scanner;

public class P5728 {

    static int n;
    static int[] course1;
    static int[] course2;
    static int[] course3;
    static int[] courseSum;

    public static boolean isSame(int i, int j) {
        boolean isSame = Math.abs(course1[i] - course1[j]) <= 5
                && Math.abs(course2[i] - course2[j]) <= 5
                && Math.abs(course3[i] - course3[j]) <= 5
                && Math.abs(courseSum[i] - courseSum[j]) <= 10;
        return isSame;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        course1 = new int[n];
        course2 = new int[n];
        course3 = new int[n];
        courseSum = new int[n];

        for (int i = 0; i < n; i++) {
            course1[i] = sc.nextInt();
            course2[i] = sc.nextInt();
            course3[i] = sc.nextInt();
            courseSum[i] = course1[i] + course2[i] + course3[i];
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSame(i, j)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
