import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P030 {
    static class StuPair {
        String name;
        int sex;
        boolean isPaired;

        public StuPair(String name, int sex) {
            this.name = name;
            this.sex = sex;
            this.isPaired = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<StuPair> stuPairList = new ArrayList<>();
        while (n-- > 0) {
            int sex = sc.nextInt();
            String name = sc.next();
            StuPair stuPair = new StuPair(name, sex);
            stuPairList.add(stuPair);
        }

        for (int i = 0; i < stuPairList.size() / 2; i++) {
            StuPair stu1 = stuPairList.get(i);
            if (stu1.isPaired == false) {
                for (int j = stuPairList.size() - 1; j >= 0; j--) {
                    StuPair stu2 = stuPairList.get(j);
                    if (stu2.isPaired == false && stu2.sex != stu1.sex) {
                        System.out.println(stu1.name + " " + stu2.name);
                        stu1.isPaired = true;
                        stu2.isPaired = true;
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}