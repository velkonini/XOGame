package lesson6.animals;

public class Cat extends Animal {
    int liveCount;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name, String color, int age, int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;
    }

    @Override
    public void voice() {
        System.out.println(name + " meow!");
    }

    public int getLiveCount() {
        return liveCount;
    }


    @Override
    public String toString() {
        return "Cat : " +
                "name= '" + name + '\'' +
                ", color= '" + color + '\'' +
                ", age= " + age +
                ", liveCount= " + liveCount
                ;
    }
}
