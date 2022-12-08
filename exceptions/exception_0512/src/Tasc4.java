import java.util.Scanner;

public class Tasc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (!input.matches("\\d+")) {
            throw new RuntimeException("Некорректный ввод: " + input);
        }
    }
}
