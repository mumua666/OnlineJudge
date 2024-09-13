import java.util.Scanner;

class Ball {
    public int location;
    public String direction = "right";
}

public class Code2018_03_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int t = sc.nextInt();
        Ball[] ball = new Ball[n];
        for (int i = 0; i < n; i++) {
            ball[i] = new Ball();
            ball[i].location = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                // 碰到左端点则方向转为“右”
                if (ball[j].location == 0) {
                    ball[j].direction = "right";
                }
                // 碰到右端点则方向转为“左”
                if (ball[j].location == L) {
                    ball[j].direction = "left";
                }
                // 每次按当前方向前进一格
                if (ball[j].direction.equals("right")) {
                    ball[j].location++;
                } else {
                    ball[j].location--;
                }
            }
            // 两球相碰时方向变为各自的反方向,循环整个数组判断有没有相同的
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (ball[j].location == ball[k].location) {
                        if (ball[j].direction.equals("right")) {
                            ball[j].direction = "left";
                            ball[k].direction = "right";
                        } else {
                            ball[j].direction = "right";
                            ball[k].direction = "left";
                        }
                    }
                }
            }
        }
        // 输出最后所有小球的位置
        for (int i = 0; i < n; i++) {
            System.out.print(ball[i].location + " ");
        }

        sc.close();
    }
}