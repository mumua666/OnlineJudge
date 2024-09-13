package Array;

public class P367 {
    public boolean isPerfectSquare(int num) {
        int middle = 1;
        while (middle * middle < num) {
            if (middle * 2 < 0) {
                break;
            }
            middle *= 2;
        }
        for (int i = middle / 2; i <= middle; i++) {
            if (i * i == num) {
                return true;
            }
            if (i * i > num) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new P367().isPerfectSquare(2000105819));
    }
}
