package L01FirstSteps040223.LAB;

import java.util.Scanner;

public class P06_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();


        System.out.printf("You are %s %s,f a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
