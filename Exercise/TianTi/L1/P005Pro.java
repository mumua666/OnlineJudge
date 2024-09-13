import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P005Pro {

    static class Student {
        String no;
        int seatNo;

        public Student(String no, int seatNo) {
            this.no = no;
            this.seatNo = seatNo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Student> stuMap = new HashMap<>(n);
        while (n-- > 0) {
            String no = sc.next();
            int testNo = sc.nextInt();
            int seatNo = sc.nextInt();
            Student stu = new Student(no, seatNo);
            stuMap.put(testNo, stu);
        }
        int k = sc.nextInt();
        while (k-- > 0) {
            int testNo = sc.nextInt();
            Student stu = stuMap.get(testNo);
            System.out.println(stu.no + " " + stu.seatNo);
        }

        sc.close();
    }
}
