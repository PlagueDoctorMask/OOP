package OOP.task1;

public interface Action{ //дефолт-метод, чтобы гладить котов
    public default void pet() {
        System.out.println("Meeooow");
    }
}
