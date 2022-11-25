import java.util.*;

public class Main_7 {
    // добавляем 100_000 элементов в список
    // получаем время и сравниваем
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        long time = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list1.add(0, i);
        }
        System.out.println(System.currentTimeMillis() - time);

        List<Integer> list2 = new LinkedList<>();
        time = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list2.add(0, i);
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
