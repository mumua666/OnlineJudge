import java.util.Scanner;

public class Code2019_12_01 {

    public static boolean isSkip(int num) {
        if (num / 7 * 7 == num) {
            return true;
        } else {
            while (num > 0) {
                if (num % 10 == 7) {
                    return true;
                }
                num /= 10;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int PEOPLE_NUM = 4;
        int[] people = new int[PEOPLE_NUM + 1];

        for (int i = 1; i <= PEOPLE_NUM; i++) {
            people[i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            if (isSkip(i)) {
                people[i % PEOPLE_NUM]++;
                n++;
            }
        }

        for (int i = 1; i < PEOPLE_NUM; i++) {
            System.out.println(people[i]);
        }
        System.out.println(people[0]);

        sc.close();
    }
}
