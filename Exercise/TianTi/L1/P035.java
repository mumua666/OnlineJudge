import java.util.Scanner;

public class P035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secondName = null;
        String fourteenthName = null;
        int cnt = 0;
        while (sc.hasNext()) {
            cnt++;
            String name = sc.next();
            if (name.equals(".")) {
                break;
            }
            if (cnt == 2) {
                secondName = name;
            }
            if (cnt == 14) {
                fourteenthName = name;
            }
        }
        if (secondName == null && fourteenthName == null) {
            System.out.println("Momo... No one is for you ...");
        } else if (fourteenthName == null) {
            System.out.printf("%s is the only one for you...\n", secondName);
        } else {
            System.out.printf("%s and %s are inviting you to dinner...\n", secondName, fourteenthName);
        }

        sc.close();
    }
}