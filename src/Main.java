import java.util.*;

public class Main {
    public static void main(String[] args) {
        long start;
        long duration;
        long duration2;
        long end;

        start = System.currentTimeMillis();
        ArrayList<Integer> quantity = new ArrayList<>();
        for (int i = 0; i < 500_000; i++) {
            quantity.add(i);
        }
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Продолжительность для ArrayList " + duration);

        start = System.currentTimeMillis();
        LinkedList<Integer> quantity2 = new LinkedList<>();
        for (int i = 0; i < 500_000; i++) {
            quantity2.add(i);
        }
        end = System.currentTimeMillis();
        duration2 = end - start;
        System.out.println("Продолжительность для Linkedlist " + duration2);
        System.out.;

        if (duration > duration2) {
            System.out.println("С результатом: " + duration + " победил ArrayList");
        } else {
            System.out.println("С результатом: " + duration2 + " победил LinkedList");

        }
    }
}
