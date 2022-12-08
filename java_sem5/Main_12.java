import java.util.*;

public class Main_12 {
    /**
     * Написать программу, определяющую правильность расстановки скобок в выражении.
     * () - true
     * [() - false
     * [()] - true
     * {}[]{()} - true
     * <{}{()}> - true
     * {]}{()} - false
     *
     * Пример 1: a+(d*3) - истина
     * Пример 2: [a+(1*3) - ложь
     * Пример 3: [6+(3*3)] - истина
     * Пример 4: {a}[+]{(d*3)} - истина
     * Пример 5: <{a}+{(d*3)}> - истина
     * Пример 6: {a+]}{(d*3)} - ложь
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Inser first word: ");
        String inp1 = sc.nextLine();
        System.out.println(isomorph(inp1));
        sc.close();
    }
    public static boolean isomorph(String str1) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '{' || str1.charAt(i) == '[' || str1.charAt(i) == '<' || str1.charAt(i) == '(') {
                stack.add(str1.charAt(i));
            }
            if (str1.charAt(i) == '}') {
                Character abc = stack.pop();
                if (abc != '{') {
                    break;
                }
            }
            if (str1.charAt(i) == ']') {
                Character abc = stack.pop();
                if (abc != '[') {
                    break;
                }
            }
            if (str1.charAt(i) == '>') {
                Character abc = stack.pop();
                if (abc != '<') {
                    break;
                }
            }
            if (str1.charAt(i) == ')') {
                Character abc = stack.pop();
                if (abc != '(') {
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            return stack.isEmpty();
        }
        return false;
    }
}
