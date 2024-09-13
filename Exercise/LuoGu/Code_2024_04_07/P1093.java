import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1093 {

    static class Student {
        int stuNo;
        int chinses;
        int math;
        int english;

        public Student(int stuNo, int chinses, int math, int english) {
            this.stuNo = stuNo;
            this.chinses = chinses;
            this.math = math;
            this.english = english;
        }

        public int getSum() {
            return chinses + math + english;
        }
    }

    static class MyComp implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getSum() == o2.getSum()) {
                return o1.chinses == o2.chinses ? o1.stuNo - o2.stuNo : o2.chinses - o1.chinses;
            }
            return o2.getSum() - o1.getSum();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] stus = new Student[n];
        for (int i = 0; i < n; i++) {
            int stuNo = i + 1;
            int chinses = sc.nextInt();
            int math = sc.nextInt();
            int english = sc.nextInt();
            stus[i] = new Student(stuNo, chinses, math, english);
        }

        Arrays.sort(stus, new MyComp());
        int k = 5;
        for (int i = 0; i < k; i++) {
            System.out.println(stus[i].stuNo + " " + stus[i].getSum());
        }

        sc.close();
    }
}