import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P5740 {

    static class Student {
        String name;
        int chinse;
        int math;
        int english;
        int total = -1;

        public Student(String name, int chinse, int math, int english) {
            this.name = name;
            this.chinse = chinse;
            this.math = math;
            this.english = english;
        }

        public int getTotal() {
            if (total == -1) {
                total = chinse + math + english;
            }
            return total;
        }

        @Override
        public String toString() {
            return name + " " + chinse + " " + math + " " + english;
        }
    }

    static class MyComp implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getTotal() - o1.getTotal();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stuArrs = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int chinse = sc.nextInt();
            int math = sc.nextInt();
            int english = sc.nextInt();
            stuArrs[i] = new Student(name, chinse, math, english);
        }

        Arrays.sort(stuArrs, new MyComp());
        System.out.println(stuArrs[0]);

        sc.close();
    }
}
