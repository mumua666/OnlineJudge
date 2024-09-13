package Array;

public class P69 {
    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        } else {
            double left = 0, right = x;
            double middle = (left + right) / 2;
            double diff;
            while (true) {
                diff = middle * middle - x;
                if (Math.abs(diff) < 1e-3) {
                    break;
                }
                if (diff < 0) {
                    left = middle;
                } else {
                    right = middle;
                }
                middle = (left + right) / 2;
            }
            return (int) middle;
        }
    }
}
