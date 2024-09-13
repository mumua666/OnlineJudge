import java.util.Scanner;

public class Code2016_12_02 {

    public static int calculateSalary(int salary) {
        int taxation = 0;
        if (salary > 3500) {
            salary -= 3500;
            if (salary <= 1500) {
                taxation = salary * 3 / 100;
            } else if (salary <= 4500) {
                taxation = 45;
                taxation += (salary - 1500) * 10 / 100;
            } else if (salary <= 9000) {
                taxation = 45 + 300;
                taxation += (salary - 4500) * 20 / 100;
            } else if (salary <= 35000) {
                taxation = 45 + 300 + 900;
                taxation += (salary - 9000) * 25 / 100;
            } else if (salary <= 55000) {
                taxation = 45 + 300 + 900 + 6500;
                taxation += (salary - 35000) * 30 / 100;
            } else if (salary <= 80000) {
                taxation = 45 + 300 + 900 + 6500 + 6000;
                taxation += (salary - 55000) * 35 / 100;
            } else {
                taxation = 45 + 300 + 900 + 6500 + 6000 + 8750;
                taxation += (salary - 80000) * 45 / 100;
            }
            salary += 3500;
        }
        return salary - taxation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int start = 100, newSalary;
        // while (true) {
        // newSalary = calculateSalary(start);
        // if (newSalary < salary) {
        // start *= 2;
        // } else if (newSalary > salary) {
        // start /= 2;
        // boolean isFind = false;
        // for (int i = start;; i += 100) {
        // if (calculateSalary(i) == salary) {
        // isFind = true;
        // System.out.println(i);
        // break;
        // }
        // }
        // if (isFind) {
        // break;
        // }
        // } else if (newSalary == salary) {
        // System.out.println(start);
        // break;
        // }
        // }

        while (true) {
            newSalary = calculateSalary(start);
            if (newSalary == salary) {
                System.out.println(start);
                break;
            }
            start += 100;
        }

        sc.close();
    }
}
