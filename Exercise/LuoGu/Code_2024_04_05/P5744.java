import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5744 {

    static class Student {
        String name;
        int age;
        int noip;

        public Student(String name, int age, int noip) {
            this.name = name;
            this.age = age;
            this.noip = noip;
        }

        public void improveNoip() {
            int noipNew = (int) (noip * 1.2);
            noip = Math.min(noipNew, 600);
            age++;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + noip;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> stuList = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.next();
            int age = sc.nextInt();
            int noip = sc.nextInt();
            Student stu = new Student(name, age, noip);
            stuList.add(stu);
        }

        for (Student stu : stuList) {
            stu.improveNoip();
            System.out.println(stu);
        }

        sc.close();
    }
}
