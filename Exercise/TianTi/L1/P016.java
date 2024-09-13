import java.util.Scanner;

public class P016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isAllPass = true;
        int[] weights = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
        int[] maps = { 1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
        while (n-- > 0) {
            String line = sc.next();
            int sum = 0;
            for (int i = 0; i < line.length() - 1; i++) {
                sum += weights[i] * (line.charAt(i) - '0');
            }
            int mod = sum % 11;
            int last = line.charAt(line.length() - 1);
            last = last == 'X' ? 10 : last - '0';
            if (maps[mod] != last) {
                isAllPass = false;
                System.out.println(line);
            }
        }
        if (isAllPass) {
            System.out.println("All passed");
        }
        sc.close();
    }
}