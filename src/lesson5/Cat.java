package lesson5;

public class Cat {
    // private package-private protected public

    private String name;
    private String color;
    private int age;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void jump() {
        System.out.println(name + " jump!");
    }

    public void sleep() {
        System.out.println(name + " sleep...");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("ќтрицательные значени€ дл€ возраста недопустимы " + age);
            return;
        }
        this.age = age;
    }
}
