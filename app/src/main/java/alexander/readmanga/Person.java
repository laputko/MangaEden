package alexander.readmanga;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Привет! Я " +name+ ". Мне "+age;
    }
}
