import java.util.Scanner;

public class P1563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] direction = new int[n];
        String[] name = new String[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            direction[i] = sc.nextInt();
            name[i] = sc.next();
        }

        int cmd, step;
        while (m-- > 0) {
            cmd = sc.nextInt();
            step = sc.nextInt();
            if (direction[index] == cmd) {
                index = (index - step + n) % n;
            } else {
                index = (index + step + n) % n;
            }
        }
        System.out.println(name[index]);

        sc.close();
    }
}