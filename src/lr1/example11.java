package lr1;
import java.util.Scanner;
public class example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите свое имя: ");
        String name = in.nextLine();

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Привет, " + name + "! Вам сейчас " + age + " лет.");

        in.close();
    }
}
