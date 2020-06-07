package lesson7;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void gav(Cat cat) {
        System.out.println(name + " Gav Gav!!! " + cat.getName());
        cat.fear(this);
    }
}
