package lr1;
import java.util.Scanner;

public class example6 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Введите фамилию: ");
            String f = in.nextLine();

            System.out.print("Введите имя: ");
            String i = in.nextLine();

            System.out.print("Введите отчество: ");
            String o = in.nextLine();

            System.out.println("Hello " + f + " " + i + " " + o);

            in.close();
        }
    }

