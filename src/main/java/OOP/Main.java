package OOP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fraction frac = new Fraction();
        Scanner in = new Scanner(System.in);
        int a;
        boolean flag;
        do {
            System.out.print("Хотите ли вы сократить дробь? (0 - нет, 1 - да): ");
            flag = false;
            a = in.nextInt();
            switch (a) {
                case 0:
                    break;
                case 1:
                    frac.reduction();
                    break;
                default:
                    System.out.print("Введите цифру 0 или 1\r\n");
                    flag = true;
                    break;
            }
        } while (flag);
        in.close();
        System.out.println("Конечная дробь: " + frac.fracToString());
    }

}