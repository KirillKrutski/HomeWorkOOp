package OOP;

import java.util.Scanner;

public class Fraction {
    int numerator;
    int denominator;
    Fraction() {
        Scanner in = new Scanner(System.in);
        System.out.print("Числитель дроби -  ");
        this.numerator = in.nextInt();
        do {
            System.out.print("Знаменатель дроби -  ");
            this.denominator = in.nextInt();
        } while (FractionNaN());
        System.out.println("Дробь: " + fracToString());
    }
    public void reduction() {
        int x = numerator, y = denominator;
        while (x != y)
            if (x > y)
                x -= y;
            else
                y -= x;
        numerator /= y;
        denominator /= x;
    }
    public String fracToString() {
        return numerator + "/" + denominator;
    }
    private boolean FractionNaN() {
        boolean flag = false;
        if (denominator == 0) {
            System.out.print("«знаменатель не может быть нулем!\r\n");
            flag = true;
        }
        return flag;
    }
}