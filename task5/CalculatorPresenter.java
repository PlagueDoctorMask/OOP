package OOP.task5;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();

        model.add(number1, number2);
        double result = model.getResult();

        view.displayResult(result);
    }

    public void onsubtractionButtonClicked(){
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();

        model.subtraction(number1, number2);
        double result = model.getResult();

        view.displayResult(result);
    }
    
    public void onmultiplicationButtonClicked(){
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();

        model.subtraction(number1, number2);
        double result = model.getResult();

        view.displayResult(result);
    }

    public void ondivisionButtonClicked(){
        double number1 = view.getUserInput();
        double number2 = view.getUserInput();

        if (number2!=0) {
            model.subtraction(number1, number2);
            double result = model.getResult();

            view.displayResult(result);
        }
        else{
            System.out.println("Нельзя на 0 делить!!!!!!\nЕщё раз сюда 0 впишешь, я с ошибкой вывалюсь!");
        }
        
    }
}
