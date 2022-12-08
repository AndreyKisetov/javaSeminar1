import java.util.*;

public class Main_13 {
    // Взять набор строк, например, Мороз и солнце день чудесный
    // Еще ты дремлешь друг прелестный Пора красавица проснись.
    // Написать метод, который отсортирует эти строки по длине с помощью
    // TreeMap. Строки с одинаковой длиной не должны "потеряться".
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        String[] tabl = str.split(" ");
        for (int i = 0; i < tabl.length; i++) {
            int len = tabl[i].length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(tabl[i]);
                map.put(len, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(tabl[i]);
                map.put(len, list);
            }
        }
        List<String> result = new ArrayList<>();
        Set<Integer> set = map.keySet();
        for (Integer x : set) {
            List<String> list = map.get(x);

            result.addAll(list);
        }
        System.out.println(result);
    }
}
