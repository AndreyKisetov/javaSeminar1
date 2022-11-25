package gb.ru;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main8 {
    /**
    * Реализовать консольное приложение, которое:
    * Принимает от пользователя и “запоминает” строки.
    * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    * Если введено revert, удаляет предыдущую введенную строку из памяти.
    */
    public static void main8(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> list = new ArrayList<>();
            String word = "";
            while (!Objects.equals(word, "end")) {
                word = scanner.nextLine();
                if (Objects.equals(word, "print")) {
                    System.out.println(list);
                } else if (Objects.equals(word, "revert")) {
                    if (list.size() != 0) {
                        list.remove(0);
                    }
                } else
                    list.add(0, word);
            }
        }
    }
}
