package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    /**
     * Метод уменьшает количество еды в тарелке на
     *
     * @param amount количество уменьшаемой еды
     * @return возращает true если удалось уменьшить
     * false если при попытке уменьшения получилось бы < 0
     */
    public boolean decreaseFood(int amount) {
        if (food < amount) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public void affFood(int amount) {
        food += amount;
    }

}
