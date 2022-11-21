package gb.ru;

    //  Привет + 'имя'.
// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("Hello, " + name + "!");
//    }
// }


    //  Вывести максимальное количество подряд идущих 1.
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {1, 0, 1, 1, 1, 0, 1, 0, 1, 1};
//        int result = method(array);
//        System.out.println(result);
//    }
//
//    private static int method(int[] array) {
//        int counter = 0;
//        int bestCounter = 0;
//        for (int x : array) {
//            if (x == 1) {
//                counter++;
//            } else {
//                if (counter > bestCounter) {
//                    bestCounter = counter;
//                }
//                counter = 0;
//            }
//        }
//
//        if (counter > bestCounter) {
//            bestCounter = counter;
//        }
//
//        return bestCounter;
//    }
//}


    //  Перевернуть порядок слов в строке.
// public class Main {
//    public static void main(String[] args) {
//        reverseAndPrint("Добро<- пожаловать на курс по Java");
//        System.out.println("->Добро пожаловать на курс по Java");
//    }

//    private static void reverseAndPrint(String str) {
//        String[] a = str.split(" ");
//        for (int i = a.length - 1; i >= 0; i--) {
//            System.out.print(a[i] + " ");
//        }
//    }
// }


    //  Найти такой index, что сумма слева и справа равны.
// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = {1, 7, 3, 6, 5, 6};
//         int median = findMedian(numbers);
//         System.out.println(median);
//     }
//     private static int findMedian(int[] numbers) {
//         int left = 0;
//         for (int i = 1; i < numbers.length - 1; i++) {
//             left += numbers[i - 1];

//             int right = 0;
//             for (int j = i + 1; j < numbers.length; j++) {
//                 right += numbers[j];
//             }

//             if (left == right) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }
