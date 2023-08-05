package OOP.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        boolean action = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите действие:\n1)Сложение\n2)Вычитание\n3)Умножение\n4)Деление\n5)Выход");
            int count = scanner.nextInt();
            if (count == 1) {
                presenter.onAddButtonClicked();
            }
            if (count == 2) {
                presenter.onsubtractionButtonClicked();
            }
            if (count == 3) {
                presenter.onmultiplicationButtonClicked();
            }
            if (count == 4) {
                presenter.ondivisionButtonClicked();
            }
            if (count == 5) {
                action = false;
            }
        } while(action);
        
        
    }
}
