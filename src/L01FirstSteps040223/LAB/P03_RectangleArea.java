package L01FirstSteps040223.LAB;

import java.util.Scanner;

public class P03_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме входните данни
        //2. Изчисляваме лицето на правоъгълника
        //3. Принтираме резултата.
         int a = Integer.parseInt(scanner.nextLine());
         int b = Integer.parseInt(scanner.nextLine());

         int result = a * b;
        System.out.println(result);
    }
}
