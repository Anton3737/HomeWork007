import java.util.Scanner;

public class NumbersCheck {
    static int two = 2;
     static int num(int numbersVvod) {
        int num = numbersVvod;
        if (num > 0) {
            System.out.println("Дане число є додатнім");
        }                                           // превірка на відємне або додатнє число
        else {
            System.out.println("Дане число є від'ємним");
        }
        return num;
    }

     static int proste(int numbersVvod) {   // Чи є число простим
         System.out.println();

        int proste = numbersVvod;
        if (proste > 1) {
            if (proste % two != 0) {
                numbersVvod++;
            } else if (numbersVvod % two == 0) {
                prosteNatural(two, numbersVvod);
            }
        }
        return numbersVvod;
    }
     static int prosteNatural(int two, int numbersVvod) {
        if (two == numbersVvod) {
            System.out.println("число " + numbersVvod + " просте " );
        } else {
            System.out.println("число " + numbersVvod + " НЕ просте ");
        }
        return two;
        }
    public static void main (String[]args){
        Scanner numCheckVar = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int numbersVvod = numCheckVar.nextInt();
        proste(numbersVvod);
        num(numbersVvod);
    }
}
