package java_sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main7 {
    // добавляем 100_000 элементов в список
    // получаем время и сравниваем
    public static void main7(String[] args) {
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
