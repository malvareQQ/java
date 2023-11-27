package lr1;
import java.util.Scanner;
public class example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int yearOfBirth = 2023 - age;
        System.out.println("Год рождения: " + yearOfBirth);
    }
}
