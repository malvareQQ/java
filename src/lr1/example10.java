package lr1;
import java.util.Scanner;
public class example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите год вашего рождения: ");
        int yearOfBirth = in.nextInt();

        int age = 2023 - yearOfBirth;

        System.out.println("Ваш возраст: " + age + " лет.");

        in.close();
    }
}

