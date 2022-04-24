package Creatures;

public class CreateObjects extends Human {
    public CreateObjects(String name, int age, char genger) {
        super(name, age, genger);
    }

    public static void main(String[] args) {

        Human ozer = new Human("Ozer", -21, 'M');
        System.out.println(ozer);


    }
}






