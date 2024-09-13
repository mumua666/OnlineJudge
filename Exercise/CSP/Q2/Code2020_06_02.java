import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Code2020_06_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        Map<Integer, Integer> vectorA = new HashMap<>();

        int index, value;
        for (int i = 0; i < a; i++) {
            index = sc.nextInt();
            value = sc.nextInt();
            vectorA.put(index, value);
        }

        long sum = 0;
        int vecA;
        for (int i = 0; i < b; i++) {
            index = sc.nextInt();
            value = sc.nextInt();
            if (vectorA.containsKey(index)) {
                vecA = vectorA.get(index);
                sum += value * vecA;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}