import java.util.Scanner;

public class Conversion {
    static double conversion(double cashVar, double coverCash_var, double currencySalles) {
        double conversion = (cashVar * currencySalles)/coverCash_var;    // Основиний розрахунок між валютами
        if( currencySalles < 1){
            double NBU = 1000.0;
            conversion (cashVar *  NBU);            // Перевірка на Гривню
            return NBU;
        }
        return conversion;
    }

    private static void conversion(double v) {
    }

    public static void main(String[] args) {
        System.out.println("Курс Валют станом на 09/06/2022 м.Київ.\n" +
                        "Скопіюйте суму курса для операції розрахунку або введіть самостійно: " +
                        "\nUSD = 34,053" +
                        "\nGBP = 39,058" +
                        "\nEUR = 35,908" +
                        "\nUAH = 1" +
                        "\nPLN = 7,445" +
                        "\nMNT = 0,01139582\n");

        Scanner scannerData = new Scanner(System.in);
        System.out.println("Введіть суму для конвертації: ");
        double cashVar = scannerData.nextDouble();
        System.out.println("Введіть курс бажаної валюти з якої конвертуєте: ");
        double currencySalles = scannerData.nextDouble();
        System.out.println("Введіть курс бажаної валюти на яку конвертуєте: ");
        double coverCash_var = scannerData.nextDouble();
        System.out.println("Сума " +cashVar+ " при конверртації валюти з " + currencySalles + " по курсу НБУ на курс валюти " + coverCash_var + " складає " + conversion(cashVar,coverCash_var,currencySalles));
    }

}


