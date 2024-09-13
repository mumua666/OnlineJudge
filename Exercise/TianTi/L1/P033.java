import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P033 {

    public static int getDiffNum(int year) {
        int one = year > 1000 ? year / 1000 : 0;
        int two = year > 100 ? (year / 100) % 10 : 0;
        int three = year > 10 ? (year / 10) % 10 : 0;
        int four = year % 10;
        Set<Integer> numSet = new HashSet<>();
        numSet.add(one);
        numSet.add(two);
        numSet.add(three);
        numSet.add(four);
        return numSet.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int n = sc.nextInt();
        int x = 0;
        while (getDiffNum(y) != n) {
            x++;
            y++;
        }
        System.out.printf("%d %04d\n", x, y);
        sc.close();
    }
}