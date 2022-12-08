import java.util.*;

public class Main_14 {
    // Создаете одно из множеств: HashSet, TreeSet, LinkedHashSet (<Integer>)
    // Замеряете время заполнения каждого из них 250_000 числами
    public static void main(String[] args) {
        speedMeasurement(new HashSet<>());
        speedMeasurement(new TreeSet<>());
        speedMeasurement(new LinkedHashSet<>());
    }

    public static void speedMeasurement(Set<Integer> set) {
        long sumTime = 0;
        for (int j = 0; j < 100; j++) {
            long time = System.currentTimeMillis();
            for (int i = 0; i < 250_000; i++) {
                set.add(i);
            }
            sumTime += System.currentTimeMillis() - time;
            set.clear();
        }
        System.out.println(sumTime / 100);
    }
}
