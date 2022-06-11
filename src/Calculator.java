import java.util.Scanner;

public class Calculator {

    static int Calculate(int a ,int b, int c){
       int seredne = (a +  b + c)/3;
       return seredne;
    }

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введіть перше ціле число: ");
        int a = numbers.nextInt();
        System.out.println("Введіть друге ціле число: ");
        int b = numbers.nextInt();
        System.out.println("Введіть третє ціле число: ");
        int c = numbers.nextInt();

        System.out.println("\nСереднє значення трьо цілих чисел: " + Calculate(a,b,c));
    }
}
