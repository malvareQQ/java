package lr2;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        int th = 0;
        if (number >= 1000) {
            th = (number / 1000) % 10;
        }

        System.out.println("Число тысяч : " + th);
    }
}

