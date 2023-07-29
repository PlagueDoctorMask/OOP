package OOP.task1;

interface Action{ 

    public void play(String toy);

    default void pet() {
        System.out.println("Meeooow");
    }

}
