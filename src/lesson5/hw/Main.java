package lesson5.hw;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Person("Игорь", "PR Manager", "igor@bestsoft.com", "7(495)932-66-37", 75000, 41);
        persons[1] = new Person("Анна", "Project Manager", "anna@bestsoft.com", "7(495)541-89-19", 110000, 32);
        persons[2] = new Person("Сергей", "Tester", "sergey@bestsoft.com", "7(495)348-16-00", 125000, 26);
        persons[3] = new Person("Диана", "Software Developer", "diana@bestsoft.com", "7(495)369-62-66", 150000, 29);
        persons[4] = new Person("Антон", "Senior Engineer", "anton@bestsoft.com", "7(495)988-61-60", 200000, 45);


        int i = 0;
        for (Person c : persons) {
            if (c.getAge() > 40) {
                i++;
                c.info();
            }
        }

        if (i == 0) {
            System.out.println("Нет сотрудников старше 40");
        }
    }
}
