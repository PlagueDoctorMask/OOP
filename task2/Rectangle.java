package OOP.task2;

public class Rectangle {
    
    private int width = 2;

    private int height = 1;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void DefaultConstructor(int width, int height){
        Rectangle Rectangle = new Rectangle(width, height);
    }

    public void Constructor(){
        Rectangle Rectangle = new Rectangle(GetWidth(), GetHeight());
    }    

    public int GetWidth(){
        return width;
    }
    
    public int GetHeight(){
        return height;
    }

    public void SetWidth(int width) {
        this.width = width;
    }
    
    public void SetHeight(int height) {
        this.height = height;
    }

    public void calculateArea(){
        System.out.println(GetHeight()*GetWidth());
    }

    public void calculatePerimeter(){
        System.out.println(2*(GetHeight()+GetWidth()));
    }

}
