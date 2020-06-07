package lesson7;

public class Cat {
    private String name;
    private boolean full;
    private int appetite;

    {
        full = false;
        appetite = 10;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)){
            System.out.println(name + " eat...");
            full = true;
        }else {
            System.out.println(name + " not eat...");
        };
    }

    public void fear(Dog dog) {
        System.out.println(name + " fear " + dog.getName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", full=" + full +
                '}';
    }
}
