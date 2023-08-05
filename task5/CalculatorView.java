package OOP.task5;

import java.util.Scanner;

public class CalculatorView {
    public void displayResult(double result) {
    System.out.println("Результат: " + result);
    }

    public double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double input = scanner.nextDouble();
        return input;
    }
}
