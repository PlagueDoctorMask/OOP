package OOP.task1;

public class Cat implements Action, Comparable<Cat>{
    
private String Name;

private int Age;

private String OwnerName;

public final int NumOfLives = 9;

public Cat(String Name, int Age, String OwnerName){
    this.Name = Name;
    this.Age = Age;
}

public void Constructor(){
    Cat cat = new Cat(GetName(), GetAge(), GetOwnerName());
}

public String GetOwnerName(){
    return OwnerName;
}

public void SetOwnerName(String OwnerName) {
    this.OwnerName = OwnerName;
}

public String GetName(){
    return Name;
}

public int GetAge(){
    return Age;
}

public void SetName(String Name) {
    this.Name = Name;
}

public void SetAge(int Age) {
    this.Age = Age;
}

@Override
public String toString(){
    return "Мяу, "+" меня зовут "+GetName()+", мне"+" "+GetAge()+" мой владелец - "+ GetOwnerName();
     
}

public int compareTo(Cat cat1){//Реализация Comparable<Cat>
    if (this.Age == cat1.Age) {
        return 0;
    } else if (this.Age < cat1.Age) {
        return -1;
    } else {
        return 1;
    }
}




public void play(String toy){//реализация интерфейса
    System.out.println("Generation of happiness by playing with "+toy);
}

public void askForFood(String name){
    System.out.println("hi, "+name+", could u feed me, im a little hungry");
}

public void askForFood(String name, int yearsWithoutFood){
    System.out.println("hi, dear, "+name+", could u feed me, i have not been eating for"+yearsWithoutFood+" years");
}

}


