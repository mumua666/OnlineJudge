import java.util.Scanner;

public class P5729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int x = sc.nextInt();
        int h = sc.nextInt();

        boolean[][][] reactangle = new boolean[w + 1][x + 1][h + 1];
        int q = sc.nextInt();

        int x1, y1, z1;
        int x2, y2, z2;

        for (int i = 0; i < q; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            z1 = sc.nextInt();

            x2 = sc.nextInt();
            y2 = sc.nextInt();
            z2 = sc.nextInt();

            for (int ix = x1; ix <= x2; ix++) {
                for (int iy = y1; iy <= y2; iy++) {
                    for (int iz = z1; iz <= z2; iz++) {
                        reactangle[ix][iy][iz] = true;
                    }
                }
            }
        }

        int volume = 0;
        for (int ix = 1; ix <= w; ix++) {
            for (int iy = 1; iy <= x; iy++) {
                for (int iz = 1; iz <= h; iz++) {
                    if (!reactangle[ix][iy][iz]) {
                        volume++;
                    }
                }
            }
        }

        System.out.println(volume);

        sc.close();
    }
}
