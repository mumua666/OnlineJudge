import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // ArrayList<ArrayList<Integer>> = new ArrayList<>();
        sc.close();
    }
}