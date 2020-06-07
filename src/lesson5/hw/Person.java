package lesson5.hw;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person() {
    }

    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Сотрудник "+name+" "+ position+" "+ email +" "+ phoneNumber+" "+ salary+" "+ age);
    }
}
