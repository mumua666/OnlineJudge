import java.util.Scanner;

public class P5742 {

    static class Student {
        int stuNo;
        int studyScore;
        int extendScore;

        public Student(int stuNo, int studyScore, int extendScore) {
            this.stuNo = stuNo;
            this.studyScore = studyScore;
            this.extendScore = extendScore;
        }

        public int getSumScore() {
            return studyScore + extendScore;
        }

        public int getAverageScore() {
            return studyScore * 7 + extendScore * 3;
        }

        public boolean isExcellent() {
            return getSumScore() > 140 && getAverageScore() >= 800;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stuArrs = new Student[n];
        for (int i = 0; i < n; i++) {
            int stuNo = sc.nextInt();
            int studyScore = sc.nextInt();
            int extendScore = sc.nextInt();
            stuArrs[i] = new Student(stuNo, studyScore, extendScore);
        }
        for (Student stu : stuArrs) {
            if (stu.isExcellent()) {
                System.out.println("Excellent");
            } else {
                System.out.println("Not excellent");
            }
        }

        sc.close();
    }
}
