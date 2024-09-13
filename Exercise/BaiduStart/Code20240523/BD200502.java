package Code20240523;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BD200502 {

    static class NumPair {
        int start, end;

        public NumPair(int start, int end) {
            this.start = Math.min(start, end);
            this.end = Math.max(start, end);
        }

        public int calDistance(NumPair numPair) {
            int min = Math.max(start, numPair.start);
            int max = Math.min(end, numPair.end);
            return max < min ? 0 : max - min + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NumPair> numPairList = new ArrayList<>();
        while (sc.hasNext()) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            NumPair numPair = new NumPair(start, end);
            numPairList.add(numPair);
        }
        int size = numPairList.size();
        int maxGap = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                NumPair numPair1 = numPairList.get(i);
                NumPair numPair2 = numPairList.get(j);
                int gap = numPair1.calDistance(numPair2);
                maxGap = Math.max(maxGap, gap);
            }
        }
        System.out.println(maxGap);
        sc.close();
    }
}