import java.util.*;

public class Main_11 {
    /**Даны 2 строки, написать метод, который вернет true, если эти строки являются
     * изоморфными и false, если нет.
     * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
     * букву во втором слове, при этом повторяющиеся буквы одного слова меняются на 
     * одну и ту же букву с сохранением порядка следования. (Например, add - egg 
     * изоморфны) буква может не меняться, а остаться такой же.(Например,note-code)
     * Пример 1: Input: s = "foo", t = "bar" Output: false
     * Пример 2: Input: s = "paper", t = "title" Output: true */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Inser first word: ");
        String inp1 = sc.nextLine();
        System.out.print("Inser second word: ");
        String inp2 = sc.nextLine();
        boolean ans = isomorph(inp1, inp2);
        System.out.println(ans);
        sc.close();
    }

    public static boolean isomorph(String str1, String str2) {
        Map<Character, Character> words = new HashMap<>();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (words.containsKey(str1.charAt(i))) {
                    if (words.get(str1.charAt(i)) != str2.charAt(i)) {
                        return false;
                    }
                } else {
                    words.put(str1.charAt(i), str2.charAt(i));
                }
            }
            return true;
        }
        return false;
    }
}
