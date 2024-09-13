import java.util.Scanner;

public class Code2020_09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();

        int xl = sc.nextInt();
        int yd = sc.nextInt();
        int xr = sc.nextInt();
        int yu = sc.nextInt();

        int through = 0, stay = 0;
        int x, y;
        for (int i = 0; i < n; i++) {
            boolean isMarkedThrough = false;
            boolean isMarkedStay = false;
            int count = 0;
            for (int j = 0; j < t; j++) {
                x = sc.nextInt();
                y = sc.nextInt();
                boolean isIn = x >= xl && x <= xr && y >= yd && y <= yu;
                if (isIn) {
                    count++;
                    if (!isMarkedThrough) {
                        through++;
                        isMarkedThrough = true;
                    }
                    if (count >= k && !isMarkedStay) {
                        stay++;
                        isMarkedStay = true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        System.out.println(through);
        System.out.println(stay);

        sc.close();
    }
}
