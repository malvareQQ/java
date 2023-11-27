package lr1;
import java.util.Scanner;

public class example6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите фамилию: ");
            String f = scanner.nextLine();

            System.out.print("Введите имя: ");
            String i = scanner.nextLine();

            System.out.print("Введите отчество: ");
            String o = scanner.nextLine();

            System.out.println("Hello " + f + " " + i + " " + o);

            scanner.close();
        }
    }

