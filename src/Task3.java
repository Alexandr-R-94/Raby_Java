import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void multipleOfThree() {
        System.out.println("Начато третье задание...");
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите максимальное значение для массива:");
        int randomMax = console.nextInt();
        int[] array = new int[10];

        System.out.println("Ваш массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(randomMax);
            System.out.println(array[i]);
        }
        System.out.println("Числа, кратные 3");
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("Третье задание окончено");
    }
}
