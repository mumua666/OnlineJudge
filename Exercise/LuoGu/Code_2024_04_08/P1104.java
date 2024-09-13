import java.util.Arrays;
import java.util.Scanner;

public class P1104 {

    static class Student implements Comparable<Student> {
        String name;
        int year;
        int month;
        int day;

        public Student(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof Student)) {
                return false;
            }
            Student stuObj = (Student) obj;
            boolean isEquals = stuObj.name.equals(name) &&
                    stuObj.year == year &&
                    stuObj.month == month &&
                    stuObj.day == day;
            return isEquals;

        }

        @Override
        public int compareTo(Student o) {
            if (this.equals(o)) {
                return -1;
            }
            return o.year == year ? o.month == month ? day - o.day : month - o.month : year - o.year;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stuArrs = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            stuArrs[i] = new Student(name, year, month, day);
        }
        Arrays.sort(stuArrs);
        for (Student stu : stuArrs) {
            System.out.println(stu.name);
        }
        sc.close();
    }
}