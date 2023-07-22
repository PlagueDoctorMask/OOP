package OOP.task1;

public class Cat {
    
private String name;

private int Age;

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

public void Greet(){
    Owner Name = new Owner();
    System.out.println("Мяу, "+" меня зовут "+GetName()+", мне"+" "+GetAge()+" мой владелец - "+ Name.GetName());
}

}


