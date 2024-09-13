import java.util.Scanner;

public class P032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ch = sc.next();
        sc.nextLine();
        String line = sc.nextLine();
        if (n <= line.length()) {
            System.out.println(line.substring(line.length() - n));
        } else {
            String res = "";
            int diff = n - line.length();
            while (diff-- > 0) {
                res += ch;
            }
            System.out.println(res + line);
        }
        sc.close();
    }
}