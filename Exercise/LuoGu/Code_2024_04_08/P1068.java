import java.util.Arrays;
import java.util.Scanner;

public class P1068 {

    static class Grade implements Comparable<Grade> {
        int no;
        int grade;

        public Grade(int no, int grade) {
            this.no = no;
            this.grade = grade;
        }

        @Override
        public int compareTo(Grade o) {
            if (grade == o.grade) {
                return no - o.no;
            }
            return o.grade - grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Grade[] grades = new Grade[n];
        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            int grade = sc.nextInt();
            grades[i] = new Grade(no, grade);
        }

        Arrays.sort(grades);
        int cnt = 0;
        int size = (int) (m * 1.5);
        int gradeLine = grades[size - 1].grade;
        for (Grade grade : grades) {
            if (grade.grade >= gradeLine) {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(gradeLine + " " + cnt);
        for (Grade grade : grades) {
            if (grade.grade >= gradeLine) {
                System.out.println(grade.no + " " + grade.grade);
            } else {
                break;
            }
        }
        sc.close();
    }
}