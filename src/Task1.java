import java.util.Scanner;

public class Task1 {

    public static void hello() {
        System.out.println("Начато первое задание...");
        System.out.println("Введите число:");
        Scanner console = new Scanner(System.in);
        System.out.println();
        while (console.hasNextInt())
            if (console.nextInt() > 7) {
                System.out.println("Привет");
                break;
            }
        System.out.println("Задание окончено");
    }
}

