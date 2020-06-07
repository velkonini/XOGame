package lesson7;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (getSize() != box.getSize()) return false;
        return getColor() != null ? getColor().equals(box.getColor()) : box.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + getSize();
        return result;
    }
}
