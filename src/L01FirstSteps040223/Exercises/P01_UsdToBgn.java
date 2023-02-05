package L01FirstSteps040223.Exercises;

import java.util.Scanner;

public class P01_UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}
