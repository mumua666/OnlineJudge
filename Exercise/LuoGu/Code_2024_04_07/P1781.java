import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1781 {

    static class MyComp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() == o2.length()) {
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) != o2.charAt(i)) {
                        return o2.charAt(i) - o1.charAt(i);
                    }
                }
                return 0;
            }
            return o2.length() - o1.length();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] votes = new String[n];
        for (int i = 0; i < n; i++) {
            votes[i] = sc.next();
        }
        String[] copyVotes = votes.clone();
        Arrays.sort(votes, new MyComp());
        int num = -1;
        String vote = votes[0];
        for (int i = 0; i < n; i++) {
            if (vote.equals(copyVotes[i])) {
                num = i + 1;
                break;
            }
        }
        System.out.println(num);
        System.out.println(vote);
        sc.close();
    }
}