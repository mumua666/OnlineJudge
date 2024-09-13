package Code_2023_7_18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class P1059 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> randomNumSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            randomNumSet.add(sc.nextInt());
        }

        List<Integer> randomNumList = new ArrayList<>();
        for (Integer random : randomNumSet) {
            randomNumList.add(random);
        }

        randomNumList.sort(null);

        System.out.println(randomNumList.size());
        for (Integer random : randomNumList) {
            System.out.print(random + " ");
        }
        System.out.println();
        sc.close();
    }
}
