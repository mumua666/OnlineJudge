import java.util.Scanner;

public class L1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = sc.nextInt();
        while (n-- > 0) {
            int startIndex = sc.nextInt();
            int endIndex = sc.nextInt();
            String startStr = sc.next();
            String endStr = sc.next();
            String cutStr = line.substring(startIndex - 1, endIndex);
            line = line.substring(0, startIndex - 1) + line.substring(endIndex);
            boolean canInsert = line.indexOf(startStr + endStr) != -1;
            if (canInsert) {
                line = line.replaceFirst(startStr + endStr, startStr + cutStr + endStr);
            } else {
                line = line + cutStr;
            }
        }
        System.out.println(line);

        sc.close();
    }
}
