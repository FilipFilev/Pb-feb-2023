package L01FirstSteps040223.LAB;

import java.util.Scanner;

public class P04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        // изчисления
        double centimeters = inches * 2.54;

        //принтираме
        System.out.println(centimeters);

    }
}
