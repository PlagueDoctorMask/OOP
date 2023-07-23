package OOP.task1;

public class Cat {
    
private String name;

private int Age;

public final int NumOfLives = 9; //константа

public String GetName(){
    return name;
}

public int GetAge(){
    return Age;
}

public void SetName(String name) {
    this.name = name;
}

public void SetAge(int Age) {
    this.Age = Age;
}

@Override
public String toString(){//Переопределение
    Owner Name = new Owner();
    return "Мяу, "+" меня зовут "+GetName()+", мне"+" "+GetAge()+" мой владелец - "+ Name.GetName();
     
}


public void feedMe(String name){//Метод, чтоб попросить еды :D
    System.out.println("hi, "+name+", could u feed me, im a little hungry");
}

public void feedMe(String name, int years){//Метод, чтоб попросить еды немного жалобней(перегрузка)
    System.out.println("hi, dear, "+name+", could u feed me, i have not been eating for"+years+" years");
}

}


