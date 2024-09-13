import java.util.Scanner;

public class Code2018_12_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int red = sc.nextInt();
        int yellow = sc.nextInt();
        int green = sc.nextInt();

        int n = sc.nextInt();

        int totalTime = 0;
        int type, time;

        while (n-- > 0) {
            type = sc.nextInt();
            time = sc.nextInt();
            if (type == 0 || type == 1) {
                totalTime += time;
            } else if (type == 2) {
                totalTime += time + red;
            }
        }
        System.out.println(totalTime);
        sc.close();
    }
}
