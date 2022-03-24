import java.util.Scanner;

public class Task2 {

    public static void helloName() {
        System.out.println("Начато второе задание...");
        System.out.println("Введите имя:");
        Scanner console = new Scanner(System.in);
        String name = "Вячеслав";
        if (console.next().equals(name)) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println("Второе задание окончено");
    }
}
