package Code20240523;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class BD200602 {

    static class Dish implements Comparable<Dish> {
        String dishName;
        int price;
        boolean isMeat;
        boolean isSpicy;

        public Dish(String dishName, int price, int isMeat, int isSpicy) {
            this.dishName = dishName;
            this.price = price;
            this.isMeat = isMeat == 1;
            this.isSpicy = isSpicy == 1;
        }

        @Override
        public int compareTo(Dish o) {
            return price - o.price;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        List<Dish> dishList = new ArrayList<>();
        PriorityQueue<Dish> meatDish = new PriorityQueue<>();
        PriorityQueue<Dish> notMeatDish = new PriorityQueue<>();
        PriorityQueue<Dish> spicyDish = new PriorityQueue<>();
        PriorityQueue<Dish> notSpicyDish = new PriorityQueue<>();
        while (n-- > 0) {
            String dishName = sc.next();
            int price = sc.nextInt();
            int isMeat = sc.nextInt();
            int isSpicy = sc.nextInt();
            Dish dish = new Dish(dishName, price, isMeat, isSpicy);
            dishList.add(dish);
            if (dish.isMeat) {
                meatDish.add(dish);
            } else {
                notMeatDish.add(dish);
            }
            if (dish.isSpicy) {
                spicyDish.add(dish);
            } else {
                notSpicyDish.add(dish);
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int cntD = 0;
        boolean isMeet = cntA >= a &&
                cntB >= b &&
                cntC >= c &&
                cntD >= d;
        Set<Dish> resDishSet = new HashSet<>();
        while (!isMeet) {
            boolean cannotMeet = cntA < a && meatDish.isEmpty() ||
                    cntB < b && notMeatDish.isEmpty() ||
                    cntC < c && spicyDish.isEmpty() ||
                    cntD < d && notSpicyDish.isEmpty();
            if (cannotMeet || resDishSet.size() >= m) {
                break;
            }
            if (cntA < a) {
                Dish dish = meatDish.poll();
                resDishSet.add(dish);
                cntA++;
                if (dish.isSpicy) {
                    cntC++;
                    spicyDish.remove(dish);
                } else {
                    cntD++;
                    notSpicyDish.remove(dish);
                }
            }
            if (cntB < b) {
                Dish dish = notMeatDish.poll();
                resDishSet.add(dish);
                cntB++;
                if (dish.isSpicy) {
                    cntC++;
                    spicyDish.remove(dish);
                } else {
                    cntD++;
                    notSpicyDish.remove(dish);
                }
            }
            if (cntC < c) {
                Dish dish = spicyDish.poll();
                resDishSet.add(dish);
                cntC++;
                if (dish.isMeat) {
                    cntA++;
                    meatDish.remove(dish);
                } else {
                    cntB++;
                    notMeatDish.remove(dish);
                }
            }
            if (cntD < d) {
                Dish dish = notSpicyDish.poll();
                resDishSet.add(dish);
                cntD++;
                if (dish.isMeat) {
                    cntA++;
                    meatDish.remove(dish);
                } else {
                    cntB++;
                    notMeatDish.remove(dish);
                }
            }
            isMeet = cntA >= a &&
                    cntB >= b &&
                    cntC >= c &&
                    cntD >= d;

        }
        if (!isMeet) {
            System.out.printf("%.2f\n", 0.0);
        } else {
            int sum = 0;
            for (Dish dish : dishList) {
                if (resDishSet.contains(dish)) {
                    sum += dish.price;
                    System.out.println(dish.dishName);
                }
            }
            System.out.printf("%.2f\n", sum * 0.8 / k);
        }

        sc.close();
    }
}
