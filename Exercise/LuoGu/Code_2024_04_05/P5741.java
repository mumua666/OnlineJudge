import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P5741 {

    static class Student {
        String name;
        int chinse;
        int math;
        int english;
        int total = -1;
        List<String> sameComparator;

        public Student(String name, int chinse, int math, int english) {
            this.name = name;
            this.chinse = chinse;
            this.math = math;
            this.english = english;
            sameComparator = new ArrayList<>();
        }

        public boolean checkSame(Student stu) {
            int chinseDiff = Math.abs(stu.chinse - chinse);
            int mathDiff = Math.abs(stu.math - math);
            int englishDiff = Math.abs(stu.english - english);
            boolean singleSame = chinseDiff <= 5 && mathDiff <= 5 && englishDiff <= 5;
            boolean allSame = Math.abs(stu.getTotal() - this.getTotal()) <= 10;
            return singleSame && allSame;
        }

        public int getTotal() {
            if (total == -1) {
                total = chinse + math + english;
            }
            return total;
        }

        public void findSame(Student[] stuArrs) {
            for (Student stu : stuArrs) {
                if (stu.name.compareTo(name) > 0 && checkSame(stu)) {
                    sameComparator.add(stu.name);
                }
            }
        }

        @Override
        public String toString() {
            return name + " " + chinse + " " + math + " " + english;
        }
    }

    static class MyComp implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o1.name);
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
        for (Student stu : stuArrs) {
            stu.findSame(stuArrs);
            for (String name : stu.sameComparator) {
                System.out.println(stu.name + " " + name);
            }
        }

        sc.close();
    }
}
