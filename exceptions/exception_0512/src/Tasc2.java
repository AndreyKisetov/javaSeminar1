public class Tasc2 {
    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    // Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
    // 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    private final static int MIN_LENGTH = 5;

    public static void main(String[] args) {

    }

    private static int fineIndexOf(int value, int[] array) {
        if (array == null) return -3;

        if (array.length < MIN_LENGTH) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -2;
    }
}
