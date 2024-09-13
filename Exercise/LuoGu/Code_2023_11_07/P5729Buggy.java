import java.util.Scanner;

public class P5729Buggy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int x = sc.nextInt();
        int h = sc.nextInt();

        int q = sc.nextInt();

        int x1, y1, z1;
        int x2, y2, z2;

        int totalVolume = w * x * h;
        int partVolume = 0;
        int removeTotalVolume = 0;
        for (int i = 0; i < q; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            z1 = sc.nextInt();

            x2 = sc.nextInt();
            y2 = sc.nextInt();
            z2 = sc.nextInt();

            partVolume = (x2 - x1 + 1) * (y2 - y1 + 1) * (z2 - z1 + 1);
            removeTotalVolume += partVolume;
        }

        System.out.println(totalVolume - removeTotalVolume);
        sc.close();
    }
}
