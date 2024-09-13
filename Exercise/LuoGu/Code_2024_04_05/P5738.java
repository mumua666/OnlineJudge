import java.util.Scanner;

public class P5738 {

    public static double getAverageScore(int[] scores) {
        int num = scores.length;
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        int sumScore = 0;
        for (int i = 0; i < num; i++) {
            sumScore += scores[i];
            maxScore = maxScore > scores[i] ? maxScore : scores[i];
            minScore = minScore < scores[i] ? minScore : scores[i];
        }
        sumScore -= maxScore + minScore;
        return sumScore * 1.0 / (num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double maxScore = Double.MIN_VALUE;
        int[] scores = new int[m];
        while (n-- > 0) {
            for (int i = 0; i < m; i++) {
                scores[i] = sc.nextInt();
            }
            double averageScore = getAverageScore(scores);
            maxScore = maxScore > averageScore ? maxScore : averageScore;
        }
        System.out.printf("%.2f\n", maxScore);

        sc.close();
    }
}
