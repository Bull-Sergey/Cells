public class ManhattanIDistance implements IDistCalc {
    @Override
    public double calculate(Cell a, Cell b) {
        return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY());
    }
}
