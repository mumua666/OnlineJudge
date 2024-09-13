import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5737 {

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startYear = sc.nextInt();
        int endYear = sc.nextInt();
        int cntLeapYear = 0;
        List<Integer> leapYearList = new ArrayList<>();
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                cntLeapYear++;
                leapYearList.add(year);
            }
        }

        System.out.println(cntLeapYear);
        for (Integer year : leapYearList) {
            System.out.print(year + " ");
        }
        System.out.println();
        sc.close();
    }
}
