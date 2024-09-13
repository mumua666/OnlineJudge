import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class P005ProPro {
    static class Student {
        String no;
        int seatNo;

        public Student(String no, int seatNo) {
            this.no = no;
            this.seatNo = seatNo;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        // 指定初始容量和负载因子
        int initialCapacity = (int) (n / 0.75f + 1.0f); // 计算避免扩容的最小容量
        Map<Integer, Student> stuMap = new HashMap<>(initialCapacity); // 初始化HashMap

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String no = line[0];
            int testNo = Integer.parseInt(line[1]);
            int seatNo = Integer.parseInt(line[2]);
            Student stu = new Student(no, seatNo);
            stuMap.put(testNo, stu);
        }

        int k = Integer.parseInt(br.readLine());
        String[] queryNums = br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            int testNo = Integer.parseInt(queryNums[i]);
            Student stu = stuMap.get(testNo);
            out.println(stu.no + " " + stu.seatNo);
        }

        br.close();
        out.close();
    }
}
