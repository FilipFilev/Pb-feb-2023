package L01FirstSteps040223;

import java.util.Scanner;

public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четене на вход

        double area = Double.parseDouble(scanner.nextLine());
        //Цената на един кв. м. е 7.61 лв със ДДС
        double result = area * 7.61;
        double discount = result * 0.18;

        double total = result - discount;

        System.out.printf("The final price is: %f lv./n", total);
        System.out.printf("The discount is: %f lv.", discount);


        //2. Изчисления
        //3. Принтиране
    }
}
