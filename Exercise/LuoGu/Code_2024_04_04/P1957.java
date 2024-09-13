import java.util.Scanner;

public class P1957 {

    public static int getLen(int num) {
        int len = num <= 0 ? 1 : 0;
        num = Math.abs(num);
        while (num > 0) {
            len++;
            num /= 10;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String curOp = "";
        int op1, op2, res;
        while (n-- > 0) {
            String line = sc.nextLine();
            String[] strs = line.split(" ");
            if (strs.length == 3) {
                curOp = strs[0];
                op1 = Integer.valueOf(strs[1]);
                op2 = Integer.valueOf(strs[2]);
            } else {
                op1 = Integer.valueOf(strs[0]);
                op2 = Integer.valueOf(strs[1]);
            }

            switch (curOp) {
                case "a":
                    res = op1 + op2;
                    System.out.printf("%d+%d=%d\n", op1, op2, res);
                    System.out.println(getLen(op1) + getLen(op2) + getLen(res) + 2);
                    break;
                case "b":
                    res = op1 - op2;
                    System.out.printf("%d-%d=%d\n", op1, op2, res);
                    System.out.println(getLen(op1) + getLen(op2) + getLen(res) + 2);
                    break;
                case "c":
                    res = op1 * op2;
                    System.out.printf("%d*%d=%d\n", op1, op2, res);
                    System.out.println(getLen(op1) + getLen(op2) + getLen(res) + 2);
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}
