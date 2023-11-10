import java.util.*;

public class Main {
    public static void main(String[] args) {
        long start;
        long duration;
        long end;
        long minDuration = Long.MAX_VALUE;
        String minTime = "";

        start = System.currentTimeMillis();
        ArrayList<Integer> quantity = new ArrayList<>();
        for (int i = 0; i < 500_000; i++) {
            quantity.add(i);
        }
        quantity.get(600);
        quantity.clear();
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Общее время для ArrayList " + duration);
        if (minDuration > duration) {
            minDuration = duration;
            minTime = "ArrayList";
        }

        start = System.currentTimeMillis();
        LinkedList<Integer> quantity2 = new LinkedList<>();
        for (int i = 0; i < 500_000; i++) {
            quantity2.add(i);
        }
        quantity2.get(600);
        quantity2.clear();
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Время для LinkedList " + duration);
        if (minDuration > duration) {
            minDuration = duration;
            minTime = "LinkedList";
        }


        start = System.currentTimeMillis();
        HashSet<Integer> quantity3 = new HashSet<>();
        for (int i = 0; i < 500_000; i++) {
            quantity3.add(i);
        }
        quantity3.contains(600);
        quantity3.clear();
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Общее время для HashSet " + duration);
        if (minDuration > duration) {
            minDuration = duration;
            minTime = "HashSet";
        }


        start = System.currentTimeMillis();
        TreeSet<Integer> quantity4 = new TreeSet<>();
        for (int i = 0; i < 500_000; i++) {
            quantity4.add(i);
        }
        quantity4.contains(600);
        quantity4.clear();
        end = System.currentTimeMillis();
        duration = end - start;
        System.out.println("Общее время для Treeset " + duration);
        if (minDuration > duration) {
            minDuration = duration;
            minTime = "TreeSet";
        }


        System.out.println("__________________");
        System.out.println("Минимальное количество времени " + minDuration);
        System.out.println("Меньше всего времени потребовалось для " + minTime);
    }
}



