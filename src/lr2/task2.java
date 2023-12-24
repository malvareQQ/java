package lr2;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        if (number % 5 == 2 && number % 7 == 1) {
            System.out.println("Число удовлетворяет условиям.");
        } else {
            System.out.println("Число не удовлетворяет условиям.");
        }
    }
}
