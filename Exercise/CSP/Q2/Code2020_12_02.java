import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Code2020_12_02 {

    static class Course {
        int thresh, result;

        public Course(int thresh, int result) {
            this.thresh = thresh;
            this.result = result;
        }

        public boolean isCorrect(int thresh) {
            return this.thresh < thresh && result == 0 || this.thresh >= thresh && result == 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int thresh, result;
        List<Course> courseList = new ArrayList<>();
        Map<Integer, Integer> threshMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            thresh = sc.nextInt();
            result = sc.nextInt();
            Course course = new Course(thresh, result);
            courseList.add(course);
            threshMap.put(thresh, 0);
        }

        threshMap.forEach((k, v) -> {
            int count = 0;
            for (Course c : courseList) {
                if (c.isCorrect(k)) {
                    count++;
                }
            }
            threshMap.put(k, count);
        });

        int maxCount = 0;
        for (Integer i : threshMap.values()) {
            maxCount = maxCount > i ? maxCount : i;
        }

        Integer maxCountInteger = Integer.valueOf(maxCount);
        Set<Integer> threshSet = new HashSet<>();
        threshMap.forEach((k, v) -> {
            if (v.equals(maxCountInteger)) {
                threshSet.add(k);
            }
        });

        int maxThresh = 0;
        for (Integer i : threshSet) {
            maxThresh = maxThresh > i ? maxThresh : i;
        }

        System.out.println(maxThresh);

        sc.close();
    }
}
