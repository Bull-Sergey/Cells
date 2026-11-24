import java.util.Objects;

public class Cell {
    private final int x;
    private final int y;
    private final String color;

    public Cell(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Cell{x=%d, y=%d, color='%s'}", x, y, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return x == cell.x && y == cell.y && Objects.equals(color, cell.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}

