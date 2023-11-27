package lr1;
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Введите возраст:");
        int age = in.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        in.close();
    }
}
