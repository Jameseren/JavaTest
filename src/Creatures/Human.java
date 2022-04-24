package Creatures;

public class Human {
    private String name;
    private int age;
    private char gender; // M or Female

    public Human(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setgender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid Age");
        }else {
            this.age = age;
        }

    }

    public char getgender() {
        return gender;
    }

    public void setgender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Variables:
            name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */
