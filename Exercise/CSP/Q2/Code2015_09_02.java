import java.util.Scanner;

public class Code2015_09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int days = sc.nextInt();

        int month = 1, day = 0;
        boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        while (days-- > 0) {
            day++;
            boolean is31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                    || month == 12;
            boolean is30Days = month == 4 || month == 6 || month == 9 || month == 11;
            if (day == 29 && !isLeapYear && month == 2) {
                month++;
                day -= 28;
            } else if (day == 30 && isLeapYear && month == 2) {
                month++;
                day -= 29;
            } else if (day == 31 && is30Days) {
                month++;
                day -= 30;
            } else if (day == 32 && is31Days) {
                month++;
                day -= 31;
            }
        }
        System.out.printf("%d\n%d\n", month, day);

        sc.close();
    }
}
