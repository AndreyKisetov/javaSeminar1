public class Main {
    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    // Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
    // 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1,в качестве кода ошибки.
    private final static int MIN_LENGTH = 5;

    public static void main(String[] args) {
        System.out.println(getSize(new int[] {1, 2}));
        System.out.println(getSize(new int[] {1, 2, 3, 4, 5, 6}));
    }

    public static int getSize(int[] array) {
        if (array.length < MIN_LENGTH) {
            return -1;
        }

        return array.length;
    }
}
