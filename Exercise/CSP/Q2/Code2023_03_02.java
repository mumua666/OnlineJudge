import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Code2023_03_02 {

    static class Field {
        int day, cost;

        public Field(int day, int cost) {
            this.day = day;
            this.cost = cost;
        }
    }

    static int n, m, k;
    static List<Field> fields, fieldsTemp;

    public static void readData() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        fields = new ArrayList<>();
        fieldsTemp = new ArrayList<>();

        int day, cost;
        for (int i = 0; i < n; i++) {
            day = sc.nextInt();
            cost = sc.nextInt();
            Field field = new Field(day, cost);
            fields.add(field);
        }

        Collections.sort(fields, new Comparator<Field>() {
            @Override
            public int compare(Field a, Field b) {
                return b.day - a.day;
            }
        });
        sc.close();
    }

    public static boolean canReduce(int maxDay) {
        int costDays = 0;
        for (Field field : fields) {
            if (field.day == maxDay) {
                costDays += field.cost;
                field.day--;
            } else {
                break;
            }
            if (costDays > m) {
                return false;
            }
        }
        m -= costDays;
        return true;
    }

    public static void reduceDays() {
        int maxDay = fields.get(0).day;
        while (maxDay > k && canReduce(maxDay)) {
            maxDay--;
        }
        System.out.println(maxDay);
    }

    public static void solve() {
        readData();
        reduceDays();
    }

    public static void main(String[] args) {
        solve();
    }
}
