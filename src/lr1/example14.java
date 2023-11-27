package lr1;
import java.util.Scanner;
public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        int pNum = number - 1;
        int nNum = number + 1;

        System.out.println("Последовательность чисел:");
        System.out.println(pNum);
        System.out.println(number);
        System.out.println(nNum);

        in.close();
    }
}

