package lesson6.animals;

public class Animal {
    String name;
    String color;
    int age;

    final int LEG_COUNT = 4;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void jump() {
        System.out.println(name + " jump!!!");
    }

    public final void sleep() {
        System.out.println(name + " sleep...");
    }

    public void run() {
        System.out.println(name + " run ...");
    }

    public void voice() {
        System.out.println("Animal " + name + " voice...");
    }

//    public abstract void voice();


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
