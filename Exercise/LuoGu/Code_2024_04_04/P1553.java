import java.util.Scanner;
import java.util.regex.Pattern;

public class P1553 {

    public static long reverseNum(long num) {
        long reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }
        return reverseNum;
    }

    public static long[] reverseNums(String[] nums) {
        long num1 = Long.parseLong(nums[0]);
        long num2 = Long.parseLong(nums[1]);

        return new long[] { reverseNum(num1), reverseNum(num2) };
    }

    public static void reverseRealNum(String realNum, String delimiter) {
        String[] nums = realNum.split(Pattern.quote(delimiter));
        long[] reversedNums = reverseNums(nums);
        System.out.printf("%d%s%d\n", reversedNums[0], delimiter, reversedNums[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String realNum = sc.next();

        if (realNum.contains(".")) {
            reverseRealNum(realNum, ".");
        } else if (realNum.contains("/")) {
            reverseRealNum(realNum, "/");
        } else if (realNum.contains("%")) {
            String numStr = realNum.substring(0, realNum.length() - 1);
            long num = Long.valueOf(numStr);
            System.out.println(reverseNum(num) + "%");
        } else {
            long num = Long.valueOf(realNum);
            System.out.println(reverseNum(num));
        }

        sc.close();
    }
}
