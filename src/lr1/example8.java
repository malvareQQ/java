package lr1;
import java.util.Scanner;
public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String dayOfWeek = in.nextLine();

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите дату (номер дня в месяце): ");
        int date = in.nextInt();

        System.out.println("День недели: " + dayOfWeek);
        System.out.println("Месяц: " + month);
        System.out.println("Дата: " + date);
    }
}
