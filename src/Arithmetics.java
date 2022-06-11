import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner varInt = new Scanner(System.in);
        System.out.println("Введіть число А: ");              // Користувач сам вводить дані в консоль
        int a = varInt.nextInt();
        System.out.println("Введіть аривметичну операцію: ");     // Користувач сам вводить математичну операцію
        Scanner matOper = new Scanner(System.in);
        String operation = matOper.next();
        System.out.println("Введіть число В: ");
        int b = varInt.nextInt();
        switch (operation) {                               // методи + світч кейс + вивід в консоль результату обрахунку в методах add/sub/mul/div
            case "+":
                System.out.println("Результат операції + чисел А та В становить: " + add(a, b));
                 break;
            case "-":
                System.out.println("Результат операції - чисел А та В становить: " + sub(a, b));
                break;
            case "*":
                System.out.println("Результат операції * чисел А та В становить: " + mul(a, b));
                break;
            case "/":
                System.out.println("Результат операції / чисел А та В становить: " + div(a, b));
                break;
        }
    }
    static int add(int a, int b) {
        return a + b;                          // метод add - додавання
    }
    static int sub(int a, int b) {
        return a - b;                           // метод sub - віднімання
    }
    static int mul(int a, int b) {
        return a * b;                           // метод mul - множення
    }
    static double div(double a, double b) {
        if (b == 0){                                    // метод div - ділення
            System.out.println("Операція ділення на 0 неможлива");}
        return a / b;
    }
}