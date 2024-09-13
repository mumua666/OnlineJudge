import java.util.Scanner;

public class P1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            nums[i] = sc.nextInt();
        }

        String express = "";
        for (int i = 0; i <= n; i++) {
            String str = "";
            String postffix = n - i == 1 ? "x" : n - i == 0 ? "" : "x^" + (n - i);
            if (nums[i] != 0) {
                if (i == 0) {
                    if (nums[i] == 1) {
                        str = "";
                    } else if (nums[i] == -1) {
                        str = "-";
                    } else if (nums[i] < 0) {
                        str = "-" + Math.abs(nums[i]);
                    } else if (nums[i] > 0) {
                        str = "" + nums[i];
                    }
                    express += str + postffix;
                } else if (i == n) {
                    if (nums[i] < 0) {
                        str = "-" + Math.abs(nums[i]);
                    } else if (nums[i] > 0) {
                        str = express.equals("") ? "" + nums[i] : "+" + nums[i];
                    }
                    express += str;
                } else {
                    if (nums[i] == 1) {
                        str = "+";
                    } else if (nums[i] == -1) {
                        str = "-";
                    } else if (nums[i] < 0) {
                        str = "-" + Math.abs(nums[i]);
                    } else if (nums[i] > 0) {
                        str = "+" + nums[i];
                    }
                    express += str + postffix;
                }
            }
        }
        System.out.println(express);
        sc.close();
    }
}
