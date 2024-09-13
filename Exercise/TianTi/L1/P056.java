import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P056 {

    static class People {
        int num;
        String name;

        public People(int num, String name) {
            this.num = num;
            this.name = name;
        }

    }

    static class MyComp implements Comparator<People> {

        int avrageNum;

        public MyComp(int avrageNum) {
            this.avrageNum = avrageNum;
        }

        @Override
        public int compare(People o1, People o2) {
            return Math.abs(o1.num - avrageNum) - Math.abs(o2.num - avrageNum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        People[] peoples = new People[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int num = sc.nextInt();
            sum += num;
            People people = new People(num, name);
            peoples[i] = people;
        }
        int avrageNum = sum / (2 * n);
        Arrays.sort(peoples, new MyComp(avrageNum));
        System.out.println(avrageNum + " " + peoples[0].name);
        sc.close();
    }
}