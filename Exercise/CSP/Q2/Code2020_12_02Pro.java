import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Code2020_12_02Pro {

    static class Course {
        int thresh, result;

        public Course(int thresh, int result) {
            this.thresh = thresh;
            this.result = result;
        }

        public boolean isCorrect(int thresh) {
            return this.thresh < thresh && result == 0 || this.thresh >= thresh && result == 1;
        }

        @Override
        public int hashCode() {
            int result = 0;
            result = result * 31 + Integer.valueOf(thresh).hashCode();
            result = result * 31 + Integer.valueOf(result).hashCode();
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Course)) {
                return false;
            } else {
                Course obj = (Course) o;
                return obj.thresh == thresh;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int thresh, result;
        List<Course> courseList = new ArrayList<>();
        Set<Course> courseSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            thresh = sc.nextInt();
            result = sc.nextInt();
            Course course = new Course(thresh, result);
            Course course2 = new Course(thresh, 0);
            courseList.add(course);
            courseSet.add(course2);
        }

        int maxThresh = 0, maxResult = 0;
        for (Course c : courseSet) {
            int count = 0;
            for (Course t : courseList) {
                if (t.isCorrect(c.thresh)) {
                    count++;
                }
            }
            c.result = count;
            if (maxResult < count) {
                maxResult = count;
                maxThresh = c.thresh;
            } else if (maxResult == count && maxThresh < c.thresh) {
                maxThresh = c.thresh;
            }
        }

        // for (Course c : courseSet) {
        // System.out.println(c.thresh + "-->" + c.result);
        // }

        System.out.println(maxThresh);

        sc.close();
    }
}
